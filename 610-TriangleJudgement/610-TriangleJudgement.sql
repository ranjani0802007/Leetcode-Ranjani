-- Last updated: 8/11/2026, 2:21:10 PM
# Write your MySQL query statement below
SELECT x,
       y,
       z,
       CASE
           WHEN x + y > z
            AND x + z > y
            AND y + z > x
           THEN 'Yes'
           ELSE 'No'
       END AS triangle
FROM Triangle;