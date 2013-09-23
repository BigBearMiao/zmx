package com.littlebear

class ProductController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def productInstance = new Product()
        productInstance.properties = params
        return [productInstance: productInstance]
    }

    def edit = {
        def productInstance = Product.get(params.id)
        if (!productInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'product.label', default: 'Product'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [productInstance: productInstance]
        }
    }

}
