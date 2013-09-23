package com.littlebear
/**
 * 优惠信息
 * @author huzx
 *
 */
class SpecialPreferences {

    String 	name		//活动名称
    float 	present		//赠送金额
    String 	memo		//备注
	
    static constraints = {
        name(blank:false,size:2..20)
        present(scale:2,blank:false)
        memo(blank:true)
    }
}
