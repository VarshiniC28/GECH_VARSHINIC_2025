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