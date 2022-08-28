# Write your MySQL query statement below
SELECT stock_name, sum(case when operation = "sell" then price else -price end) as capital_gain_loss from Stocks group by stock_name;