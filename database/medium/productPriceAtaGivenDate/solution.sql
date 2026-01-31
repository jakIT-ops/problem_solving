-- Write your PostgreSQL query statement below
SELECT product_id, price
FROM (
         SELECT
             product_id,
             new_price AS price,
             ROW_NUMBER() OVER(PARTITION BY product_id ORDER BY change_date DESC) as rn
         FROM Products
         WHERE change_date <= '2019-08-16'
     ) tmp
WHERE rn = 1

UNION ALL

SELECT product_id, 10 AS price
FROM Products
GROUP BY product_id
HAVING MIN(change_date) > '2019-08-16' order by  price desc;
