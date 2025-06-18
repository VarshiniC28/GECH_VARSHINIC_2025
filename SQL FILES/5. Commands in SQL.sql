CREATE DATABASE COLLEGE;
USE COLLEGE;
CREATE TABLE STUDENT(
	ROLLNO INT PRIMARY KEY,
    NAME VARCHAR(50),
    MARKS INT NOT NULL,
    GRADE VARCHAR(1),
    CITY VARCHAR(20)
);

INSERT INTO STUDENT
(ROLLNO, NAME, MARKS, GRADE, CITY)
VALUES
(101, "Hemalatha", 100, "A", "Hassan"),
(102, "Sanjay", 100, "A", "Hassan"),
(103, "Varshini", 100, "A", "Hassan"),
(104, "Chandra", 80, "B", "Blg");
---------------------------------------------------------
-- SELECT - used to select any data from the database.
-- SYNTAX - SELECT col1, col2 FROM table_name;
-- To select all - SELECT * FROM table_name;

SELECT NAME, MARKS FROM STUDENT;
SELECT DISTINCT CITY FROM STUDENT; -- To get unique values only like in this table hassan and blg only since hassan is repeated
SELECT * FROM STUDENT;
-----------------------------------------------------------
-- CLAUSES ALONG WITH SELECT:
-- 1. WHERE clause- To define some conditions
-- SELECT COL1, COL2, FROM table_name 
-- WHERE conditions;
SELECT * FROM STUDENT WHERE MARKS >80;
SELECT * FROM STUDENT WHERE CITY = "Hassan";
-- or
SELECT * FROM STUDENT 
WHERE MARKS >80 AND CITY = "Hassan";
-----------------------------------------------------------
-- 2. LIMIT clause: Sets an upper limit on number of (tuples) rows to be returned
SELECT * FROM STUDENT LIMIT 3;
SELECT NAME FROM STUDENT LIMIT 2;
SELECT * FROM STUDENT 
WHERE MARKS > 80
LIMIT 2;
-----------------------------------------------------------
-- 3. ORDER BY clause: To sort in ascending order (ASC) or descending order (desc)
SELECT * FROM STUDENT
-- ORDER BY CITY ASC;
ORDER BY MARKS DESC
LIMIT 2;
-----------------------------------------------------------
-- 4. GROUP BY clause : Groups rows that have the same values into summary rows
-- It collects data from multiple records and groups the result by one or more coloumn.
-- Generally we use group by with some aggregate function
SELECT CITY FROM STUDENT
GROUP BY CITY;

-- Also	
SELECT CITY, COUNT(NAME), COUNT(ROLLNO) 
FROM STUDENT 
GROUP BY CITY; -- This counts number of students in each city

-- Whatever columns we select we have to do GROUP BY on it , otherwise we will get error as follows
SELECT CITY, MARKS ,NAME, COUNT(NAME), COUNT(ROLLNO) 
FROM STUDENT 
GROUP BY CITY; -- WILL give error since we have selected marks but not applying to group by clause

SELECT CITY, AVG(ROLLNO) 
FROM STUDENT 
GROUP BY CITY;

-- GROUP BY grade
SELECT GRADE, COUNT(ROLLNO) FROM STUDENT
GROUP BY GRADE
ORDER BY GRADE;
-----------------------------------------------------------

-- 5. Havinig clause: similar to where i.e applies some condition on rows and used when we want to apply any condition after grouping.
-- EG : Count the number of students in each city where max marks cross 90
SELECT CITY, COUNT(NAME)
FROM STUDENT
GROUP BY CITY
HAVING MAX(MARKS) > 90;
-- where puts condition on rows and having puts condition on group
-----------------------------------------------------------
-- GENERAL ORDER OF COMMANDS:
-- SELECT COL_NAME
-- FROM TABLE_NAME
-- WHERE CONDITION
-- GROUP BY COUMNS
-- HAVING CONDITION
-- ORDER BY COL_NAME ASC/DESC;

SELECT CITY 
FROM STUDENT 
WHERE GRADE = "A"
GROUP BY CITY
HAVING MAX(MARKS) >=90
ORDER BY CITY DESC;