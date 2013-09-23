package com.littlebear

class WarehouseController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def warehouseInstance = new Warehouse()
        warehouseInstance.properties = params
        return [warehouseInstance: warehouseInstance]
    }

    def edit = {
        def warehouseInstance = Warehouse.get(params.id)
        if (!warehouseInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'warehouse.label', default: 'Warehouse'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [warehouseInstance: warehouseInstance]
        }
    }

    def remove = {
           def warehouseInstance = Warehouse.get(params.id)
           def warehouselog      = new WarehouseLog()
           warehouselog.warehouseItem = warehouseInstance
           warehouselog.operateMethod = '出库'
        if (!warehouseInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'warehouse.label', default: 'Warehouse'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [warehouseLogInstance: warehouselog]
        }
    }
    
    
    def addLog = {
           def warehouseInstance = Warehouse.get(params.id)
           def warehouselog      = new WarehouseLog()
           warehouselog.warehouseItem = warehouseInstance
           warehouselog.operateMethod = '入库'
        if (!warehouseInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'warehouse.label', default: 'Warehouse'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [warehouseLogInstance: warehouselog]
        }
    }
}
