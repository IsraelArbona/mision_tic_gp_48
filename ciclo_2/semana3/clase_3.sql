
-- Funciones Multi-Filas

SELECT AVG(e.salary), MAX(e.salary), MIN(e.salary), SUM(e.salary)  
FROM employees e;


SELECT MIN(e.hire_date), MAX(e.hire_date)  
FROM employees e;


SELECT COUNT(e.employee_id) 
FROM employees e 
WHERE e.department_id = 10;

SELECT COUNT(COALESCE(e.commission_pct,0)) 
FROM employees e;

SELECT COUNT(DISTINCT e.department_id) 
FROM employees e; 


-- Clausula GROUP BY

SELECT e.department_id, ROUND(AVG(e.salary),2)  
FROM employees e
GROUP BY e.department_id;


SELECT ROUND(AVG(e.salary),2) 
FROM employees e 
GROUP BY e.department_id; 


SELECT e.department_id dept_id, e.job_id, SUM(e.salary)
FROM employees e 
GROUP BY e.department_id, e.job_id
ORDER BY e.job_id;


SELECT department_id, COUNT(e.last_name) 
FROM employees e; 

SELECT e.department_id, e.job_id, COUNT(e.last_name) 
FROM employees e
GROUP BY e.department_id;

-- Error al usar la función de agregación sobre el WHERE
SELECT e.department_id, AVG(e.salary) 
FROM employees e 
WHERE AVG(e.salary) >= 8000
GROUP BY e.department_id; 


-- Clausula HAVING

SELECT e.department_id, MAX(e.salary) 
FROM employees e 
GROUP BY e.department_id 
HAVING MAX(e.salary) > 10000;


SELECT e.job_id, SUM(e.salary) as nomina
FROM employees e 
WHERE e.job_id  NOT LIKE 9
GROUP BY e.job_id
HAVING nomina > 14000
ORDER BY nomina;




-- UNIENDO TABLAS SQL

SELECT * 
FROM employees e 
NATURAL JOIN departments d; 

SELECT *
FROM employees e 
JOIN departments d;

SELECT *
FROM employees e 
JOIN departments d 
USING(department_id);

SELECT *
FROM employees e 
INNER JOIN departments d;

SELECT *
FROM employees e 
INNER JOIN departments d 
ON(e.department_id = d.department_id);




-- NATURAL JOIN  - relaciones naturales

SELECT d.department_id, d.department_name, d.location_id , l.city 
FROM departments d NATURAL JOIN locations l; 


-- JOIN USING - relaciones naturales con un unico argumento

SELECT e.first_name, d.department_name 
FROM employees e JOIN departments d USING(department_id);


SELECT e.first_name, d.department_name 
FROM employees e INNER JOIN departments d USING(department_id);


-- INNER JOIN ON comparación con argumento redundantes

SELECT e.employee_id, e.last_name, e.department_id, d.department_id, d.location_id  
FROM employees e 
JOIN departments d ON(e.department_id = d.department_id);

SELECT e.employee_id, l.city, c.country_name  
FROM employees e 
JOIN departments d ON(e.department_id = d.department_id)
JOIN locations l ON(d.location_id = l.location_id)
JOIN countries c ON(l.country_id = c.country_id);



-- SELF JOIN - join entre la misma tabla

SELECT e.last_name, e2.last_name  
FROM employees e 
JOIN employees e2 ON (e.manager_id = e2.manager_id);



-- LEFT OUTER JOIN - devuelve las filas tabla izquierda que coincidan con la tabla de la derecha

SELECT e.last_name, e.department_id, d.department_name  
FROM employees e 
LEFT OUTER JOIN departments d ON (e.department_id = d.department_id);


SELECT e.last_name, d.department_id, d.department_name  
FROM departments d 
LEFT OUTER JOIN employees e ON (e.department_id = d.department_id);

-- RIGTH OUTER JOIN - devuelve las filas tabla derecha que coincidan con la tabla de la izquierda

SELECT e.last_name, e.department_id, d.department_name  
FROM employees e 
RIGHT OUTER JOIN departments d ON (d.department_id = e.department_id);


-- CROSS JOIN - producto cartesiano t.tablaA * t.tablaB

SELECT e.last_name, d.department_name 
FROM employees e 
CROSS JOIN departments d; 



-- SUBCONSULTAS 

SELECT COALESCE(e2.salary,0)  FROM employees e2 WHERE e2.last_name = 'Abel';


SELECT e.first_name, e.last_name, e.salary  
FROM employees e 
WHERE e.salary > 
(SELECT COALESCE(e2.salary,0)  FROM employees e2 WHERE e2.last_name = 'Hunold');


-- SUBCONSULTAS DE FILA ÚNICA

SELECT e.last_name, e.job_id, e.salary  
FROM employees e 
WHERE e.job_id = (SELECT e2.job_id 
 				  FROM employees e2
 				  WHERE e2.first_name = 'Luis')
AND 
e.salary > (SELECT e3.salary  
		    FROM employees e3
		    WHERE e3.first_name = 'Karen');


SELECT e.last_name, e.job_id, e.salary 
FROM employees e 
WHERE e.salary = (SELECT MIN(e2.salary)
				  FROM employees e2);


SELECT e.department_id, MIN(e.salary)
FROM employees e 
GROUP BY e.department_id
HAVING MIN(e.salary) > (SELECT MIN(e2.salary)
						FROM employees e2
						WHERE e2.department_id = 5);



-- SUBCONSULTAS MULTI-FILA
					

SELECT e.employee_id, e.first_name, e.last_name, e.department_id  
FROM employees e
WHERE e.department_id IN (1,3,5,10)
ORDER BY e.first_name, e.last_name; 


SELECT e.employee_id, e.first_name, e.last_name, e.department_id 
FROM employees e 
WHERE e.department_id IN (SELECT d.department_id 
						  FROM departments d
						  WHERE d.location_id = 1700)
ORDER BY e.first_name, e.last_name; 



SELECT e.employee_id, e.first_name, e.last_name, e.department_id 
FROM employees e 
WHERE e.department_id NOT IN (SELECT d.department_id 
						  FROM departments d
						  WHERE d.location_id = 1700)
ORDER BY e.first_name, e.last_name; 



SELECT e.employee_id, e.first_name, e.last_name, e.salary 
FROM employees e 
WHERE e.salary IN (SELECT MAX(e2.salary)
				   FROM employees e2
				   GROUP BY e2.department_id)
ORDER BY e.first_name, e.last_name;


-- SUBCONSULTAS COMO TABLA

SELECT ROUND(AVG(promedio),2) 
FROM (SELECT AVG(e.salary) AS promedio 
	  FROM employees e
	  GROUP BY e.department_id) dpto_salario;
	
	 
	 
-- SUBCONSULTAS COMO ATRIBUTO
	 
SELECT e.employee_id, e.first_name, e.last_name, e.salary, 
	   (SELECT ROUND(AVG(e2.salary),0) FROM employees e2) promedio2,
	   e.salary - (SELECT ROUND(AVG(e3.salary),0) FROM employees e3) diferencia
FROM employees e 
ORDER BY e.first_name, e.last_name; 











































