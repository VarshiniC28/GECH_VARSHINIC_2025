-- JOINS in SQL:
-- JOIN is used to combine rows from 2/more tables, based on the related column between them.
-- its used when we want info from 2 tables are common
-- ---------------------------------------------------------------------------------------------

-- Types of joins: 
-- refer Venn diagrams of these in the video at 2.25.41 or a screen shot 
-- 1. Inner join : Common data that exists in both tables
-- Outer Joins ->
-- 2. Left join : To get data from Table A and data of Table A thats inside Table B but not in A - this helps get cpmplete data of A from bot A and B 
-- 3. Right join : vice versa of left join - we get complete data of b from a also ( that data is not in B).
-- 4. Full Join : Complete data of both tables will combined - which gives complete data of both a and b
-- -------------------------------------------------------------------------------------------------

-- Inner Join : Returns records that have matching values in both tables
-- Syntax: Here even if the order of table is different the result wuld be same
-- SELECT column(s) FROM tableA
-- INNER JOIN tableB
-- ON tableA.col_name = tableB.col_name;

USE SCHOOL;
SELECT * FROM STUDENT
INNER JOIN COURSES
ON STUDENT.ID = COURSES.ID;
-- ALIAS : Alternate name for table or column - as
-- ---------------------------------------------------------------------------------------------------

-- Left join : Returns all records from the left tabl, and the matched/overlapped records from the right table.
-- SYNTAX: here the order of tables should be proper , the table we want as left table shuld be mentioned FIRST than the right table
-- SELECT column(s) FROM tableA
-- LEFT JOIN tableB 
-- ON tableA.col_name = tableB.col_name;

SELECT * FROM STUDENT
LEFT JOIN COURSES
ON STUDENT.ID = COURSES.ID;
-- ------------------------------------------------------------------------------

-- RIGHT JOIN : Returs all records from the right table , and matched records from the left table
-- syntax :
-- SELECT coulumn(s) FROM TABLEA
-- RIGHT JOIN TABLEB
-- ON TABLEA.COL_NAME = TABLEB.COL_NAME;

SELECT * FROM STUDENT
RIGHT JOIN COURSES 
ON STUDENT.ID = COURSES.ID;
-- -----------------------------------------------------------------------------------------------------

-- FULL JOIN : Returs all records when there is a match in either left or right table --> LEFT JOIN UNION RIGHT JOIN
-- FULL JOIN  command doesnt exist in this so we do it indirectly as below, but if we are using other databases like oracle there exists FULL JOIN or FULL OUTER JOIN
-- SYNTAX: 
-- SELECT column(s) FROM TABLEA AS A
-- LEFT JOIN TABLEB AS B
-- ON A.COL-NAME = B.COL_NAME
-- UNION
-- SELECT * FROM TABLEA AS A
-- RIGHT JOIN TABLEB AS B
-- ON A.COL_NAME = B.COL_NAME;

SELECT * FROM STUDENT
LEFT JOIN COURSES
ON STUDENT.ID = COURSES.ID
UNION
SELECT * FROM STUDENT
RIGHT JOIN COURSES
ON STUDENT.ID = COURSES.ID;
-- --------------------------------------------------------------------------------------------

-- Right exclusive join : only b data
SELECT * FROM STUDENT
RIGHT JOIN COURSES 
ON STUDENT.ID = COURSES.ID
WHERE STUDENT.ID IS NULL;
-- ---------------------------------------------------------------------------------------------
-- Left exclusive join : only a data
SELECT * FROM STUDENT
LEFT JOIN COURSES
ON STUDENT.ID = COURSES.ID
WHERE COURSES.ID IS NULL;
-- -------------------------------------------------------------------------------------------------

-- only and only b
SELECT * FROM STUDENT
RIGHT JOIN COURSES 
ON STUDENT.ID = COURSES.ID
WHERE STUDENT.ID IS NULL
UNION
SELECT * FROM STUDENT
LEFT JOIN COURSES
ON STUDENT.ID = COURSES.ID
WHERE COURSES.ID IS NULL;
-- ---------------------------------------------------------------------------------

-- SELF JOIN: its a regular join but the table is joined with itself (same table)

use company;
create table employee(
	id INT primary key NOT NULL,
    name varchar(50) NOT NULL,
    manager_id INT
);

insert into employee ( id, name, manager_id)
values
(101, "adam", 103),(102, "bob", 104),(103, "casey",NULL),(104, "donald", 103);

SELECT * FROM EMPLOYEE AS A
JOIN EMPLOYEE AS B
ON A.ID = B.MANAGER_ID; -- OPERATION ON SAME TABLE
-- CHECKS WHICH EMPLOYEES ID IS EQUAL TO THE MANAGER ID IN THAT TABLE - THIS SEPERATES WHO ARE MANAGERS, AND WHO ARE JUST EMPLOYEES.

select a.name as manager_name , b.name as employee_name
from employee as a
join employee as b
on a.id = b.manager_id;

-- ---------------------------------------------------------------------------------------------------------------











