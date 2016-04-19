package com.company;

import java.lang.String;

public class Main {


    public static void main(String[] args)  {
        System.out.print("Hello");
        ArrayCollectionTest test = new ArrayCollectionTest();
        test.addElement("test1");
        test.addElement("test2");
        test.addElement("test3");
        test.addElement("test4");
        test.addElement(2, "test50");
        test.addElement("test5");
    }
}
