package com.company;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        try {
            Method m =Main.class.getMethod("firstTest",null);
            Annotation[] test = m.getAnnotations(SuperTest.class);
            System.out.println("Value: " + test[0].value());
        } catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }
}
