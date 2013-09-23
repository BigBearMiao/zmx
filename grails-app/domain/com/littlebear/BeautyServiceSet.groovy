package com.littlebear

class BeautyServiceSet {

    String          name
    BeautyServices  beautyService
    int             times   
    
    static constraints = {
        name (blank:false)
        beautyService(blank:false)
        times(blank:false)
    }
    
    String toString(){
        name
    }
}
