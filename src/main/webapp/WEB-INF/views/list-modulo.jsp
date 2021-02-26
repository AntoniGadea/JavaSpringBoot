<%@ include file="../jspf/header.jspf" %>
<%@ include file="../jspf/menuSuperior.jspf" %>

<div class="container">
<h1><spring:message code="modulos.titulo" /></h1>
<h3><spring:message code="home.bienvenida" /> ${usuario.getNombre()}</h3>

<table class="table table-striped">
<thead class="thead-dark">
<th><a style="color: white;" href="list-modulo?criterio=">ID</a></th>
<th><a style="color: white;" href="list-alumno?criterio=nombre"><spring:message code="etiqueta.nombre" /></a></th>
<th><a style="color: white;" href="list-modulo?criterio=horas"><spring:message code="etiqueta.horas" /></a></th>
<th><a style="color: white;" href="list-modulo?criterio=abv"><spring:message code="etiqueta.abreviatura" /></a></th>
<th><spring:message code="etiqueta.accion" /></th>
</thead>
<tbody>

</tbody>
<c:forEach items="${modulos}" var="modulo">
<tr>
	<td>${modulo.getId()}</td>
	<td>${modulo.getNombre()}</td>
	<td>${modulo.getHoras()}</td>
	<td>${modulo.getAbreviatura()}</td>
	<td><a class="btn btn-danger" href="del-modulo/${modulo.getId()}">Eliminar</a></td>
</tr>
</c:forEach>
</table>
<a href="/add-modulo" class="btn btn-success">Añadir</a><span><--Este boton tambien es para añadir un modulo nuevo, hice la implementacion mal por no leer bien el examen</span>
</div>
<div class="container m">
	<h1 class="m-3">Modulo nuevo:</h1>

<mvc:form class="m-5" method="post" action="add-modulo" modelAttribute="modulo">
	<div class="form-row">
		<div class="col">
			<mvc:label path="id">Id:</mvc:label>
			<mvc:input path="id" type="text" class="form-control" readonly="readonly" />
			<mvc:errors path="id" cssClass="text-warning" />
		</div>
		<div class="col">
			<mvc:label path="Abreviatura">Abreviatura:</mvc:label>
			<mvc:input path="abreviatura" type="text" required="required" class="form-control" minlength="2" />
			<mvc:errors path="abreviatura" cssClass="text-warning" />
		</div>
		<div class="col">
			<mvc:label path="horas">Hores:</mvc:label>
			<mvc:input class="form-control" type="number" path="horas"
				required="required" />
			<mvc:errors path="horas" cssClass="text-warning" />
		</div>
		<div class="col">
			<mvc:label path="ciclo">Ciclo:</mvc:label>
			<mvc:input class="form-control" type="text" path="ciclo"
				minlength="2" required="required" />
			<mvc:errors path="ciclo" cssClass="text-warning" />
		</div>
		<div class="col">
			<mvc:label path="nombre">Nombre:</mvc:label>
			<mvc:input class="form-control" type="text" path="nombre" required="required" minlength="3"/>
			<mvc:errors path="nombre" cssClass="text-warning" />
		</div>
		<div class="col">
			<mvc:label path="professor">Professor:</mvc:label>
			<mvc:input class="form-control" type="text" path="professor" required="required" minlength="3" />
			<mvc:errors path="professor" cssClass="text-warning" />
		</div>
		</div>
	<br><input type="submit" value="Añadir" class="btn btn-success">
</mvc:form>

</div>
<%@ include file="../jspf/footer.jspf" %>
