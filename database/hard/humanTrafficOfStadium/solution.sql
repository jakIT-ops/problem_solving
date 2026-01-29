-- Write your PostgreSQL query statement below
with Cte1 as
(
    -- Зөвхөн 100-аас дээш хүнтэй мөрүүдээ аваад, 
    -- Тэдгээртээ 1, 2, 3... гэсэн тасралтгүй дугаар өгнө.
    select *, 
           ROW_NUMBER() over (order by id) as rn
    from stadium 
    where people >= 100
),
Cte2 as 
(
    select *,
           count(*) over(partition by (id - rn)) as group_count
    from Cte1
)
select id, visit_date, people
from Cte2
where group_count >= 3
order by visit_date;
