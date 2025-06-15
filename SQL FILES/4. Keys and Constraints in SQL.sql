-- Keys:
-- 1. PRIMARY KEY - Its a column(or set of columns) in a table that uniquely identifies each row.(A Unique id)
-- 				  - There is only 1 PK & it should be not null.
-- 2. FORIEGN KEY - A foriegn key is a column(or set of columns) in a table that refers to the primary key in other table.
-- 				  - There can be multiple FKs.
--                - FKs can have duplicate & null values

------------------------------------------------------------------------------
-- Constraints:
-- Constraints in SQL are used to specify some rules for data in a table

-- 1. NOT NULL: Columns cannot have null value. | col1 int NOT NULL;
-- 2. UNIQUE: all values in the column must be unique. | col1 int UNIQUE;

-- 3. PRIMARY KEY: makes column unique and not null but used only for one coloumn
-- Eg : id int PRIMARY KEY;
-- or
-- CREATE TABLE temp(
-- id int not null, PRIMARY KEY (id)
-- );

-- 4. FORIEGN KEY : prevent actions that would destroy links between tables
-- EG: CREATE TABLE table_name(
-- col1_name-id data_type,
-- FORIEGN KEY (col1_name) references anotherTable_name(colFromThatTable-id)
-- );

-- 5. DEFAULT: Set the default value of column.
-- EG:
-- col_name data_type DEFAULT value;
-- salary INT DEFAULT 25000;

-- 6. CHECK : It can limit values allowd in the column
-- create table city(
-- id int primary key, city varchar(50), age INT, 
-- CONSTRAINT age_check CHECK (age>=18 AND city="Delhi")
-- CONSTRAINT constraint_name CHECK (condition)
-- );
-- OR
-- CREATE TABLE newTab( age INT CHECK (age>=18));

USE college;
-- UNIQUE
CREATE TABLE temp1(
	id int unique
);
INSERT INTO temp1 VALUES(101);
INSERT INTO temp1 VALUES(101); -- cant insert the same value since we have used constraint unique to coloumn id
SELECT * FROM temp1;

-- PRIMARY KEY
CREATE TABLE temp2(
	id INT,
    age INT,
    name VARCHAR(50),
    city VARCHAR(20),
    PRIMARY KEY (id, name)
);

-- Default
CREATE TABLE emp(
	id INT,
    salary INT default 250000
);
INSERT INTO emp (id) VALUES (101);
SELECT * FROM emp;



