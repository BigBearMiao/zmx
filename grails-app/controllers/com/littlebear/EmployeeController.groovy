package com.littlebear

class EmployeeController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def employeeInstance = new Employee()
        employeeInstance.properties = params
        return [employeeInstance: employeeInstance]
    }

    def edit = {
        def employeeInstance = Employee.get(params.id)
        if (!employeeInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'employee.label', default: 'Employee'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [employeeInstance: employeeInstance]
        }
    }

}
