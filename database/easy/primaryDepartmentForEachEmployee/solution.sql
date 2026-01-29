-- Write your PostgreSQL query statement below
-- SELECT DISTINCT e.employee_id, e.department_id from Employee e 
-- where e.primary_flag != 'Y'
-- group by e.employee_id, e.department_id
-- order by e.employee_id, e.department_id asc

-- SELECT DISTINCT e.employee_id, e.department_id
-- FROM Employee e 
-- INNER JOIN Employee ot ON e.employee_id = ot.employee_id
-- WHERE e.primary_flag != 'Y'
-- GROUP BY e.employee_id, e.department_id
-- ORDER BY e.employee_id, e.department_id ASC;


-- SELECT
--     e.employee_id,
--     COALESCE(
--         MAX(CASE WHEN e.primary_flag = 'Y' THEN e.department_id END),
--         MAX(e.department_id)
--     ) AS department_id
-- FROM Employee e
-- GROUP BY e.employee_id

WITH employee2 AS
(SELECT employee_id, count(department_id)
FROM employee
GROUP BY employee_id
HAVING count(Department_id)=1)

SELECT employee_id, department_id
FROM employee
WHERE primary_flag='Y'
OR
employee_id IN 
(SELECT employee_id
FROM employee2)



-- select distinct to_char(t.trans_date, 'YYYY-MM') as month,
--  t.country,
-- count(*) as trans_count,
-- sum(case when t.state = 'approved' then 1 else 0 end) as approved_count,
-- sum(t.amount) as trans_total_amount,
-- sum(case when t.state = 'approved' then t.amount else 0 end) as approved_total_amount
-- from Transactions t 
-- group by to_char(t.trans_date, 'YYYY-MM'), t.country
-- order by t.trans_date asc 
