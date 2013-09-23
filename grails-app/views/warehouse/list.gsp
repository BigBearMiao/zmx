
<%@ page import="com.littlebear.Warehouse" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'warehouse.label', default: 'Warehouse')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-warehouse" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-warehouse" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'warehouse.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="amount" title="${message(code: 'warehouse.amount.label', default: 'Amount')}" />
					
						<g:sortableColumn property="unit" title="${message(code: 'warehouse.unit.label', default: 'Unit')}" />
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'warehouse.dateCreated.label', default: 'Date Created')}" />
					
						<g:sortableColumn property="lastUpdated" title="${message(code: 'warehouse.lastUpdated.label', default: 'Last Updated')}" />
					
						<g:sortableColumn property="memo" title="${message(code: 'warehouse.memo.label', default: 'Memo')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${warehouseInstanceList}" status="i" var="warehouseInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${warehouseInstance.id}">${fieldValue(bean: warehouseInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: warehouseInstance, field: "amount")}</td>
					
						<td>${fieldValue(bean: warehouseInstance, field: "unit")}</td>
					
						<td><g:formatDate date="${warehouseInstance.dateCreated}" /></td>
					
						<td><g:formatDate date="${warehouseInstance.lastUpdated}" /></td>
					
						<td>${fieldValue(bean: warehouseInstance, field: "memo")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${warehouseInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
