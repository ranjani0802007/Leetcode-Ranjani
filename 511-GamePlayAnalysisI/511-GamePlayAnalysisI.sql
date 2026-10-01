-- Last updated: 10/1/2026, 9:35:47 AM
# Write your MySQL query statement below
SELECT player_id,
       MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;