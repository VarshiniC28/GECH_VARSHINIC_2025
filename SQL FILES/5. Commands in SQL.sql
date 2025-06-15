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

-- SELECT - used to select any data from the database.
-- SYNTAX - SELECT col1, col2 FROM table_name;
-- To select all - SELECT * FROM table_name;

SELECT NAME, MARKS FROM STUDENT;
SELECT DISTINCT CITY FROM STUDENT; -- To get unique values only like in this table hassan and blg only since hassan is repeated
SELECT * FROM STUDENT;

-- CLAUSES ALONG WITH SELECT:
-- 1. WHERE clause- To define some conditions
-- SELECT COL1, COL2, FROM table_name 
-- WHERE conditions;

SELECT * FROM STUDENT WHERE MARKS >80;
SELECT * FROM STUDENT WHERE CITY = "Hassan";
-- or
SELECT * FROM STUDENT 
WHERE MARKS >80 AND CITY = "Hassan";
