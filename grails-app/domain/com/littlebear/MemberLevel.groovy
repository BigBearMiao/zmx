package com.littlebear

class MemberLevel {

	String 	levelName	//级别名称
	int 	basePrice	//累计消费金额
	float 	productDiscount	//产品折扣
        float   serviceDiscount //服务折扣
	float  	upPrice		//消费升级金额
	String 	memo		//备注
	
	
    String toString(){
        levelName
    }
        
    static constraints = {
		levelName(nullable:false,blank:false,maxLength:20)
		productDiscount(nullable:false,blank:false)
                serviceDiscount(nullable:false,blank:false)
		basePrice(blank:false)
		upPrice(blank:false)
		memo(maxLength:200)
    }
    
    static mapping ={
        sort id:"desc"
    }
    
}
