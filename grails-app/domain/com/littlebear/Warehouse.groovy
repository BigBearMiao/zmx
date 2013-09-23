package com.littlebear

import java.util.Date;
/**
 * 库存情况
 */
class Warehouse {

    String 	name            //库存产品
    String      unit            //单位
    int 	amount          //数量
    Date 	dateCreated     //入库日期
    Date 	lastUpdated     //最后更新时间
    String      memo            //备注
	
    String toString(){
        return name
    }
    static constraints = {
           name(nullable:false,blank:false)
           amount(nullable:false,blank:false)
           unit(nullable:false,blank:false)
    }
    
    static mapping ={
        sort lastUpdated:"desc"
        sort amount:"asc"
    }
   
}
