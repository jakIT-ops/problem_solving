-- Write your PostgreSQL query statement below
SELECT
    ROUND(
            COUNT(DISTINCT t2.player_id) * 1.0 /
            NULLIF(COUNT(DISTINCT t1.player_id), 0),
            2
    ) AS fraction
FROM
    (SELECT player_id, MIN(event_date) AS first_login
     FROM Activity
     GROUP BY player_id) t1
        LEFT JOIN
    Activity t2
    ON
        t1.player_id = t2.player_id
            AND t1.first_login + INTERVAL '1 day' = t2.event_date;
