-- Using operators in WHERE clause:

-- ARITHMETIC OPERATORS : +, -, * /, %
-- COMAPARISION OPERATORS: = , !=, >, >=, < ,<=
-- LOGICAL OPERATORS: AND, OR, NOT, IN , BETWEEN, ALL, LIKE, ANY
-- BITWISE OPERTORS: &, |

USE COLLEGE;
SELECT * FROM STUDENT
-- WHERE MARKS+10 > 100; -- marks of those students when added with 10 will go more than 100
WHERE MARKS = 80;

-- Logical operators:
-- AND : To check for both conditions to be true.
SELECT * FROM STUDENT WHERE MARKS > 80 AND CITY = "HASSAN";
-- OR: To check if one of the conditions is true.
SELECT * FROM STUDENT WHERE MARKS > 70 OR CITY = "Blg";
-- BETWEEN: Selects for given range
SELECT * FROM STUDENT WHERE MARKS BETWEEN 80 AND 100;
-- IN: Matches any value in the list
SELECT * FROM STUDENT WHERE NAME IN ("Hemalatha", "Sanjay");
-- NOT: To negate the given condition
SELECT * FROM STUDENT WHERE NOT MARKS = 100;
SELECT * FROM STUDENT WHERE CITY NOT IN ("Blg");
