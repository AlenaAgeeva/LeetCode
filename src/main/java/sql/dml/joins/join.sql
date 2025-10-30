--employees
--| employee_id | first_name | last_name | department_id | |-------------|------------|-----------|---------------| | 1 | John | Doe | 1 | | 2 | Jane | Smith | 2 | | 3 | Alice | Johnson | 1 | | 4 | Bob | Brown | 3 | | 5 | Charlie | Davis | 2 |
--departments
--| department_id | department_name | |---------------|------------------| | 1 | HR | | 2 | IT | | 3 | Marketing |

--Write a query to find all employees along with their department names.
select e.first_name, d.department_name
from employees e
inner join departments d
on e.department_id = d.department_id;
--Write a query to find all employees and their departments, including employees who do not belong to any department.
select e.first_name, d.department_name
from employees e
left join departments d
on e.department_id = d.department_id;
--Write a query to find all departments and their employees, including departments that do not have any employees.
select e.first_name, d.department_name
from employees e
right join departments d
on e.department_id = d.department_id;
--Write a query to find all employees and all departments, including those without corresponding matches.
select e.first_name, d.department_name
from employees e
full join departments d
on e.department_id = d.department_id;
--Write a query to generate a list of all possible combinations of employees and departments.
select e.first_name, d.department_name
from employees e
cross join departments d;
--List all employees along with their department names.
select e.first_name, d.department_name
from employees e
natural join departments d;
--Find pairs of employees who work in the same department.
select e1.first_name, e2.first_name, d.department_name
from employees e1
join employees e2 on e1.department_id = e2.department_id and e1.employee_id != e2.employee_id
join departments d on e1.department_id = d.department_id;