package com.company;

import java.lang.String;

public class Main {


    public static void main(String[] args) throws Exception {
        System.out.print("Hello");
        ArrayCollectionTest test = new ArrayCollectionTest();
        test.AddElement("test1");
        test.AddElement("test2");
        test.AddElement("test3");
        test.AddElement("test4");
        test.AddElement(2, "test50");
        test.AddElement("test5");
    }
}
