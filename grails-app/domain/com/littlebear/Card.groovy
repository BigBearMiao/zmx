package com.littlebear

class Card {

    String  name
    int     effectiveTime     //有效天数
    Date    dateCreated       //创建日期
    float   money             //价格
    String  desc              //介绍
    String  memo              //备注
    
    static hasMany=[productSet:ProductSet,beautyServiceSet:BeautyServiceSet]
    
    static constraints = {
        name(blank:false)
        dateCreated()
        money(scale:2,blank:false)
        effectiveTime(blank:false)
        money(scale:2,blank:false)
    }
}
