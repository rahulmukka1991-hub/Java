
"use strict";

document.addEventListener("DOMContentLoaded", () => {
    const API_URL = "/api/audit";

    const filterForm = document.getElementById("filterForm");
    const resetButton = document.getElementById("resetButton");
    const tableBody = document.getElementById("auditTableBody");
    const errorMessage = document.getElementById("errorMessage");
    const paginationInfo = document.getElementById("paginationInfo");
    const paginationControls = document.getElementById("paginationControls");
    const pageSizeSelect = document.getElementById("size");

    let currentPage = 0;
    let pageSize = Number(pageSizeSelect.value) || 10;
    let requestNumber = 0;

    function showError(message) {
        errorMessage.textContent = message;
        errorMessage.hidden = false;
    }

    function clearError() {
        errorMessage.textContent = "";
        errorMessage.hidden = true;
    }

    function showLoading() {
        tableBody.replaceChildren();

        const row = document.createElement("tr");
        const cell = document.createElement("td");

        cell.colSpan = 7;
        cell.className = "empty-state";
        cell.textContent = "Loading audit records...";

        row.appendChild(cell);
        tableBody.appendChild(row);
    }

    function showEmpty(message) {
        tableBody.replaceChildren();

        const row = document.createElement("tr");
        const cell = document.createElement("td");

        cell.colSpan = 7;
        cell.className = "empty-state";
        cell.textContent = message;

        row.appendChild(cell);
        tableBody.appendChild(row);
    }

    function getValue(record, ...keys) {
        for (const key of keys) {
            if (
                record[key] !== undefined &&
                record[key] !== null
            ) {
                return record[key];
            }
        }

        return "";
    }

    function formatDate(value) {
        if (!value) {
            return "—";
        }

        // Supports ISO dates and ISO date-time strings.
        const datePart = String(value).slice(0, 10);

        if (!/^\d{4}-\d{2}-\d{2}$/.test(datePart)) {
            return String(value);
        }

        const [year, month, day] = datePart.split("-");

        return `${day}/${month}/${year}`;
    }

    function createBadge(value, type) {
        const badge = document.createElement("span");
        const normalized = String(value || "").trim().toLowerCase();

        badge.classList.add("badge");

        if (type === "process") {
            badge.classList.add("badge-process");
        } else if (type === "region") {
            const regionClasses = {
                "latam": "badge-latam",
                "nam": "badge-nam",
                "apac": "badge-apac",
                "emea": "badge-emea"
            };

            badge.classList.add(
                regionClasses[normalized] || "badge-latam"
            );
        } else if (type === "status") {
            badge.classList.add("badge-status");

            const statusClasses = {
                "completed": "badge-completed",
                "rejected": "badge-rejected",
                "expired": "badge-expired"
            };

            const statusClass = statusClasses[normalized];

            if (statusClass) {
                badge.classList.add(statusClass);
            }
        }

        badge.textContent = value || "—";

        return badge;
    }

    function createCell(value) {
        const cell = document.createElement("td");
        cell.textContent =
            value === undefined ||
            value === null ||
            value === ""
                ? "—"
                : String(value);

        return cell;
    }

    function renderRecords(records) {
        tableBody.replaceChildren();

        if (!Array.isArray(records) || records.length === 0) {
            showEmpty("No audit records found.");
            return;
        }

        const fragment = document.createDocumentFragment();

        records.forEach((record) => {
            const row = document.createElement("tr");

            const name = getValue(record, "name", "id");
            const processName = getValue(record, "processName");
            const region = getValue(record, "region");
            const status = getValue(
                record,
                "inboxStatus",
                "status"
            );
            const reason = getValue(record, "reason");
            const maker = getValue(
                record,
                "maker",
                "createdBy",
                "userName",
                "username"
            );
            const processingDate = getValue(
                record,
                "processingDate"
            );

            // Name
            row.appendChild(createCell(name));

            // Process name
            const processCell = document.createElement("td");
            processCell.appendChild(
                createBadge(processName, "process")
            );
            row.appendChild(processCell);

            // Region
            const regionCell = document.createElement("td");
            regionCell.appendChild(
                createBadge(region, "region")
            );
            row.appendChild(regionCell);

            // Inbox status
            const statusCell = document.createElement("td");
            statusCell.appendChild(
                createBadge(status, "status")
            );
            row.appendChild(statusCell);

            // Reason
            row.appendChild(createCell(reason));

            // Maker
            row.appendChild(createCell(maker));

            // Processing date
            row.appendChild(
                createCell(formatDate(processingDate))
            );

            fragment.appendChild(row);
        });

        tableBody.appendChild(fragment);
    }

    function addPageButton(label, page, options = {}) {
        const button = document.createElement("button");

        button.type = "button";
        button.textContent = label;
        button.disabled = Boolean(options.disabled);

        if (options.active) {
            button.classList.add("active");
            button.setAttribute("aria-current", "page");
        }

        button.setAttribute(
            "aria-label",
            options.ariaLabel || `Page ${page + 1}`
        );

        button.addEventListener("click", () => {
            if (page !== currentPage) {
                loadAudits(page);
            }
        });

        paginationControls.appendChild(button);
    }

    function addEllipsis() {
        const span = document.createElement("span");

        span.className = "page-ellipsis";
        span.textContent = "…";
        span.setAttribute("aria-hidden", "true");

        paginationControls.appendChild(span);
    }

    function renderPagination(data) {
        paginationControls.replaceChildren();

        const totalElements = Number(data.totalElements ?? 0);
        const totalPages = Number(data.totalPages ?? 0);

        const page = Number(data.page ?? currentPage);
        currentPage = Number.isFinite(page) && page >= 0 ? page : 0;

        const firstItem = totalElements === 0
            ? 0
            : currentPage * pageSize + 1;

        const lastItem = totalElements === 0
            ? 0
            : Math.min(
                (currentPage + 1) * pageSize,
                totalElements
            );

        paginationInfo.textContent =
            `${firstItem}–${lastItem} of ${totalElements} items`;

        addPageButton("‹", currentPage - 1, {
            disabled: currentPage === 0,
            ariaLabel: "Previous page"
        });

        if (totalPages > 0) {
            const pages = new Set();

            // Always show the first and last pages.
            pages.add(0);
            pages.add(totalPages - 1);

            // Show nearby pages.
            for (
                let i = Math.max(0, currentPage - 1);
                i <= Math.min(totalPages - 1, currentPage + 1);
                i++
            ) {
                pages.add(i);
            }

            const sortedPages = [...pages].sort((a, b) => a - b);
            let previousPage = -1;

            sortedPages.forEach((page) => {
                if (previousPage !== -1 && page - previousPage > 1) {
                    addEllipsis();
                }

                addPageButton(String(page + 1), page, {
                    active: page === currentPage
                });

                previousPage = page;
            });
        }

        addPageButton("›", currentPage + 1, {
            disabled:
                totalPages === 0 ||
                currentPage >= totalPages - 1,
            ariaLabel: "Next page"
        });
    }

    function getFilterParams(page) {
        const params = new URLSearchParams(
            new FormData(filterForm)
        );

        params.set("page", String(page));
        params.set("size", String(pageSize));

        return params;
    }

    async function loadAudits(page = 0) {
        const thisRequest = ++requestNumber;

        clearError();

        const startDate = filterForm.elements.startDate.value;
        const endDate = filterForm.elements.endDate.value;

        if (startDate && endDate && startDate > endDate) {
            showError(
                "Start date must not be after end date."
            );
            showEmpty("Please correct the date range.");
            paginationInfo.textContent = "0 items";
            paginationControls.replaceChildren();
            return;
        }

        showLoading();

        try {
            const params = getFilterParams(page);

            const response = await fetch(
                `${API_URL}?${params.toString()}`,
                {
                    method: "GET",
                    headers: {
                        "Accept": "application/json"
                    }
                }
            );

            if (thisRequest !== requestNumber) {
                return;
            }

            const data = await response.json().catch(() => null);

            if (!response.ok) {
                throw new Error(
                    data?.message ||
                    `Unable to load audit records (HTTP ${response.status}).`
                );
            }

            if (!data || typeof data !== "object") {
                throw new Error(
                    "The server returned an invalid response."
                );
            }

            // Spring Data PageResponse or a wrapped records array.
            const records =
                data.content ??
                data.records ??
                data.items ??
                data.data ??
                [];

            if (!Array.isArray(records)) {
                throw new Error(
                    "The API response does not contain a records array."
                );
            }

            // Accommodate the custom AuditPageResponse metadata.
            const totalElements = Number(
                data.totalElements ?? records.length
            );

            const totalPages = Number(
                data.totalPages ??
                Math.ceil(totalElements / pageSize)
            );

            const responsePage = Number(data.page ?? page);

            const normalizedData = {
                totalElements,
                totalPages,
                page: responsePage
            };

            // Handle a page that became invalid after filtering.
            if (
                totalPages > 0 &&
                responsePage >= totalPages
            ) {
                return loadAudits(totalPages - 1);
            }

            currentPage = responsePage;

            renderRecords(records);
            renderPagination(normalizedData);

        } catch (error) {
            if (thisRequest !== requestNumber) {
                return;
            }

            console.error("Audit API error:", error);

            showError(
                error.message ||
                "An unexpected error occurred while loading audit records."
            );

            showEmpty("Unable to load audit records.");
            paginationInfo.textContent = "0 items";
            paginationControls.replaceChildren();
        }
    }

    filterForm.addEventListener("submit", (event) => {
        event.preventDefault();
        loadAudits(0);
    });

    resetButton.addEventListener("click", () => {
        filterForm.reset();
        pageSizeSelect.value = "10";
        pageSize = 10;
        loadAudits(0);
    });

    pageSizeSelect.addEventListener("change", () => {
        pageSize = Number(pageSizeSelect.value);

        if (![10, 25, 50].includes(pageSize)) {
            pageSize = 10;
            pageSizeSelect.value = "10";
        }

        loadAudits(0);
    });

    // Load the first page when the screen opens.
    loadAudits(0);
});
