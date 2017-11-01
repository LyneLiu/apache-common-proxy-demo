package com.lyne.java_original;

import Tour.PriceEngine.InventoryChange.Message.VBKPackageSchedule;

import java.lang.reflect.Proxy;

/**
 * Created by nn_liu on 2017/5/11.
 */
public class BusinessProcessorMain {

    public static void main(String[] args) {
        BusinessProcessorImpl businessProcessorImpl = new BusinessProcessorImpl();
        BusinessProcessorHandler businessProcessorHandler = new BusinessProcessorHandler(businessProcessorImpl);

        BusinessProcessor businessProcessor = (BusinessProcessor) Proxy.newProxyInstance(businessProcessorImpl.getClass().getClassLoader(),businessProcessorImpl.getClass().getInterfaces(),businessProcessorHandler);

        businessProcessor.processBusiness("test");
    }

}
