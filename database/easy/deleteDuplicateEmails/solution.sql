-- Write your PostgreSQL query statement below

-- SELECT id, regexp_replace(email, 'pattern', 'replacement', 'flags') AS email
-- FROM Person;


-- SELECT  email, COUNT(*)
-- FROM (
--   SELECT regexp_replace(email, '[^\d]', '', 'g') AS email
--   FROM Person
-- ) AS email
-- GROUP BY email
-- HAVING COUNT(*) > 1;

-- DELETE p1 
-- FROM Person p1
-- JOIN Person p2 ON p1.email = p2.email
-- WHERE p1.id > p2.id

DELETE FROM Person p1
USING Person p2
WHERE p1.email = p2.email and p1.id > p2.id
RETURNING p1.id, p1.email;

