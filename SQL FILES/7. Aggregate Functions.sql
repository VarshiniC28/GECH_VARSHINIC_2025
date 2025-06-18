-- Aggregate functions: They perform calculation on a set of values, and return a single value.
-- COUNT(), MAX(), MIN(), SUM(), AVG()

USE COLLEGE;
-- Get maximum marks
SELECT MAX(MARKS)
FROM STUDENT;

-- Get maximum marks
SELECT MIN(MARKS)
FROM STUDENT;

-- Average marks
SELECT AVG(MARKS) FROM STUDENT;

SELECT COUNT(MARKS) FROM STUDENT; -- RETURNS NO. OF ROWS
SELECT SUM(MARKS) FROM STUDENT; -- RETURNS SUM