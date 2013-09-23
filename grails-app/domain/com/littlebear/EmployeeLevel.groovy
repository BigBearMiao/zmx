package com.littlebear

class EmployeeLevel {

    String 	levName                      //级别
    int 	basicSalary		//底薪
    int 	score		//评分		
	
    static constraints = {
        levName(blank:false)
        basicSalary(blank:false,scale: 2)
        score(blank:false)
    }
    static mapping ={
        sort basicSalary:"desc"
    }
    
    String toString(){
		levName
	}
}
