# Write your MySQL query statement below
# select products.product_id from products
# where products.law_fats = Y and products.recyclable = Y;
select p.product_id from Products p 
where p.low_fats = 'Y' and recyclable = 'Y'

# select * from products;

