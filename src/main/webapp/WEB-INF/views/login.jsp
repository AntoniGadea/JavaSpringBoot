<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ include file="../jspf/header.jspf" %>
<%@ include file="../jspf/menuSuperior.jspf" %>

	<div class="container">
		<H1><spring:message code="home.bienvenida" /></H1>
		<p class="text-danger">${errores}</p>
		<mvc:form method="post" action="login" modelAttribute="usuario">
		<mvc:label path="nickname"><spring:message code="login.introduzca.usuario" /></mvc:label>
		<mvc:input path="nickname" type="text" />
		<mvc:errors path="nickname" cssClass="text-danger"/>
		<br>
		<mvc:label path="password"><spring:message code="login.introduzca.pw" /></mvc:label>
		<mvc:input path="password" type="password" />
		<mvc:errors path="password" cssClass="text-danger"/>
		<br>
		<input type="submit" value="login">
		</mvc:form>
	</div>

<%@ include file="../jspf/footer.jspf" %>


</body>

</html>