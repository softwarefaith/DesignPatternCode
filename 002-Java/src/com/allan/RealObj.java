package com.allan;

import com.allan.Subject;

public  class RealObj implements Subject {


    @Override
    public void hello(String str){
        System.out.println(str);
    }

}
