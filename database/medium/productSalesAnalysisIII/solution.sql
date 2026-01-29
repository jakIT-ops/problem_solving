-- Write your PostgreSQL query statement below
select
    product_id,
    min(year) as first_year,
    quantity,
    price
from sales
where year = (select s.year from sales s where s.product_id = sales.product_id
order by s.year asc limit 1)
group by product_id, quantity, price;
