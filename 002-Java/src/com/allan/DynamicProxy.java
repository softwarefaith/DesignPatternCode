package com.allan;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

          public class DynamicProxy implements InvocationHandler {


            private Object subObj;

            public DynamicProxy(Object sub) {
                this.subObj = sub;
            }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before rent house");

        System.out.println("Method:");

        Object ret = method.invoke(subObj, args);

        System.out.println("after rent house");

        return ret;


    }


}
