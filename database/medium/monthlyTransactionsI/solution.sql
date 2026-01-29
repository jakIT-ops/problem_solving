-- Write your PostgreSQL query statement below
select to_char(trans_date, 'YYYY-MM') AS month,
country, 
count(id) as trans_count, 
count(case when state ='approved' then 1 end) as approved_count,
coalesce(sum(amount)) as trans_total_amount,
COALESCE(sum(case when state = 'approved' then amount end), 0) as approved_total_amount
from Transactions
group by month, country;
