--reto 3
--1.
Select ID_Lider , Nombre , Primer_Apellido
FROM Lider l2 
WHERE Salario <= 500000

SELECT * FROM Proyecto p; 
Select * from Tipo t; 
SELECT * from Lider l 

--2. 
SELECT ID_Proyecto , Constructora , Ciudad, t.Estrato 
FROM Proyecto p 
join Tipo t 
ON p.ID_Tipo = t.ID_Tipo
where p.Ciudad LIKE 'Cartagena'
ORDER BY t.Estrato ASC 

--3.
select count(*)
from Proyecto p 
where Clasificacion = 'Condominio'
and Ciudad IN ('Pereira', 'Armenia', 'Manizales', 'Cartago', 'Sta. Rosa de Cabal')

--4.
SELECT ID_Lider, Nombre, Primer_Apellido
from Lider l 
where Primer_Apellido LIKE '%z'
ORDER BY Nombre ASC 

--Caso 5
