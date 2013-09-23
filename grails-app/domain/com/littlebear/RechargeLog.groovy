package com.littlebear
/**
 *充值记录
*/
class RechargeLog {

    Customer customer           //客户
    Date     dateCreated        //日期
    Payment  payment            //支付渠道
    String   memo               //备注
    String   operator           //经办人
    
    static constraints = {
        customer(blank:false)
        dateCreated()
        payment(blank:false)
        memo()
        operator(blank:false)
    }
}
