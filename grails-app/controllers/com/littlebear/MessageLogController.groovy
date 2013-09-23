package com.littlebear

class MessageLogController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def messageLogInstance = new MessageLog()
        messageLogInstance.properties = params
        return [messageLogInstance: messageLogInstance]
    }

    def edit = {
        def messageLogInstance = MessageLog.get(params.id)
        if (!messageLogInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'messageLog.label', default: 'MessageLog'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [messageLogInstance: messageLogInstance]
        }
    }

}
