# Write your MySQL query statement below
SELECT eu.unique_id,e.name
FROM Employees e /*e.id → Employees.id*/
LEFT JOIN EmployeeUNI eu/*eu.id → EmployeeUNI.id*/ 
ON e.id=eu.id;