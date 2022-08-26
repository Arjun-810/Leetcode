SELECT DISTINCT name FROM SalesPerson
WHERE sales_id NOT IN(SELECT sales_id FROM Company JOIN Orders ON Company.com_id=Orders.com_id WHERE name="RED")

