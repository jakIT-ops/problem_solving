-- Write your PostgreSQL query statement below
WITH DailyAmount AS (
    -- 1. Өдөр бүрийн нийт дүнг гаргах
    SELECT visited_on, SUM(amount) as day_sum
    FROM Customer
    GROUP BY visited_on
)
SELECT
    a.visited_on,
    SUM(b.day_sum) AS amount, -- 7 хоногийн нийлбэр
    ROUND(SUM(b.day_sum) / 7.0, 2) AS average_amount -- 7 хоногийн дундаж
FROM DailyAmount a
         JOIN DailyAmount b ON b.visited_on BETWEEN a.visited_on - INTERVAL '6 days' AND a.visited_on
GROUP BY a.visited_on
-- 7 хоног гүйцэд бүрдсэн өдрүүдийг л харуулна
HAVING COUNT(b.visited_on) = 7
ORDER BY a.visited_on;
