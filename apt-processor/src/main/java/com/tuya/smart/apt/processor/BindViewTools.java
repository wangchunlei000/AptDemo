package com.tuya.smart.apt.processor;

import java.lang.reflect.Method;

public class BindViewTools {
    public static void bind(Object object) {
        Class clazz = object.getClass();
        try {
            Class<?> bindViewClass = Class.forName(clazz.getName() + "_ViewBinding");

            Method method = bindViewClass.getMethod("bind", object.getClass());
            method.invoke(bindViewClass.newInstance(), object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
