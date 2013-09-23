package com.littlebear

class EmployeeLevelController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def employeeLevelInstance = new EmployeeLevel()
        employeeLevelInstance.properties = params
        return [employeeLevelInstance: employeeLevelInstance]
    }

    def edit = {
        def employeeLevelInstance = EmployeeLevel.get(params.id)
        if (!employeeLevelInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'employeeLevel.label', default: 'EmployeeLevel'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [employeeLevelInstance: employeeLevelInstance]
        }
    }

}
