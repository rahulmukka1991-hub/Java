# Java Fundamentals — Concept-Wise Practice Exercises

## 📌 About This Repository

This repository contains **60 Java programming exercises** organized into three core concepts:

1. Access Specifiers
2. Conditional Statements
3. Loop Statements

The goal is to strengthen Java fundamentals through hands-on programming exercises, logical problem-solving, and practical examples.

## 🎯 Learning Objectives

- Understand Java access control and encapsulation.
- Apply conditional statements to solve decision-making problems.
- Use loops to perform repetitive operations efficiently.
- Improve logical thinking and programming skills.
- Practice writing, compiling, testing, and debugging Java programs.

## 🛠️ Requirements

- Java Development Kit (JDK 8 or later)
- Any Java IDE, such as IntelliJ IDEA, Eclipse, or VS Code
- Basic knowledge of Java syntax, variables, data types, classes, and objects

## 📂 Suggested Project Structure

```
java-fundamentals-exercises/
├── README.md
├── access-specifiers/
│   ├── Question01.java
│   ├── Question02.java
│   └── ...
├── conditional-statements/
│   ├── Question01.java
│   ├── Question02.java
│   └── ...
└── loop-statements/
    ├── Question01.java
    ├── Question02.java
    └── ...

```

---

# Group 1: Access Specifiers — 20 Exercises

## Concepts Covered

- `public`
- `private`
- `protected`
- Default access (package-private)
- Getters and setters
- Encapsulation
- Access across classes and packages
- Constructors and inheritance

### Question 1: Public Access Modifier

**Objective:** Understand how public members can be accessed from other classes.

**Task:** Create a `Student` class with public variables `name` and `age`. Create an object in another class and display their values.

**Requirements:**

- Declare the variables using `public`.
- Create a `Student` object in the main method.
- Assign values and print them.

**Expected behavior:** The variables can be accessed directly from another class.

### Question 2: Private Access Modifier

**Objective:** Understand how private members restrict direct access.

**Task:** Create an `Employee` class with a private variable `salary`. Attempt to access it directly from another class.

**Requirements:**

- Declare `salary` as private.
- Attempt direct access.
- Observe and understand the compilation error.
- Correct the design by providing a public method to access the salary.

**Expected behavior:** Direct access from another class fails to compile.

### Question 3: Getters and Setters

**Objective:** Learn controlled access to private variables.

**Task:** Create a `Person` class with private variables `name` and `age`.

**Requirements:**

- Create public getter and setter methods.
- Set values using setters.
- Retrieve values using getters.

**Expected behavior:** Private fields can be accessed through public methods.

### Question 4: Default Access Modifier

**Objective:** Understand package-private accessibility.

**Task:** Create a class with a variable that has no explicit access modifier.

**Requirements:**

- Declare a default-access variable.
- Access it from another class in the same package.
- Observe its accessibility from a class in a different package.

**Expected behavior:** The variable is accessible within the same package but not from an unrelated class in another package.

### Question 5: Protected Access Modifier

**Objective:** Understand protected members and inheritance.

**Task:** Create a parent class `Vehicle` with a protected variable `brand`. Create a subclass `Car` that accesses the variable.

**Requirements:**

- Declare `brand` as protected.
- Extend `Vehicle` using `Car`.
- Access the inherited variable in the subclass.

**Expected behavior:** The subclass can access the protected member, subject to Java's inheritance and package access rules.

### Question 6: Public Methods

**Objective:** Practice accessing public methods across classes.

**Task:** Create a `Calculator` class with a public method `add(int a, int b)`.

**Requirements:**

- Return the sum of two integers.
- Call the method from another class.
- Display the result.

**Expected behavior:** The method returns the correct sum.

### Question 7: Private Methods

**Objective:** Understand private method accessibility.

**Task:** Create a class with a private method named `displayMessage()`.

**Requirements:**

- Attempt to call the method from another class.
- Observe the compilation error.
- Add a public method that calls the private method internally.

**Expected behavior:** The private method can be called inside its own class but not directly from another class.

### Question 8: Compare All Four Access Levels

**Objective:** Understand the differences between access modifiers.

