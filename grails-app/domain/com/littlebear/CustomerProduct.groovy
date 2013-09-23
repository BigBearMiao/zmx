package com.littlebear

class CustomerProduct {
    
    Product     product      
    Date        dateCreated     //购买日期
    boolean     isPresent       //赠送
    String      manager         //店长
    String      memo            //备注
    int         times           //次数
    
    static belongsTo = [customer:Customer]
     
    static constraints = {
        product()
        dateCreated()
        isPresent()
        manager(validator:{val,obj->
                if(obj.isPresent){
                    if("".equals(val) || val == null)
                        return  "需要店长授权"
                }
            })
        memo()
    }
    
   
}
