# Write your MySQL query statement below
SELECT employee_id , (case when employee_id%2 != 0 AND name NOT LIKE 'M%' THEN salary ELSE 0 END) AS bonus FROM Employees ORDER BY employee_id;