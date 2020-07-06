package com.company;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Annotated;

import java.lang.reflect.Method;

public class TestListener {
    private static int first;
    private static int second;

    {
        try {
            Method m = TestListener.class.getDeclaredMethod("sub", null);
            StartTest param = m.getAnnotation(StartTest.class);
            first = param.a();
            second = param.b();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @StartTest(a = 10,b = 5)
    public void sum(){
        int sum = first + second;
        System.out.println("Сумма ровна = " + sum);
    }

    @StartTest(a = 50,b = 7)
    public void sub(){
        int sub = first - second;
        System.out.println("Сумма ровна = " + sub);
    }

    @StartTest(a = 6,b = 6)
    public void multi(){
        int multi = first * second;
        System.out.println("Сумма ровна = " + multi);
    }

    @StartTest(a = 25,b = 5)
    public void del(){
        int del = first / second;
        System.out.println("Сумма ровна = " + del);
    }
}
