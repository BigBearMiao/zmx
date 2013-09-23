package com.littlebear

class CustomerBeautyServices {

    BeautyServices      beautyService   //美体服务
    Date                dateCreated     //购买时间
    int                 times           //次数
    boolean             isPresent       //赠送
    String              manager         //店长
    String              memo            //备注
    
    static belongsTo = [customer:Customer]  
    
    static constraints = {
        beautyService()
        dateCreated()
        manager(validator:{val,obj->
                if(obj.isPresent){
                    if("".equals(val) || val==null)
                        return  "需要店长授权"
                }
            })
    }
}
