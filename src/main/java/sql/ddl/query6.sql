--Alter the employees table to add a new column named email that is a string (VARCHAR)
--capable of holding up to 100 characters and must be unique.
alter table employees
add column email varchar(100) unique;
ALTER TABLE employees
ADD email VARCHAR(100) UNIQUE;