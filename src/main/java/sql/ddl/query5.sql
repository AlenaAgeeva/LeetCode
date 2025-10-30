-- Create a table named employees with the following columns:
--    employee_id: an integer that serves as the primary key and auto-increments.
--    first_name: a string (VARCHAR) that can hold up to 50 characters and cannot be null.
--    last_name: a string (VARCHAR) that can hold up to 50 characters and cannot be null.
--    date_of_birth: a date field.
--    hire_date: a date field that cannot be null.
create table employees(
 employee_id int primary key auto_incerement,
 first_name varchar(50) not null,
 last_name varchar(50) not null,
 date_of_birth date,
 hire_date date not null
);
