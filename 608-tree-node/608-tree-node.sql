# Write your MySQL query statement below
SELECT id, 'Root' as type from Tree where p_id is null
UNION
SELECT id, 'Leaf' as type from Tree where p_id is not null and id not in (SELECT p_id from Tree where p_id is not null)
UNION 
Select id, 'Inner' as type from Tree where  p_id is not null and id not in (SELECT id from Tree where p_id is null UNION SELECT id from Tree where p_id is not null and id NOT IN (SELECT p_id FROM Tree where p_id is not null));