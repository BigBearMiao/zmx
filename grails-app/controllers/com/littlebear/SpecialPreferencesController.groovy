package com.littlebear

class SpecialPreferencesController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def specialPreferencesInstance = new SpecialPreferences()
        specialPreferencesInstance.properties = params
        return [specialPreferencesInstance: specialPreferencesInstance]
    }

    def edit = {
        def specialPreferencesInstance = SpecialPreferences.get(params.id)
        if (!specialPreferencesInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'specialPreferences.label', default: 'SpecialPreferences'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [specialPreferencesInstance: specialPreferencesInstance]
        }
    }

}