**Task:** Create a class containing public, private, protected, and default-access variables.

**Requirements:**

- Assign different values to all four variables.
- Attempt to access them from the same class, another class in the same package, and classes in different packages.
- Document which accesses compile.

**Expected behavior:** Accessibility follows Java's access control rules.

### Question 9: Student Data Encapsulation

**Objective:** Apply encapsulation to student information.

**Task:** Create a `Student` class containing private fields `name`, `age`, and `marks`.

**Requirements:**

- Provide getters and setters.
- Validate that age is positive.
- Restrict marks to the range 0–100.
- Display student information.

**Expected behavior:** Invalid values are rejected.

### Question 10: Employee Salary Management

**Objective:** Protect sensitive employee data.

**Task:** Create an `Employee` class with a private salary field.

**Requirements:**

- Provide a method to update salary.
- Reject negative salary values.
- Provide a method to display salary.
- Test valid and invalid updates.

**Expected behavior:** Salary can be changed only through controlled methods.

### Question 11: Bank Account Encapsulation

**Objective:** Protect financial data using access modifiers.

**Task:** Create a `BankAccount` class with a private balance.

**Requirements:**

- Implement `deposit()`.
- Implement `withdraw()`.
- Implement `checkBalance()`.
- Reject invalid deposit and withdrawal amounts.
- Prevent withdrawals exceeding the available balance.

**Expected behavior:** Account operations maintain a valid balance.

### Question 12: Protected Method Inheritance

**Objective:** Practice inherited protected methods.

**Task:** Create a parent class with a protected method `displayDetails()`. Call it from a subclass.

**Requirements:**

- Define the protected method.
- Create a child class.
- Invoke the inherited method.
- Display the output.

**Expected behavior:** The child class can invoke the inherited protected method.

### Question 13: Same-Package Access

**Objective:** Understand package-private access.

**Task:** Create two classes in the same package. Declare a default-access variable in one class and access it from the other.

**Requirements:**

- Use the same package declaration.
- Do not specify an access modifier for the variable.
- Test direct access.

**Expected behavior:** Access succeeds within the same package.

### Question 14: Public Access Across Packages

**Objective:** Understand cross-package accessibility.

**Task:** Create a public class in one package and access it from another package.

**Requirements:**

- Declare the class and required member as public.
- Import the class into the second package.
- Create an object and call its public method.

**Expected behavior:** Public members are accessible across packages when the class is accessible.

### Question 15: Protected Access Across Packages

**Objective:** Understand protected access in subclasses.

**Task:** Create a parent class in one package and a subclass in another package.

**Requirements:**

- Declare a protected field in the parent class.
- Extend the parent class.
- Access the field through the subclass in a manner permitted by Java's protected access rules.
- Compare with access from an unrelated class.

**Expected behavior:** Subclass access is permitted under the cross-package protected rules, but unrelated direct access is not.

### Question 16: Private Constructor

**Objective:** Understand constructor accessibility.

**Task:** Create a class with a private constructor.

**Requirements:**

- Attempt to instantiate it from another class.
- Observe the compilation error.
- Investigate how a public static factory method can create and return an instance.

**Expected behavior:** Direct construction from an unrelated class is restricted.

### Question 17: User Information Protection

**Objective:** Protect sensitive user information.

**Task:** Create a `User` class with private fields for `username` and `password`.

**Requirements:**

- Provide a public getter for the username.
- Do not expose the password through a getter.
- Provide a method to validate a supplied password.
- Avoid printing the password.

**Expected behavior:** The password is not directly exposed through the class interface.

### Question 18: Car Speed Management

**Objective:** Use access modifiers to control object state.

**Task:** Create a `Car` class with a private speed variable.

**Requirements:**

- Implement `accelerate()`.
- Implement `brake()`.
- Prevent negative speed.
- Provide a method to display the current speed.

**Expected behavior:** Speed changes only through controlled methods.

### Question 19: Library Book Management

**Objective:** Apply encapsulation to a collection of objects.

**Task:** Create a `Library` class with private book inventory.

**Requirements:**

- Implement methods to add and remove books.
- Provide a method to display available books.
- Prevent unauthorized direct modification of the inventory.

