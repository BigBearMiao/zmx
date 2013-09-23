<%@ page import="com.littlebear.Warehouse" %>



<div class="fieldcontain ${hasErrors(bean: warehouseInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="warehouse.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${warehouseInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: warehouseInstance, field: 'amount', 'error')} required">
	<label for="amount">
		<g:message code="warehouse.amount.label" default="Amount" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="amount" type="number" value="${warehouseInstance.amount}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: warehouseInstance, field: 'unit', 'error')} required">
	<label for="unit">
		<g:message code="warehouse.unit.label" default="Unit" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="unit" required="" value="${warehouseInstance?.unit}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: warehouseInstance, field: 'memo', 'error')} ">
	<label for="memo">
		<g:message code="warehouse.memo.label" default="Memo" />
		
	</label>
	<g:textField name="memo" value="${warehouseInstance?.memo}"/>
</div>

