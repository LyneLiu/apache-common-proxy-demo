package com.lyne.java_original;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by nn_liu on 2017/5/11.
 */
public class BusinessProcessorHandler implements InvocationHandler {

    private Object target =null;


    public BusinessProcessorHandler(Object target) {

        this.target =target;

    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("==============================");
        System.out.println("执行逻辑模块之前的预处理");
        System.out.println("==============================");

        Object result =method.invoke(target, args);

        System.out.println("##############################");
        System.out.println("执行逻辑模块之前的扫尾工作");
        System.out.println("##############################");

        return result;

    }
}
