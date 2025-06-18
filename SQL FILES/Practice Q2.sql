-- practice ques 2
-- Write the query to find avg marks in each city in ascending order

USE COLLEGE;
SELECT CITY , AVG(MARKS) FROM STUDENT
GROUP BY CITY
-- ORDER BY CITY ASC;
ORDER BY AVG(MARKS) ASC;

-- TOTAL PAYMENT ACC TO EACH PAYMENT METHOD - no table here if want refer  1:40:05 in video
SELECT MDDE, COUNT(CUSTOMER) FROM PAYMENT
GROUP BY MODE;