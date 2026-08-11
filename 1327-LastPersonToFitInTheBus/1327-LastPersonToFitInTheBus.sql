-- Last updated: 8/11/2026, 2:17:35 PM
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