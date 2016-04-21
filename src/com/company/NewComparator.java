package com.company;

import java.util.Comparator;

/**
 * Created by Legat on 20.04.2016.
 */
public class NewComparator implements Comparator<Object> {
    public int compare (Object object1, Object object2){
        if (object1.hashCode()>object2.hashCode())
            return 1;
        else if (object1.hashCode()<object2.hashCode())
            return -1;
        else return 0;

    }

}
