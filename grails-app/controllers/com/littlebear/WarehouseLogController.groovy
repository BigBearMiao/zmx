package com.littlebear

class WarehouseLogController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def warehouseLogInstance = new WarehouseLog()
        warehouseLogInstance.properties = params
        return [warehouseLogInstance: warehouseLogInstance]
    }

    def edit = {
        def warehouseLogInstance = WarehouseLog.get(params.id)
        if (!warehouseLogInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'warehouseLog.label', default: 'WarehouseLog'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [warehouseLogInstance: warehouseLogInstance]
        }
    }

}
