-- Table Related Queries:

-- Create: To create design or table schema with coloumns
-- Syntax:
-- CREATE TABLE table_name(
-- 	coulumn_name1 datatype constraint;
-- 	coulumn_name2 datatype constraint;
-- );

-- PRIMARY KEY - always not null and unique

USE college;
CREATE TABLE student(
	rollno INT PRIMARY KEY,
    name VARCHAR(50)
);
-- ----------------------------------------------------

-- SELECT : and view ALL coloumns - DQL command
-- Syntax : SELECT * FROM table_name;
SELECT * FROM student;
-- ----------------------------------------------------

-- Insert: inserting data into the table
-- INSERT INTO table_name
-- (colname1, colname2)
-- VALUES
-- (col1_v1, col2_v1),
-- (col1_v2, col2_v2);

INSERT INTO student
(rollno, name)
VALUES
(1, "SANJAY C"),
(2, "HEMALATHA");

INSERT INTO student VALUES (3, "Varshini C");

-- ---------------------------------------------------------------

-- Update - TO update existing rows
-- UPDATE table_name
-- SET col1 = val1 AND col2 = val2
-- WHERE condition

SET SQL_SAFE_UPDATES = 0; -- This switches off the safe mood so that we can switch off the safe mode.
UPDATE STUDENT
SET GRADE = "O" 
WHERE GRADE = "A"; -- ERROR : the SAFE MODE in sql IS ON.. so that By mistake we dont make huge change in db that would cause problem, SO we need to switch off the safe mode using the above set command

SELECT * FROM STUDENT; -- NOW ALL "A" WILL BE REPLACED BY "O".

UPDATE STUDENT
SET MARKS = 80 
WHERE ROLLNO = 103;

UPDATE STUDENT 
SET GRADE = "B"
WHERE MARKS BETWEEN 80 AND 90;

UPDATE STUDENT 
SET GRADE = "O"
WHERE MARKS BETWEEN 91 AND 100;

-- To increase marks of all the students by 1 we use update and set in this manner:
UPDATE STUDENT
SET MARKS = MARKS + 1
WHERE MARKS < 100;
-- -------------------------------------------------------------------------------------------

-- DELETE : To delete existing row.
-- DELETE FROM table_name
-- WHERE  condition;

-- WILL delete students whose marks is less than 33
DELETE FROM STUDENT
WHERE MARKS < 33;
-- If we only use DELETE FROM STUDENT; - it will delete the whole table.
-- ------------------------------------------------------------------------------------------------

-- ALTER : To change the schema.
-- ADD COLUMN:
--    ALTER TABLE table_name
--    ADD col_name DATATYPE CONSTRAINTS;
-- DROP COLOUMN
--    ALTER TABLE table_name
--    DROP col_name;
-- RENAME Table
--    ALTER TABLE table_name
--    RENAME TO new_table_name,
-- CHANGE COL_NAME
--    ALTER TABLE table_name
--    CHANGE COLUMN old_name new_name new_datatype new_constraint
-- MODIFY COLUMN
--    ALTER TABLE table_name
--    MODIFY COL_NAME new_datatype new_constraint; 

SELECT * FROM STUDENT;

-- ADD
ALTER TABLE STUDENT
ADD AGE INT NOT NULL DEFAULT 19;

-- DROP
ALTER TABLE STUDENT
DROP STUDENT_AGE;

-- RENAME
ALTER TABLE STUDENTS
RENAME TO STUDENT;

-- CHANGE
ALTER TABLE STUDENT
CHANGE COLUMN AGE STUDENT_AGE INT;

-- MODIFY
ALTER TABLE STUDENT
MODIFY AGE VARCHAR(2);

INSERT INTO STUDENT
(ROLLNO, NAME, MARKS, STUDENT_AGE)
VALUES
(105, "bob", 34, 100); -- ERROR data too long , varchar(2) but we are inserting 3

DELETE FROM STUDENT
WHERE ROLLNO = 105;
-- -----------------------------------------------------------------------------------

-- TRUNCATE: To delete tables data
-- TRUNCATE TABLE table_name;
-- Drop deletes table whereas truncate deletes only table data.

USE COMPANY;
SELECT * FROM employee_info;
TRUNCATE TABLE employee_info; -- deleted only data not the table, and we can now add new data directly to the table.
