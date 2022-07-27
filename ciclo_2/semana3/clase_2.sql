
-- Operadores de Concatenación

SELECT e.last_name || e.job_id  AS 'Employees'
FROM employees AS e; 

SELECT e.last_name || ' is a ' || e.job_id AS 'Employee Datails'  
FROM employees AS e; 



--Eliminar resultado de una consulta

SELECT DISTINCT e.department_id 
FROM employees AS e; 



-- Operadores de comparación

SELECT e.employee_id, e.last_name, e.salary, e.manager_id 
FROM employees AS e 
WHERE e.manager_id IN(100,101,201);


SELECT e.employee_id, e.last_name, e.salary, e.manager_id 
FROM employees AS e 
WHERE ((e.manager_id >= 100 AND e.manager_id <= 101) OR e.manager_id = 201)


SELECT e.employee_id, e.last_name, e.salary, e.manager_id 
FROM employees AS e 
WHERE (e.manager_id = 100 OR e.manager_id = 101 OR e.manager_id = 201)



-- Operadores de comparación

SELECT e.first_name 
FROM employees AS e
WHERE e.first_name LIKE 'S%';


SELECT e.last_name  
FROM employees AS e 
WHERE e.last_name LIKE '_o%';


-- Operadores de comparación IS NULL y IS NOT NULL

SELECT e.last_name, e.manager_id 
FROM employees AS e 
WHERE e.manager_id IS NULL;

SELECT e.last_name, e.manager_id 
FROM employees AS e 
WHERE e.manager_id IS NOT NULL;


-- Operadores Lógicos

SELECT e.employee_id, e.last_name, j.job_title , e.salary  
FROM employees AS e
JOIN jobs AS j ON(e.job_id = j.job_id) 
WHERE e.salary  >= 10000
AND j.job_title  LIKE '%Man%';


SELECT e.employee_id, e.last_name, j.job_title , e.salary  
FROM employees AS e
JOIN jobs AS j ON(e.job_id = j.job_id) 
WHERE e.salary  >= 10000
OR j.job_title  LIKE '%Man%';

SELECT e.last_name, e.job_id 
FROM employees AS e
WHERE e.job_id NOT IN(2,5,10);


SELECT e.last_name, e.job_id 
FROM employees AS e
WHERE NOT (e.job_id = 2 OR e.job_id = 5 OR e.job_id = 10)



-- Leyes de precedencia

SELECT e.last_name, e.job_id, e.salary 
FROM employees AS e 
WHERE e.job_id = 2
OR e.job_id = 5
AND e.salary >= 14000;


SELECT e.last_name, e.job_id, e.salary 
FROM employees AS e 
WHERE (e.job_id = 2
OR e.job_id = 5)
AND e.salary >= 14000;


-- Ordenando Filas

SELECT e.last_name, e.job_id, e.department_id, e.hire_date 
FROM employees AS e
ORDER BY e.hire_date DESC;


SELECT e.employee_id, e.last_name, e.salary * 12 AS annsal
FROM employees AS e 
ORDER BY annsal;


SELECT e.last_name, e.job_id, e.department_id, e.hire_date 
FROM employees AS e
ORDER BY 3;


SELECT e.last_name, e.department_id, e.salary 
FROM employees AS e
ORDER BY e.department_id, e.salary DESC;


-- Ejercicio básico

SELECT e.last_name, e.salary 
FROM employees AS e 
WHERE e.salary > 12000;

SELECT e.last_name, e.department_id 
FROM employees AS e 
WHERE e.employee_id = 176;

SELECT e.last_name, e.salary 
FROM employees AS e 
WHERE e.salary NOT BETWEEN 5000 AND 12000;







-- Funciones Matemáticas

SELECT ROUND(e.salary)
FROM employees AS e; 


-- Funciones de Cadena


SELECT e.employee_id, e.last_name, e.department_id 
FROM employees AS e 
WHERE LOWER(e.last_name) = 'higgins'; 


SELECT e.employee_id, e.last_name, e.department_id 
FROM employees AS e 
WHERE UPPER(e.last_name) = 'HIGGINS';


SELECT e.employee_id, UPPER(e.last_name), e.department_id 
FROM employees AS e 
WHERE UPPER(e.last_name) = 'HIGGINS';


SELECT e.employee_id, LOWER(e.last_name), e.department_id 
FROM employees AS e 
WHERE LOWER(e.last_name) = LOWER('baer');



-- Ejemplo de fechas

SELECT DATE('now');

SELECT DATE('now','start of month','+1 month','-1 day');























