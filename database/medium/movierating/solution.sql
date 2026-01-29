-- Write your PostgreSQL query statement below
(SELECT name AS results
 FROM MovieRating JOIN Users USING(user_id)
 GROUP BY user_id, name
 ORDER BY COUNT(movie_id) DESC, name ASC
 LIMIT 1)

UNION ALL

(SELECT title AS results
 FROM MovieRating JOIN Movies USING(movie_id)
 WHERE created_at BETWEEN '2020-02-01' AND '2020-02-29'
 GROUP BY movie_id, title
 ORDER BY AVG(rating) DESC, title ASC
 LIMIT 1);
-- order by count(*) desc, m.title asc; 

------------------------------------------------------------------------
-- SELECT column_name(s) FROM table1
-- UNION
-- SELECT column_name(s) FROM table2; 
-- Та дараах хоёр асуултад хариулж, үр дүнг нэг багана болгон харуулах ёстой:
--     Хамгийн олон кинонд үнэлгээ өгсөн хэрэглэгчийн нэрийг олох.
--         Хэрэв үнэлгээ өгсөн тоогоороо хэд хэдэн хэрэглэгч тэнцвэл, цагаан толгойн дарааллаар (lexicographically) хамгийн эхний нэрийг нь сонгоно.
--     2020 оны 2-р сард (February 2020) хамгийн өндөр дундаж үнэлгээ авсан киноны нэрийг олох.
--         Хэрэв дундаж үнэлгээгээрээ хэд хэдэн кино тэнцвэл, цагаан толгойн дарааллаар хамгийн эхний нэрийг нь сонгоно wwkkkk.
