-- MYSQL Views : A view is a virtual table based on the result-set of an sql statement. / A temporary virtual table is a shorter version of real table to show only whats required
-- A View always shows up-to-date data. The database engine recreates the view, every time a user-queries it.
-- Table -> real data -> Operations done on these reflect in database.
-- views -> virtual

-- Syntax:
-- CREATE VIEW view_name AS
-- SELECT col(s)_name FROM Table_name;
-- And to see that view : SELECT * FROM view_name;

-- EXAMPLE:
CREATE VIEW VIEW1 AS 
SELECT ROLLNO, NAME FROM STUDENT;
SELECT * FROM VIEW1;

CREATE VIEW VIEW2 AS
SELECT ROLLNO, NAME, MARKS FROM STUDENT;
SELECT * FROM VIEW2 WHERE MARKS > 90;

-- To drop a view : same as table
DROP VIEW VIEW1;