package com.littlebear

/**
 * 库存日志
 */
class WarehouseLog {

    Warehouse           warehouseItem   
    int 		amount
    String              operateMethod
    String 		operater
    Date 		dateCreated
    String 		memo
    static constraints = {
        warehouseItem(nullable: false,blank:false)
        amount(range: 1..99,blank:false)
        operateMethod(inList:["入库","出库"])
        operater(blank: false)
        memo(blank:true,maxLength:100)
    }
    
    static mapping ={
        sort dateCreated:"desc"
    }
}
