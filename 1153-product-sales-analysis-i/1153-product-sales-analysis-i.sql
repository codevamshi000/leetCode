# Write your MySQL query statement below
SELECT p.product_name,  -- Get the name of the product (no duplicates)
       s.year,                  -- Get the year when it was sold
       s.price                  -- Get the price at which it was sold
FROM Product p                 -- Start from the Product table (alias 'p')
JOIN Sales s                   -- Join with the Sales table (alias 's')
ON p.product_id = s.product_id; -- Match products to sales using product_id

