-- UNION : This concept is from sets concept fro maths
-- Its used to combine the result-set of two or more SELECT statements.
-- Gives unique records.
-- Used when performing the FULL JOIN

-- TO USE IT:
-- > Every select should have same number of columns
-- > Columns must have similar data types
-- > Columns in every select should be in same order.

-- SYNTAX: 
-- SELECT cols FROM tableA
-- UNION
-- SELECT cols FROM tableB;

use company;
-- This gives all unique records not duplicates
SELECT MANAGER_ID FROM EMPLOYEE
UNION
SELECT MANAGER_ID FROM EMPLOYEE;

-- This gives duplicates also that is gives all
select manager_id from employee
union all
select manager_id from employee; -- repeats the same since we are using 2 tables or a table twice once as tablea and tableb