**Expected behavior:** Book inventory is managed through the class's public methods.

### Question 20: Mini Banking Application

**Objective:** Combine access modifiers in a practical application.

**Task:** Build a small banking application using multiple classes.

**Requirements:**

- Create account and customer classes.
- Use private fields for sensitive information.
- Use public methods for account operations.
- Use protected members where inheritance genuinely requires them.
- Demonstrate package-private access.
- Test deposits, withdrawals, and balance inquiries.

**Expected behavior:** The application demonstrates appropriate access control and encapsulation.

---

# Group 2: Conditional Statements — 20 Exercises

## Concepts Covered

- `if`
- `if-else`
- `else-if`
- Nested `if`
- `switch`
- Ternary operator
- Relational operators
- Logical operators
- Validation and decision-making

### Question 1: Positive, Negative, or Zero

**Objective:** Use basic conditional statements.

**Task:** Read an integer and determine whether it is positive, negative, or zero.

**Requirements:**

- Accept an integer.
- Use `if-else-if`.
- Display the appropriate classification.

**Expected behavior:**

- Input `10` → Positive
- Input `-5` → Negative
- Input `0` → Zero

### Question 2: Even or Odd

**Objective:** Practice the modulus operator.

**Task:** Check whether a given integer is even or odd.

**Requirements:**

- Read an integer.
- Use the remainder operator `%`.
- Display the result.

**Expected behavior:**

- Input `8` → Even
- Input `7` → Odd

### Question 3: Greatest of Two Numbers

**Objective:** Compare values using conditions.

**Task:** Read two numbers and display the greater number.

**Requirements:**

- Use `if-else`.
- Handle the case where both numbers are equal.

**Expected behavior:** The program correctly identifies the greater value or reports equality.

### Question 4: Greatest of Three Numbers

**Objective:** Apply multiple conditions.

**Task:** Find the greatest of three integers.

**Requirements:**

- Accept three inputs.
- Use `if-else-if` or nested conditions.
- Handle equal values correctly.

**Expected behavior:** The largest value is displayed.

### Question 5: Voting Eligibility

**Objective:** Use conditions for eligibility checks.

**Task:** Determine whether a person is eligible to vote based on age.

**Requirements:**

- Read the person's age.
- Use 18 as the minimum age.
- Reject negative ages.

**Expected behavior:** An age of 18 or greater qualifies under the exercise's rule.

### Question 6: Leap Year

**Objective:** Practice compound logical conditions.

**Task:** Determine whether a year is a leap year.

**Requirements:**

- A year divisible by 400 is a leap year.
- Otherwise, a year divisible by 100 is not a leap year.
- Otherwise, a year divisible by 4 is a leap year.
- Other years are not leap years.

**Expected behavior:**

- 2000 → Leap year
- 1900 → Not a leap year
- 2024 → Leap year

### Question 7: Vowel or Consonant

**Objective:** Use character comparisons.

**Task:** Determine whether an English alphabet character is a vowel or consonant.

**Requirements:**

- Accept a character.
- Handle uppercase and lowercase letters.
- Reject characters that are not English alphabet letters.

**Expected behavior:** The program identifies vowels and consonants correctly.

### Question 8: Student Grade Calculator

**Objective:** Use an `else-if` ladder.

**Task:** Assign a grade based on marks.

**Requirements:**

- A: 90–100
- B: 80–89
- C: 70–79
- D: 60–69
- F: Below 60
- Reject marks outside 0–100.

**Expected behavior:** The program displays the correct grade.

### Question 9: Divisibility Check

**Objective:** Practice logical AND.

**Task:** Determine whether an integer is divisible by both 5 and 11.

**Requirements:**

- Use `%`.
- Combine conditions using `&&`.

**Expected behavior:**

- Input `55` → Divisible by both
- Input `25` → Not divisible by both

### Question 10: Valid Triangle

**Objective:** Apply multiple mathematical conditions.

**Task:** Determine whether three positive side lengths can form a triangle.

**Requirements:**

- All side lengths must be positive.
- The sum of any two sides must exceed the third side.

