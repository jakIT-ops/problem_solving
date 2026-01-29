-- Write your PostgreSQL query statement below
SELECT s.student_id, s.student_name, b.subject_name, 
       COUNT(e.subject_name) as attended_exams
FROM Students s CROSS JOIN
     Subjects b LEFT JOIN
     Examinations as e
     ON s.student_id = e.student_id AND 
        b.subject_name = e.subject_name
GROUP BY s.student_id,s.student_name, b.subject_name
order by s.student_id, b.subject_name;
 
