# Write your MySQL query statement below
Select email from (SELECT email, count(email) as count from Person group by email) t where count > 1;