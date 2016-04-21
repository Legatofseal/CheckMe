package com.company;

import java.lang.String;
import java.security.Timestamp;
import java.time.LocalTime;

public class Main {


    public static void main(String[] args)  {
       /* System.out.print("Hello");
        ArrayCollectionTest test = new ArrayCollectionTest();
        test.addElement("test1");
        test.addElement("test2");
        test.addElement("test3");
        test.addElement("test4");
        test.addElement(2, "test50");
        test.addElement("test5");
        test.quickSortObject(new NewComparator());*/

        ArrayCollectionTest test1 = new ArrayCollectionTest(100000);
        ArrayCollectionTest test2 = new ArrayCollectionTest(100000);
        Double [] array =  new Double [100000];
        for (int i=0; i<100000; i++){
            array[i]=Math.random();
            test1.addElement(array[i]);
            test2.addElement(array[i]);
        }



        NewComparator comparator = new NewComparator();
        System.out.println(LocalTime.now());
        test1.sortObject(comparator);
        System.out.println(LocalTime.now());
        test2.quickSortObject(comparator);
        System.out.println(LocalTime.now());
    }

}
