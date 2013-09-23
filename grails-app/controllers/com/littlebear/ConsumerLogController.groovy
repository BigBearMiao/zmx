package com.littlebear

class ConsumerLogController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def consumerLogInstance = new ConsumerLog()
        consumerLogInstance.properties = params
        return [consumerLogInstance: consumerLogInstance]
    }

    def edit = {
        def consumerLogInstance = ConsumerLog.get(params.id)
        if (!consumerLogInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'consumerLog.label', default: 'ConsumerLog'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [consumerLogInstance: consumerLogInstance]
        }
    }

}
