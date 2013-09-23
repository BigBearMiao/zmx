package com.littlebear

class CustomerProductController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def customerProductInstance = new CustomerProduct()
        customerProductInstance.properties = params
        return [customerProductInstance: customerProductInstance]
    }

    def edit = {
        def customerProductInstance = CustomerProduct.get(params.id)
        if (!customerProductInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'customerProduct.label', default: 'CustomerProduct'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [customerProductInstance: customerProductInstance]
        }
    }

}
