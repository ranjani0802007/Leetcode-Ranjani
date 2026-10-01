-- Last updated: 10/1/2026, 9:34:31 AM
# Write your MySQL query statement below
SELECT 
    stock_name,
    SUM(CASE WHEN operation = 'Buy' THEN -price ELSE price END) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name;
