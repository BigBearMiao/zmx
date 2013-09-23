package com.littlebear

class Employee {
	
	String 		name
	int 		age
	String 		gender
	String 		phone
	String 		address
	EmployeeLevel 	level
	Date 		birthday
	String 		specialty
	Date 		entryTime		//入职时间
	String 		idCard			//身份证
	String 		educational		//最高学历
	Date		positiveTime	//转正时间
    static constraints = {
		name(blank:false,size:2..5)
		phone(size:8..15,blank:true)
		gender(inList:['女','男'],blank:false)
		phone(lenth:11,blank:false,nullable:false)
		birthday(blank:false)
		entryTime(blank:true,nullable:true)
                                   idCard(blank:false,length:18)
		positiveTime(blank:true,nullable:true)
    }
	
	String toString(){
		name
	}
}
