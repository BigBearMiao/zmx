package com.littlebear

/**
 * 消费记录
 * @author huzx
 *
 */
class ConsumerLog {

    Date 		dateCreated		//消费日期
    Customer            customer		//客户
    float 		price			//消费金额
    Employee            employee		//美容师
    float               staffCosts 		//手工费
    float 		discount		//折扣
    float 		salePrice		//成交价
    String 		record			//记录人					
    String 		memo			//备注
    Payment             paymentChannel		//支付渠道
    
    //消费产品,消费服务
    static hasMany = [product:Product,beautyServices:BeautyServices]
    
    static constraints = {
        price(scale:2,blank:false)
        staffCosts(scale:2,blank:false)
        paymentChannel(blank:false)
    }
}
