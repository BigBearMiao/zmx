package com.littlebear

class MemberLevelController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def memberLevelInstance = new MemberLevel()
        memberLevelInstance.properties = params
        return [memberLevelInstance: memberLevelInstance]
    }

    def edit = {
        def memberLevelInstance = MemberLevel.get(params.id)
        if (!memberLevelInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'memberLevel.label', default: 'MemberLevel'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [memberLevelInstance: memberLevelInstance]
        }
    }

}
