# Write your MySQL query statement below
SELECT DISTINCT author_id AS id
/*The DISTINCT keyword removes duplicate rows from the result.(3,7,4)*/
FROM Views
WHERE author_id = viewer_id ORDER by id;/*put them in Order by ID*/
