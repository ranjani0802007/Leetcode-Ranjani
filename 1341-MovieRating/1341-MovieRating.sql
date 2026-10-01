-- Last updated: 10/1/2026, 9:34:38 AM
# Write your MySQL query statement below
(
SELECT u.name AS results
FROM MovieRating mr
JOIN Users u
ON mr.user_id = u.user_id
GROUP BY u.user_id, u.name
ORDER BY COUNT(*) DESC, u.name
LIMIT 1
)

UNION ALL

(
SELECT m.title AS results
FROM MovieRating mr
JOIN Movies m
ON mr.movie_id = m.movie_id
WHERE YEAR(mr.created_at) = 2020
  AND MONTH(mr.created_at) = 2
GROUP BY m.movie_id, m.title
ORDER BY AVG(mr.rating) DESC, m.title
LIMIT 1
);