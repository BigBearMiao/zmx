package com.littlebear

class PaymentController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def paymentInstance = new Payment()
        paymentInstance.properties = params
        return [paymentInstance: paymentInstance]
    }

    def edit = {
        def paymentInstance = Payment.get(params.id)
        if (!paymentInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'payment.label', default: 'Payment'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [paymentInstance: paymentInstance]
        }
    }

}
