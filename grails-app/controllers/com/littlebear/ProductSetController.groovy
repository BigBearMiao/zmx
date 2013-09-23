package com.littlebear

class ProductSetController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def productSetInstance = new ProductSet()
        productSetInstance.properties = params
        return [productSetInstance: productSetInstance]
    }

    def edit = {
        def productSetInstance = ProductSet.get(params.id)
        if (!productSetInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'productSet.label', default: 'ProductSet'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [productSetInstance: productSetInstance]
        }
    }

}
