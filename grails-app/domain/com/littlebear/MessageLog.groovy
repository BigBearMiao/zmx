package com.littlebear

class MessageLog {

	String phoneNum
	String content
	Date dateCreated
	String sendResult
	String failCase
	
    static constraints = {
		phoneNum(length:11,blank:false)
		content(maxLength:150,blank:false)
		sendResult inList:["成功","失败"]
		failCase blank:true
    }
}
