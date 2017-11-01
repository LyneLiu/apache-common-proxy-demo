package com.lyne.java_original;

/**
 * Created by nn_liu on 2017/5/11.
 */
public class BusinessProcessorImpl implements BusinessProcessor{

    public void processBusiness(String msg) {
        System.out.println(">>>>>>>>>>>执行处理逻辑单元......");
        System.out.println("processor msg:"+msg);
    }

}
