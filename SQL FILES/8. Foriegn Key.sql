-- Foriegn Key:
-- To check the databases's ER diagram on the top go to> Databases > Reverse engineering > next next > select db and we get ER diagram after all necessary things.

-- CASCADING FOR FK: Any changes made in one table shuld be applied to other table also
-- On delete Cascade : When we create a FK using this , it deletes the referencing rows in the child table when the referenced row 
--                     is deleted in the parent table which has a primary key.
-- On Update cascade : When we create a FK using this UPDATE CASCADE the referencing rows are updated in the child table when the 
--                     row is updated in the parent table which has a primary key.

USE COLLEGE;

-- parent table
CREATE TABLE DEPARTMENTS(
	ID INT PRIMARY KEY,
    NAME VARCHAR(50)
);
INSERT INTO DEPARTMENTS
VALUES (101, "ENGLISH"), (102, "MATHEMATICS");
SELECT * FROM DEPARTMENTS;

-- fk relationship <-->
-- child table
CREATE TABLE TEACHERS(
	ID INT PRIMARY KEY,
    NAME VARCHAR(50),
    DEPT_ID INT,
    FOREIGN KEY (DEPT_ID) REFERENCES DEPARTMENTS(ID)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);
INSERT INTO TEACHERS VALUES (101, "AMMU", 101), (102, "VARSHA", 102);
SELECT * FROM TEACHERS;	

-- Now lets change the id of department and check if its changed in teacher table also
UPDATE DEPARTMENTS
SET ID = 104
WHERE ID = 102;