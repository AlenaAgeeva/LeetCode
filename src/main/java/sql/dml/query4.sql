--Имеется таблица Sales с полями id, product_id, sale_date, quantity. Напишите SQL-запрос, который
--возвращает product_id и общее количество проданных единиц для каждого продукта. Учитывайте только
--те продукты, которые были проданы более чем 100 единиц.
select product_id, sum(quantity)
from Sales
group by product_id
having sum(quantity) > 100;