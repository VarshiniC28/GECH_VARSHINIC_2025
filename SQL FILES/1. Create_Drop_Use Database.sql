-- Database creation
-- Can use Caps or lowercase gives same output , Usually caps is prefered

CREATE DATABASE temp1;
-- To create a 2nd database we cant run whole file instead we highlight/select the below line and run with symbol next to usual symbol we use 
create database temp2;

-- Drop the database:
DROP DATABASE temp1;
DROP DATABASE temp2;
-- To drop a database only if it exits already we use IF EXISTS - this doesnt give error instead gives only warning
DROP DATABASE IF EXISTS temp2;

CREATE DATABASE college;
-- Now USE database_name command help us use the one particular database we want. And whatever commands/prgm we write next it will be done within the college database. 

-- To create a database only if it doesnt exit already we use IF NOT EXISTS - this doesnt give error instead gives only warning
CREATE DATABASE IF NOT EXISTS college;

-- Shows all the databases we have till now 
SHOW DATABASES;

-- To use the database and whatever we write next that operations will be performed on that database we command to USE 
USE college;





 