-- Last updated: 8/11/2026, 2:16:55 PM
# Write your MySQL query statement below
SELECT eu.unique_id,
       e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id = eu.id;