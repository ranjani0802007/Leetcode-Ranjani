-- Last updated: 8/11/2026, 2:15:59 PM
# Write your MySQL query statement below
SELECT
    event_day AS day,
    emp_id,
    SUM(out_time - in_time) AS total_time
FROM Employees
GROUP BY event_day, emp_id;