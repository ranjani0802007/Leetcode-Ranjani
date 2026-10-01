-- Last updated: 10/1/2026, 9:35:18 AM
# Write your MySQL query statement below
SELECT person_name
FROM Queue
WHERE (
    SELECT SUM(weight)
    FROM Queue q2
    WHERE q2.turn <= Queue.turn
) <= 1000
ORDER BY turn DESC
LIMIT 1;