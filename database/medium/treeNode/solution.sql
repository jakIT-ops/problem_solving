-- Write your PostgreSQL query statement below
select 
    c.id,
    CASE 
        WHEN c.p_id is null THEN 'Root'
        WHEN p.id is not null and c.id not in (select distinct p_id from tree where p_id is not null) THEN 'Leaf' 
        ELSE 'Inner' 
    END AS type 
from Tree c
left join Tree p on p.id = c.p_id 
order by c.id asc;

-- CASE
--   WHEN price < 10 THEN 'Low price product'
--   WHEN price > 50 THEN 'High price product'
-- ELSE
--   'Normal product'
-- END AS "price category"SELECT     t1.id,
--     CASE 
--         WHEN t1.p_id IS NULL THEN 'Root'
--         WHEN t2.id IS NOT NULL THEN 'Inner'
--         ELSE 'Leaf'
--     END AS type
-- FROM Tree t1