**Expected behavior:** The program identifies valid and invalid triangles.

### Question 11: Triangle Classification

**Objective:** Combine validation and decision-making.

**Task:** Classify a valid triangle as equilateral, isosceles, or scalene.

**Requirements:**

- Validate the three side lengths.
- Equilateral: all sides equal.
- Isosceles: at least two sides equal.
- Scalene: all sides different.

**Expected behavior:** The program displays the correct triangle type or reports invalid sides.

### Question 12: Simple Calculator Using Switch

**Objective:** Practice `switch` statements.

**Task:** Build a calculator that performs addition, subtraction, multiplication, and division.

**Requirements:**

- Accept two numbers.
- Accept an operator.
- Use `switch`.
- Handle division by zero and invalid operators.

**Expected behavior:** The selected arithmetic operation is performed correctly.

### Question 13: Character Classification

**Objective:** Combine relational and logical operators.

**Task:** Identify whether a character is uppercase, lowercase, a digit, or a special character.

**Requirements:**

- Read one character.
- Use conditional statements.
- Display the corresponding category.

**Expected behavior:** The character is classified correctly.

### Question 14: Electricity Bill Calculator

**Objective:** Apply conditions to a billing problem.

**Task:** Calculate an electricity bill using consumption slabs.

**Requirements:**

- Define the rates for each consumption range.
- Calculate the bill based on the specified slab rules.
- Reject negative consumption.
- Clearly state whether the tariff is progressive or flat-rate per slab.

**Expected behavior:** The bill is calculated according to the selected tariff rules.

### Question 15: Login Validation

**Objective:** Use multiple conditions for authentication logic.

**Task:** Validate a username and password against predefined sample credentials.

**Requirements:**

- Store sample credentials in variables.
- Compare the supplied username and password.
- Display success or failure.
- Do not print passwords.

**Expected behavior:** Only matching sample credentials pass validation. This exercise is for learning, not production authentication.

### Question 16: Discount Calculator

**Objective:** Practice nested conditions.

**Task:** Calculate a purchase discount based on purchase amount and membership status.

**Requirements:**

- Define discount rules.
- Check the purchase amount.
- Apply membership-based discounts where applicable.
- Reject negative purchase amounts.

**Expected behavior:** The final discount and payable amount are displayed.

### Question 17: ATM Menu

**Objective:** Combine menu selection and conditional statements.

**Task:** Create a simple ATM menu.

**Requirements:**

- Option 1: Balance inquiry
- Option 2: Deposit
- Option 3: Withdrawal
- Option 4: Exit
- Validate transaction amounts.
- Prevent withdrawals beyond the balance.

**Expected behavior:** The selected action is executed correctly.

### Question 18: Income Tax Calculator

**Objective:** Apply conditional tax brackets.

**Task:** Calculate tax based on annual taxable income.

**Requirements:**

- Define explicit tax brackets and rates.
- Specify the assumed currency and tax rules.
- Calculate tax progressively, if progressive brackets are used.
- Reject negative income.

**Expected behavior:** The program calculates tax using the documented exercise rules.

### Question 19: Date Validation

**Objective:** Combine multiple conditional checks.

**Task:** Determine whether a date is valid.

**Requirements:**

- Accept day, month, and year.
- Validate the month.
- Account for different month lengths.
- Apply leap-year rules to February.

**Expected behavior:**

- `29/02/2024` → Valid
- `29/02/2023` → Invalid
- `31/04/2024` → Invalid

### Question 20: Quadratic Equation Roots

**Objective:** Apply mathematical conditions.

**Task:** Find the roots of the equation `ax² + bx + c = 0`.

**Requirements:**

- Calculate the discriminant: `D = b² - 4ac`.
- If `D > 0`, calculate two distinct real roots.
- If `D = 0`, calculate one repeated real root.
- If `D < 0`, calculate complex roots.
- Handle `a = 0` separately as a linear or degenerate equation.

**Expected behavior:** The program reports the appropriate roots based on the equation's coefficients.

---

# Group 3: Loop Statements — 20 Exercises

## Concepts Covered

- `for` loop
- `while` loop
- `do-while` loop
- Nested loops
- `break`
- `continue`
- Counters and accumulators
- Number manipulation
- Pattern printing

