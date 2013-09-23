package com.littlebear

class CustomerBeautyServicesController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def customerBeautyServicesInstance = new CustomerBeautyServices()
        customerBeautyServicesInstance.properties = params
        return [customerBeautyServicesInstance: customerBeautyServicesInstance]
    }

    def edit = {
        def customerBeautyServicesInstance = CustomerBeautyServices.get(params.id)
        if (!customerBeautyServicesInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'customerBeautyServices.label', default: 'CustomerBeautyServices'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [customerBeautyServicesInstance: customerBeautyServicesInstance]
        }
    }

}
