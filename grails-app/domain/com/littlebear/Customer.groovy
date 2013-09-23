package com.littlebear

/**
 * 
 * 客户基本信息
 * @author huzx
 *
 */
class Customer {

    String 	name			//姓名
    String 	gender			//性别
    int 	age				//年龄
    Date 	birthday		//生日
    String 	phoneNum		//手机
    String 	id_card			//身份证
    float 	money			//余额
    Date 	dateCreated		//注册日期
    Date 	lastUpdated		
    String 	recommended_by	//推荐人
    String 	address			//地址
    String	company			//单位
    String 	job				//职业
    String 	memo			//备注
    String 	interest		//兴趣爱好
    String 	dynamism		//手法控制轻重
    float 	weight			//体重
    float 	height			//身高
    String 	skin			//肤质
    String 	drugallergy		//药物过敏
    MemberLevel memLevl                 //会员级别
    String toString(){
        name
    }
	
    static constraints = {
        memLevl(nullable:false)
        name(maxSize:15,blank:false)
        age(size:1..100,blank:true,nullable:true)
        birthday(blank:true,nullable:true)
        phoneNum(length:11,blank:false,nullable:false)
        gender(inList:['女','男'],blank: false)
        address(maxLength:30,nullable:true,blank:true)
        job(blank:true,nullable:true)
        weight(blank:true,nullable:true)
        height(blank:true,nullable:true)
    }
	
	
}