### Question 1: Print Numbers from 1 to 100

**Objective:** Understand basic `for` loop syntax.

**Task:** Print all integers from 1 to 100.

**Requirements:**

- Initialize a counter.
- Set the loop condition.
- Increment the counter.

**Expected behavior:** Numbers from 1 through 100 are displayed in order.

### Question 2: Print Even Numbers

**Objective:** Combine loops with arithmetic.

**Task:** Print all even numbers between 1 and 100.

**Requirements:**

- Use a loop.
- Identify even numbers using `%` or increment by 2.
- Display the results.

**Expected behavior:** The output contains all even numbers from 2 through 100.

### Question 3: Print Odd Numbers Using While

**Objective:** Practice `while` loop syntax.

**Task:** Print all odd numbers between 1 and 100.

**Requirements:**

- Use a `while` loop.
- Initialize and update the counter.
- Avoid infinite loops.

**Expected behavior:** The output contains all odd numbers from 1 through 99.

### Question 4: Sum from 1 to N

**Objective:** Practice accumulators.

**Task:** Calculate the sum of integers from 1 to N.

**Requirements:**

- Read a non-negative integer N.
- Initialize the sum.
- Add each integer using a loop.
- Handle N = 0.

**Expected behavior:** For N = 5, the result is 15.

### Question 5: Multiplication Table

**Objective:** Use loops for repeated calculations.

**Task:** Print the multiplication table of a given integer from 1 to 10.

**Requirements:**

- Read an integer.
- Use a loop from 1 through 10.
- Display each multiplication expression and result.

**Expected behavior:** For input 5, the table ranges from `5 x 1 = 5` to `5 x 10 = 50`.

### Question 6: Factorial

**Objective:** Practice cumulative multiplication.

**Task:** Calculate the factorial of a non-negative integer.

**Requirements:**

- Read an integer N.
- Initialize the result to 1.
- Multiply the result by integers from 1 to N.
- Handle `0! = 1`.
- Consider overflow for large values.

**Expected behavior:** For N = 5, the result is 120.

### Question 7: Count Digits

**Objective:** Practice digit extraction.

**Task:** Count the number of digits in an integer.

**Requirements:**

- Use a `while` loop.
- Extract digits using division or remainder.
- Treat zero as having one digit.
- Decide how to handle negative integers.

**Expected behavior:** The input 12345 produces a digit count of 5.

### Question 8: Reverse a Number

**Objective:** Practice arithmetic inside loops.

**Task:** Reverse the digits of an integer.

**Requirements:**

- Extract the last digit using `% 10`.
- Append it to a result.
- Remove the last digit using integer division.
- Consider negative values and overflow.

**Expected behavior:** The input 1234 produces 4321.

### Question 9: Palindrome Number

**Objective:** Combine loops and comparisons.

**Task:** Determine whether an integer reads the same forward and backward.

**Requirements:**

- Reverse the number using a loop.
- Compare the reversed value with the original.
- Define how negative numbers should be treated.

**Expected behavior:**

- Input 121 → Palindrome
- Input 123 → Not a palindrome

### Question 10: Prime Number Check

**Objective:** Practice divisibility testing.

**Task:** Determine whether an integer is prime.

**Requirements:**

- Numbers less than 2 are not prime.
- Test possible divisors using a loop.
- Stop once a divisor is found or the square root has been exceeded.

**Expected behavior:**

- Input 7 → Prime
- Input 9 → Not prime

### Question 11: Prime Numbers Between 1 and N

**Objective:** Combine loops and conditions.

**Task:** Print all prime numbers between 1 and N.

**Requirements:**

- Read N.
- Iterate through candidate numbers.
- Test each candidate for primality.
- Display all primes found.

**Expected behavior:** For N = 10, the output is 2, 3, 5, 7.

### Question 12: Fibonacci Sequence

**Objective:** Practice updating multiple variables.

**Task:** Generate the first N terms of the Fibonacci sequence.

**Requirements:**

- Define the first two terms as 0 and 1.
- Update the previous and current terms on each iteration.
- Handle N = 0 and N = 1.
- Consider integer overflow.

