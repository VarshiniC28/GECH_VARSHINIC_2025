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


