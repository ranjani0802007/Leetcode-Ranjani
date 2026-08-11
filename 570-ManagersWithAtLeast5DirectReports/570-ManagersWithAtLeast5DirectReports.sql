-- Last updated: 8/11/2026, 2:21:47 PM
# Write your MySQL query statement below
SELECT e.name
FROM Employee e
JOIN Employee m
ON e.id = m.managerId
GROUP BY e.id, e.name
HAVING COUNT(*) >= 5;