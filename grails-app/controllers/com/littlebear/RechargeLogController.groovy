package com.littlebear

class RechargeLogController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def rechargeLogInstance = new RechargeLog()
        rechargeLogInstance.properties = params
        return [rechargeLogInstance: rechargeLogInstance]
    }

    def edit = {
        def rechargeLogInstance = RechargeLog.get(params.id)
        if (!rechargeLogInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'rechargeLog.label', default: 'RechargeLog'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [rechargeLogInstance: rechargeLogInstance]
        }
    }

}
