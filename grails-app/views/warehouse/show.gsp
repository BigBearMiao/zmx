
<%@ page import="com.littlebear.Warehouse" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'warehouse.label', default: 'Warehouse')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-warehouse" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-warehouse" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list warehouse">
			
				<g:if test="${warehouseInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="warehouse.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${warehouseInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${warehouseInstance?.amount}">
				<li class="fieldcontain">
					<span id="amount-label" class="property-label"><g:message code="warehouse.amount.label" default="Amount" /></span>
					
						<span class="property-value" aria-labelledby="amount-label"><g:fieldValue bean="${warehouseInstance}" field="amount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${warehouseInstance?.unit}">
				<li class="fieldcontain">
					<span id="unit-label" class="property-label"><g:message code="warehouse.unit.label" default="Unit" /></span>
					
						<span class="property-value" aria-labelledby="unit-label"><g:fieldValue bean="${warehouseInstance}" field="unit"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${warehouseInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="warehouse.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${warehouseInstance?.dateCreated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${warehouseInstance?.lastUpdated}">
				<li class="fieldcontain">
					<span id="lastUpdated-label" class="property-label"><g:message code="warehouse.lastUpdated.label" default="Last Updated" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdated-label"><g:formatDate date="${warehouseInstance?.lastUpdated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${warehouseInstance?.memo}">
				<li class="fieldcontain">
					<span id="memo-label" class="property-label"><g:message code="warehouse.memo.label" default="Memo" /></span>
					
						<span class="property-value" aria-labelledby="memo-label"><g:fieldValue bean="${warehouseInstance}" field="memo"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${warehouseInstance?.id}" />
					<g:link class="edit" action="edit" id="${warehouseInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
