package com.littlebear

/**
 *美容服务
 */
class BeautyServices {

    String  name            //服务名称
    float   price           //价格
    String  unit            //单位 节 次
    int     duration        //时长
    String  desc            //介绍
    float   commission      //佣金
    String  memo            //备注
    
    static constraints = {
        name(nullable:false,blank:false)
        price(blank:false,scale:2)
        unit(blank:false)
        duration(blank:false)
        commission(scale:2,blank:false)
        memo()
    }
    
    String toString(){
        name
    }
}
