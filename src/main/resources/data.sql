
--Rellenar la tabla usuarios con algunos valores iniciales
insert into alumnos(id,dni,nombre,edad,ciclo,curso,erasmus) 
    values(1,'11111111A','Antoni',21,'DAW',2,true);

insert into alumnos(id,dni,nombre,edad,ciclo,curso,erasmus) 
    values(2,'3333333C','Maria',19,'DAM',1,true);

insert into alumnos(id,dni,nombre,edad,ciclo,curso,erasmus) 
    values(3,'22222222B','Jose',34,'DAW',2,true);

--Datos modulos Examen
insert into modulos(id,abreviatura,ciclo,horas,nombre,professor) 
    values(1,'DWES','DAW',8,'Desarrollo en Entorno Servidor','Joserra');

insert into modulos(id,abreviatura,ciclo,horas,nombre,professor) 
    values(2,'DWEC','DAW',8,'Desarrollo de en Entorno Cliente','Castillo');


insert into modulos(id,abreviatura,ciclo,horas,nombre,professor) 
    values(3,'DIW','DAW',6,'Diseño de Interfaces','Nacho');


