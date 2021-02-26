<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ include file="../jspf/header.jspf" %>
<%@ include file="../jspf/menuSuperior.jspf" %>

	<div class="container">
		<h1>Añade un Modulo</h1>

	<mvc:form method="post" action="add-modulo" modelAttribute="modulo">
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


</body>
</html>