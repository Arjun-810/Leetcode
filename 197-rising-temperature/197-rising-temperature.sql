# Write your MySQL query statement below
SELECT a.id from Weather a JOIN Weather b on datediff(a.recordDate, b.recordDate) = 1 and a.temperature >  b.temperature;