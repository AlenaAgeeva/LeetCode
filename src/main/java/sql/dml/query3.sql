--Имеется таблица Orders с полями id, customer_id, order_date, total_amount. Напишите SQL-запрос,
--который возвращает customer_id и общее количество заказов для каждого клиента. Учитывайте
--только тех клиентов, у которых количество заказов больше 5.
select customer_id, count(id)
from Orders
group by customer_id
having count(id) > 5;