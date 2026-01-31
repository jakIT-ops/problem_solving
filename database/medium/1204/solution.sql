-- Write your PostgreSQL query statement below
SELECT person_name
FROM (
         SELECT
             person_id,
             turn,
             person_name,
             SUM(weight) OVER (ORDER BY turn) AS total_weight
         FROM Queue
     ) running_total
WHERE running_total.total_weight <= 1000
ORDER BY turn desc
LIMIT 1;
