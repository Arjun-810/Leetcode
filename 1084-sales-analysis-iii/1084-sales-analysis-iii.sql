SELECT a.product_id,a.product_name FROM Product a JOIN Sales b
ON a.product_id=b.product_id
GROUP BY b.product_id
HAVING MIN(b.sale_date)>="2019-01-01" AND MAX(b.sale_date)<="2019-03-31" ;