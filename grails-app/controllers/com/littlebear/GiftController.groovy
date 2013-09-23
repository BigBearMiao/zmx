package com.littlebear

class GiftController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def giftInstance = new Gift()
        giftInstance.properties = params
        return [giftInstance: giftInstance]
    }

    def edit = {
        def giftInstance = Gift.get(params.id)
        if (!giftInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'gift.label', default: 'Gift'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [giftInstance: giftInstance]
        }
    }

}
