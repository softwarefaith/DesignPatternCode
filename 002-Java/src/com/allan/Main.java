package com.allan;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import com.allan.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RealObj realObj = new RealObj();

        InvocationHandler handler = new DynamicProxy(realObj);

        Subject sub = (Subject)Proxy.newProxyInstance(realObj.getClass().getClassLoader(),realObj.getClass().getInterfaces(),handler);

        sub.hello("111");
    }
}
