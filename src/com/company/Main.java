package com.company;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TestListener test = new TestListener();
            test.sum();
            test.sub();
            test.multi();
            test.del();

    }
}
