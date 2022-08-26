# Write your MySQL query statement below
SELECT Person.lastName, Person.firstname, Address.city, Address.state from Person LEFT JOIN Address ON Person.personId = Address.personId;