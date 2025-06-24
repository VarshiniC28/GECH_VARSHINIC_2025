-- SQL SUBQUERIES:
-- A subquery or inner query or a nested query is a query within another sql query.
-- It involves 2 select statements.

-- SYNTAX :
-- SELECT cols FROM table_name
-- WHERE col_name operator
-- (subquery);

-- There are 3 ways to write the subqurey:
-- 1. Inside Select
-- 2. Inside From
-- 3. Inside where clause - Most useful with syntax written above.

-- Example: 
-- Get names of all students who scored more than class average.
-- Step 1: Find the aavg of class
-- Step 2: Find the names of students with marks>avg

USE COLLEGE;
SELECT * FROM STUDENT;
ALTER TABLE STUDENT
CHANGE COLUMN FULL_NAME NAME VARCHAR(50);

-- 3. Writing subquery inside where clause:
SELECT AVG(MARKS) FROM STUDENT; -- TO KNOW ONLY THE AVERAGE OF ALL MARKS.

-- ANS: This below query is DYNAMIC QUERY not FIXED/STATIC since it gets updated automatically when there are any updations in table.
SELECT NAME, MARKS FROM STUDENT
WHERE MARKS > (SELECT AVG(MARKS) FROM STUDENT);

-- 2. Writing subquery inside FROM:
SELECT NAME , MARKS 
FROM STUDENT , (SELECT AVG(MARKS) AS AVG_MARKS FROM STUDENT) AS AVG_TABLE
WHERE MARKS > AVG_MARKS;

-- 1. Writing subquery inside SELECT
SELECT NAME ,marks, (SELECT AVG(MARKS) AS AVG_MARK FROM STUDENT)
FROM STUDENT
WHERE MARKS > AVG_MARK; -- Getting error

WITH avg_table AS (
  SELECT AVG(MARKS) AS avg_mark FROM STUDENT
)
SELECT NAME, MARKS FROM STUDENT, avg_table
WHERE MARKS > avg_mark;
-- -----------------------------------------------------------------------------------------------------------------------------

-- Lets see another example:
-- Find the names of all students with even roll numbers
-- step 1: Find the even roll numbers
-- step 2: Find the names of the students with even roll no.

SELECT NAME FROM STUDENT
WHERE ROLLNO % 2 = 0;

-- OR Using the subquery as given below:
SELECT NAME, ROLLNO FROM STUDENT
WHERE ROLLNO IN (SELECT ROLLNO FROM STUDENT WHERE ROLLNO %2=0);
-- ----------------------------------------------------------------------------------------------------------------------------

-- Example with from and select :
-- Find the max from the students of hassan
-- step 1: Find the students of hassan
-- step 2 : Find their max marks using the sublist in step 1.

-- NORMAL QUERY
SELECT MAX(MARKS) FROM STUDENT
WHERE CITY = "HASSAN";

-- SUBQUERY: from
SELECT MAX(MARKS) FROM (SELECT * FROM STUDENT WHERE CITY = "HASSAN") AS MAX_TABLE;

-- SELECT:
SELECT (SELECT MAX(MARKS) FROM STUDENT WHERE CITY = "HASSAN") AS MAX_HASSAN;
-- ----------------------------------------------------------------------------------------------------------