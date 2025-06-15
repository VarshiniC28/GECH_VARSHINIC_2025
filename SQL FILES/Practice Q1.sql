CREATE DATABASE company;
USE company;
CREATE TABLE employee_info(
	id INT PRIMARY KEY,
    name VARCHAR(50),
    salary INT
);
INSERT INTO employee_info
(id, name, salary)
VALUES
(1, "ADAM", 25000),
(2, "BOB", 30000),
(3, "CASEY", 40000);
SELECT * FROM employee_info;