package com.littlebear

class Payment {

	String 	name            //支付渠道
	float 	commission      //手续费
	
    static constraints = {
		name(blank:false,size:2..8)
		commission(scale:4)
    }
	
	String toString(){
		name
	}
}
