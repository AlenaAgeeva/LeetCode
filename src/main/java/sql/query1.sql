--Имеется таблица Employees с полями id, name, salary, department_id. Напишите SQL-запрос, который
--возвращает department_id и среднюю зарплату сотрудников в каждом департаменте. Учитывайте только те
--департаменты, где средняя зарплата превышает 50000.

select department_id, avg(salary)
from Employees
group by department_id
having avg(salary) > 50000;