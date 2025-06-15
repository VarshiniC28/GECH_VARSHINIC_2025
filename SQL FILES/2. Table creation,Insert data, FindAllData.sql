-- Create table and columns

USE college;

-- To show tables we have already in the database we are using, USE database_name should be runned before running this command else it shows error.
SHOW TABLES;

CREATE TABLE students (
	id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT not null
);

-- Insert data into table
INSERT INTO students VALUES(1, "Hemalatha", 48);
INSERT INTO students VALUES(2, "Sanjay", 18); 

-- Now to print all(See all) the data we have in our table:
SELECT * FROM students; 