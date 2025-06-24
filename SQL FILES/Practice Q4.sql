-- practice ques 1
-- Write SQL commands to display the right exclusive join:

use school;

-- Right exclusive join
SELECT * FROM STUDENT
RIGHT JOIN COURSES 
ON STUDENT.ID = COURSES.ID
WHERE STUDENT.ID IS NULL;

-- Left exclusive join
SELECT * FROM STUDENT
LEFT JOIN COURSES
ON STUDENT.ID = COURSES.ID
WHERE COURSES.ID IS NULL;
