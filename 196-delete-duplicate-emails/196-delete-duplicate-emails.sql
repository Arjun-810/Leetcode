# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
DELETE p from person as p, person as q where p.id> q.id AND p.email = q.email;