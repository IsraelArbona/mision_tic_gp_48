/*
	SELECT * FROM Proyecto;
	SELECT * FROM Lider;
	SELECT * FROM Compra;
	SELECT * FROM Tipo;
	SELECT * FROM MaterialConstruccion;
*/

-- INFORME 1

SELECT mc.ID_MaterialConstruccion AS ID, mc.Nombre_Material AS NOMBRE, mc.Precio_Unidad AS PRECIO 
FROM MaterialConstruccion AS mc
WHERE mc.Importado = 'Si'
ORDER BY mc.Nombre_Material;

-- INFORME 2

SELECT p.ID_Proyecto AS ID, p.Constructora, p.Ciudad, p.Clasificacion, t.Estrato,
	   l.Nombre || ' ' || l.Primer_Apellido || ' ' || l.Segundo_Apellido AS LIDER
FROM Proyecto AS p
JOIN Tipo AS t ON(p.ID_Tipo = t.ID_Tipo)
JOIN Lider AS l ON(p.ID_Lider = l.ID_Lider)
WHERE p.Banco_Vinculado = 'Conavi'
ORDER BY p.Fecha_Inicio DESC, p.Ciudad, p.Constructora; 

-- INFORME 3

SELECT p.Ciudad, p.Clasificacion, COUNT(ID_Proyecto) AS TOTAL, MIN(p.Fecha_Inicio) AS VIEJO, MAX(p.Fecha_Inicio) AS RECIENTE
FROM Proyecto AS p 
WHERE p.Clasificacion <> 'Casa Campestre' AND p.Clasificacion <> 'Condominio'
-- WHERE p.Clasificacion NOT IN('Casa Campestre','Condominio') 
GROUP BY p.Ciudad, p.Clasificacion  
ORDER BY p.Ciudad, p.Clasificacion;

-- INFORME 4

SELECT p.ID_Proyecto, SUM(c.Cantidad * mc.Precio_Unidad) VALOR
FROM Proyecto AS p
JOIN Compra AS c ON(p.ID_Proyecto = c.ID_Proyecto)
JOIN MaterialConstruccion AS mc ON(c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion)
WHERE c.Pagado = 'No'
GROUP BY p.ID_Proyecto
HAVING VALOR > 50000
ORDER BY VALOR DESC;


-- INFORME 5


SELECT l.Nombre || ' ' || l.Primer_Apellido || ' ' || l.Segundo_Apellido AS LIDER, 
	   SUM(c.Cantidad * mc.Precio_Unidad) AS VALOR
FROM Lider AS l
JOIN Proyecto AS p ON(l.ID_Lider = p.ID_Lider)
JOIN Compra AS c ON(p.ID_Proyecto = c.ID_Proyecto)
JOIN MaterialConstruccion AS mc ON(c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion)
GROUP BY l.Nombre || ' ' || l.Primer_Apellido || ' ' || l.Segundo_Apellido
ORDER BY VALOR DESC
LIMIT 10;

 

















