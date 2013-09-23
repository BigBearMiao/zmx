package com.littlebear

class Product {

    String 	name
    float       price			//单价
    String      unit			//单位
    String 	descr			//简介,介绍
    String 	efficacy 		//功效
    String      duration                //时长
    int         amount                  //数量
    
    static constraints = {
        name (blank:false,maxLength:30)
        price(scale:2,blank:false)
        duration(blank:false)
    }
	
    String toString(){
        return name
    }
}
