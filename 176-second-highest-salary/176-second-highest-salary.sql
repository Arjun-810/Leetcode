# Write your MySQL query statement below
SELECT case when (SELECT count(Distinct(salary)) from employee ) < 2 then null else (select distinct(salary) as SecondHighestSalary
from Employee
order by salary desc
limit 1, 1) end as SecondHighestSalary;