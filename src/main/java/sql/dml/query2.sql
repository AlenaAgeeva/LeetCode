--Имеется таблица Products с полями id, name, price, category_id. Напишите SQL-запрос, который
--возвращает category_id и максимальную цену продуктов в каждой категории. Учитывайте только те
--категории, где максимальная цена превышает 100.
select category_id, max(price)
from Products
group by category_id
having max(price) > 100;