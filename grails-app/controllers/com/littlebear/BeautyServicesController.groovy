package com.littlebear

class BeautyServicesController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def beautyServicesInstance = new BeautyServices()
        beautyServicesInstance.properties = params
        return [beautyServicesInstance: beautyServicesInstance]
    }

    def edit = {
        def beautyServicesInstance = BeautyServices.get(params.id)
        if (!beautyServicesInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'beautyServices.label', default: 'BeautyServices'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [beautyServicesInstance: beautyServicesInstance]
        }
    }

}
