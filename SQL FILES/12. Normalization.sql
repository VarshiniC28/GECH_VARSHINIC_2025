-- NORMALIZATION:
-- Normalization is a process of organizing data in a database to reduce redundancy and improve data integrity.
-- It involves dividing large tables into smaller, related tables and linking them using relationships (foreign keys).

-- GOAL:
-- Eliminate data redundancy
-- Avoid anomalies (Insert, Update, Delete)
-- Make database scalable and maintainable

-- EXAMPLE STARTING TABLE (Unnormalized / 0NF)
-- =============================================================
-- Let's say we have this unnormalized table:

-- Table: StudentGrades (UNNORMALIZED)
-- +----+----------+-------------------+---------------------------+--------+
-- | ID | Name     | Courses           | Instructors               | Grades |
-- +----+----------+-------------------+---------------------------+--------+
-- | 1  | Alice    | Math,Physics      | John,Smith                | A,B    |
-- | 2  | Bob      | Chemistry         | Kim                       | C      |
-- +----+----------+-------------------+---------------------------+--------+

-- Problem:
-- → Multi-valued columns (Courses, Instructors, Grades)
-- → Data is not atomic (violates 1NF)
-- → Redundant and inconsistent structure


-- 1NF (First Normal Form): Atomic Columns
-- =======================================
-- Each field should contain only atomic (indivisible) values
-- Each column contains values of same type.
-- Each row is unique(typically ensured by a primary key.
-- No repeating groups or multivalued fields

-- Transformation:

-- Drop the above unnormalized table and split into atomic rows

create database Students;
use Students;
CREATE TABLE StudentGrades_1NF (
    StudentID INT,
    Name VARCHAR(100),
    Course VARCHAR(100),
    Instructor VARCHAR(100),
    Grade CHAR(1)
);

-- Insert normalized data (1 row per course)
INSERT INTO StudentGrades_1NF VALUES (1, 'Alice', 'Math', 'John', 'A');
INSERT INTO StudentGrades_1NF VALUES (1, 'Alice', 'Physics', 'Smith', 'B');
INSERT INTO StudentGrades_1NF VALUES (2, 'Bob', 'Chemistry', 'Kim', 'C');
-- Now each row has atomic values → satisfies 1NF

-- 2NF (Second Normal Form): Remove Partial Dependency
-- ====================================================
-- Table must be in 1NF
-- No partial dependency (i.e., non-key column depends on only part of the primary key)

-- In our case:
-- Composite key = (StudentID, Course)
-- → Name depends only on StudentID → violates 2NF

-- Solution:
-- 🔹 Split into two tables

CREATE TABLE Students (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(100)
);

CREATE TABLE Enrollments (
    StudentID INT,
    Course VARCHAR(100),
    Instructor VARCHAR(100),
    Grade CHAR(1),
    PRIMARY KEY (StudentID, Course),
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID)
);

-- Insert into Students
INSERT INTO Students VALUES (1, 'Alice');
INSERT INTO Students VALUES (2, 'Bob');

-- Insert into Enrollments
INSERT INTO Enrollments VALUES (1, 'Math', 'John', 'A');
INSERT INTO Enrollments VALUES (1, 'Physics', 'Smith', 'B');
INSERT INTO Enrollments VALUES (2, 'Chemistry', 'Kim', 'C');

-- Now non-key column "Name" is not dependent on only part of primary key → satisfies 2NF


-- 3NF (Third Normal Form): Remove Transitive Dependency
-- =============================================================
-- Table must be in 2NF
-- No transitive dependency: i.e., non-key attribute depends on another non-key attribute

-- In our case:
-- Instructor name may depend on Course name → Course → Instructor (transitive)
-- → Instructor should go to a separate table

-- Solution:
-- 🔹 Split Instructor from Enrollment

CREATE TABLE Courses (
    Course VARCHAR(100) PRIMARY KEY,
    Instructor VARCHAR(100)
);

CREATE TABLE Enrollments_3NF (
    StudentID INT,
    Course VARCHAR(100),
    Grade CHAR(1),
    PRIMARY KEY (StudentID, Course),
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID),
    FOREIGN KEY (Course) REFERENCES Courses(Course)
);

-- Insert into Courses
INSERT INTO Courses VALUES ('Math', 'John');
INSERT INTO Courses VALUES ('Physics', 'Smith');
INSERT INTO Courses VALUES ('Chemistry', 'Kim');

-- Insert into Enrollments_3NF
INSERT INTO Enrollments_3NF VALUES (1, 'Math', 'A');
INSERT INTO Enrollments_3NF VALUES (1, 'Physics', 'B');
INSERT INTO Enrollments_3NF VALUES (2, 'Chemistry', 'C');

-- Now all non-key attributes depend only on primary keys → satisfies 3NF

-- =============================================================
-- Summary 

-- | Normal Form | Problem Solved                       | Rule                                   |
-- |-------------|--------------------------------------|----------------------------------------|
-- | 1NF         | Multi-valued fields                  | Make all fields atomic                 |
-- | 2NF         | Partial dependency                   | Non-key columns depend on full PK      |
-- | 3NF         | Transitive dependency                | No non-key column depends on another   |

-- Final schema:
-- Students(StudentID, Name)
-- Courses(Course, Instructor)
-- Enrollments(StudentID, Course, Grade)

-- All tables follow best design, scalable & consistent.
