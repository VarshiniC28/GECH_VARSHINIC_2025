-- in the student table
-- a. change the name of the column "name" to full_name"\
-- b. delete all students who scored less than 80
-- c. delete the column for grades

use college;
-- A
ALTER TABLE STUDENT
CHANGE COLUMN NAME FULL_NAME VARCHAR(50);
SELECT * FROM STUDENT;

-- B
SET SQL_SAFE_UPDATES = 0;
DELETE FROM STUDENT
WHERE MARKS < 80;

-- C
ALTER TABLE STUDENT 
ADD AGE INT;
ALTER TABLE STUDENT
-- DROP COLUMN AGE; -- OR
DROP AGE;