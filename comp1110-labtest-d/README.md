### COMP1110 Lab Test

*No materials permitted*

The test will be marked out of 20. 
Your mark will be divided by 4 to give a final mark out of 5.

---

## Question 1 (5 Marks)

* Within the `comp1110.labtest` package of the `comp1110-labtest` project,
  find the class called `HelloWorld`.
This should appear as a file `HelloWorld` within a package `comp1110.labtest`.
This detail is important because the tests assume that your work appears in
exactly this location.
* Force JUnit to be added to your project's classpath if it is not already.  
Place your cursor within your `HelloWorld` class, and type `Ctrl+Shift+T` (or `Navigate` -> `Test`).
This should bring up the `Create Test` dialogue.  From the `Testing library:`
drop-down, select `JUnit4`.   Use the `Fix` button to add JUnit to your module.
In the next dialogue, stick with the default to use the library in the IntelliJ
distribution, and press OK.  You can then press `Cancel` at the bottom of the
`Create Test` dialogue (you don't actually need to create a test, you just want
to add JUnit to your path).
* Navigate to your `HelloWorld` class, and modify it so that its main
 method prints `Hello world!`.
* Test your `HelloWorld` class by selecting the `Q1 HelloWorld` option in the
  drop-down next to green arrow.
* Once your `HelloWorld` class passes the tests, commit it to your Git repo.

## Question 2 (5 Marks)

Within the `comp1110.labtest` package of the `comp1110-labtest` project,
create a class `Name` that reads in your name from the console
and then prints out your name in upper case (hint: use the
`toUpperCase()` method of `String`), and then on a new line,
print the number of characters in your name. e.g. if your
name is Bill the program should print out `BILL` on one line
and `4` on the next. Test your solution using the `Q2 Name`
test.

Once you have it working, add and commit your work.

## Question 3 (5 Marks)

Within the `comp1110.labtest` package of the `comp1110-labtest` project,
create a class `Even` that reads an integer (`n`) from the console and then
prints all the even numbers between 1 and n, inclusive of n, each on a new line.
Test your solution using the `Q3 Even` test.

Once you have it working, add and commit your work.

## Question 4 (5 Marks)

Within the `comp1110.labtest` package of the `comp1110-labtest` project,
create a class `Ones` that reads from the console a positive integer and prints
out the number of '1's in the underlining binary pattern representation. This
program need only work with positive numbers. e.g. The integer 5 has 2 '1's its
binary representation, so you would print out `2`. Test your solution using the
`Q4 Ones` test.

Once you have it working, add and commit your work.

---

*Once you have completed all of the questions, ask your tutor to mark your test. 
**Do not** log out of your computer until you have had your test marked.*

*Once your test has been marked by your tutor, you are free to log off and leave.*