**Expected behavior:** For N = 7, the output is 0, 1, 1, 2, 3, 5, 8.

### Question 13: Sum of Digits

**Objective:** Extract and accumulate digits.

**Task:** Calculate the sum of the digits of an integer.

**Requirements:**

- Extract each digit using `% 10`.
- Add each digit to a sum.
- Remove the last digit using division.
- Decide how negative numbers should be handled.

**Expected behavior:** For input 1234, the result is 10.

### Question 14: Right-Angled Star Pattern

**Objective:** Practice nested loops.

**Task:** Print a right-angled triangle of stars for N rows.

**Requirements:**

- Use an outer loop for rows.
- Use an inner loop for stars.
- Print a new line after each row.

**Expected output for N = 4:**

```
*
**
***
****

```

### Question 15: Armstrong Number

**Objective:** Combine digit extraction and exponentiation.

**Task:** Determine whether a non-negative integer is an Armstrong number.

**Requirements:**

- Count the number of digits.
- Raise each digit to that count.
- Sum the powers.
- Compare the sum with the original number.

**Expected behavior:**

- Input 153 → Armstrong number
- Input 123 → Not an Armstrong number

### Question 16: Perfect Number

**Objective:** Practice divisor calculations.

**Task:** Determine whether a positive integer equals the sum of its proper positive divisors.

**Requirements:**

- Find proper divisors using a loop.
- Add the divisors.
- Compare the sum with the original number.

**Expected behavior:**

- Input 6 → Perfect number, because 1 + 2 + 3 = 6
- Input 8 → Not a perfect number

### Question 17: Pyramid Star Pattern

**Objective:** Practice nested loops with spaces.

**Task:** Print a centered pyramid of stars for N rows.

**Requirements:**

- Use an outer loop for rows.
- Print leading spaces.
- Print the appropriate number of stars.
- Move to a new line after each row.

**Expected output for N = 4:**

```
   *
  ***
 *****
*******

```

### Question 18: Number Triangle Pattern

**Objective:** Combine nested loops and counters.

**Task:** Print a number triangle where each row contains integers from 1 to the row number.

**Requirements:**

- Use an outer loop for rows.
- Use an inner loop for numbers.
- Display each row on a separate line.

**Expected output for N = 4:**

```
1
12
123
1234

```

### Question 19: Sum and Average Until Zero

**Objective:** Practice sentinel-controlled loops.

**Task:** Repeatedly accept integers until the user enters zero. Then display the count, sum, and average of the nonzero inputs.

**Requirements:**

- Use a `while` or `do-while` loop.
- Stop when zero is entered.
- Track count and sum.
- Avoid division by zero when no nonzero inputs are entered.

**Expected behavior:** For inputs 10, 20, 30, 0, the count is 3, the sum is 60, and the average is 20.

### Question 20: Number-Guessing Game

**Objective:** Combine loops, conditions, and user input.

**Task:** Create a game where the player guesses a predefined secret number.

**Requirements:**

- Define a secret number.
- Repeatedly accept guesses.
- Display "Too high" or "Too low".
- Stop when the guess is correct.
- Set a maximum attempt limit.
- Report whether the player won or lost.

**Expected behavior:** The game continues until the correct guess or the attempt limit is reached.

---

# ✅ General Practice Guidelines

For every exercise:

1. Create a separate Java class or source file.
2. Write the solution without copying existing code.
3. Compile and run the program.
4. Test normal inputs, boundary cases, and invalid inputs.
5. Review compiler errors and correct them.
6. Add comments explaining important logic.
7. Commit completed exercises to version control if using Git.

## 📈 Recommended Learning Order

1. Complete the 20 Access Specifier exercises.
2. Complete the 20 Conditional Statement exercises.
3. Complete the 20 Loop Statement exercises.
4. Combine all three concepts in small Java projects.
5. Refactor the code to improve readability and validation.

## 🏁 Final Goal

By completing all 60 exercises, you should be able to apply Java access control, implement decision-making logic, and solve common iterative programming problems.

**Practice consistently, understand the logic behind each solution, and write the code yourself.**