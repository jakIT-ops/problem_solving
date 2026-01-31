-- Write your PostgreSQL query statement below
SELECT sell_date, count(distinct  product) as num_sold, string_agg(distinct product, ',') as products FROM Activities group by sell_date order by sell_date asc;
