-- Case 1
SELECT * FROM tbl_student ORDER BY present_date ASC;

-- Case 2
SELECT COUNT(*) as presense, student_card_id, full_name
FROM tbl_student
GROUP BY student_card_id;

