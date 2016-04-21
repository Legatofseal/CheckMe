package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Legat on 16.04.2016.
 */
public class ArrayCollectionTest {
    int capacity = 500;
    int size = 0;
    Object[] internalArray;

    public void setInternalArray(Object[] internalArray) {
        this.internalArray = internalArray;
    }

    //I made some changes
    //some other change
    public ArrayCollectionTest() {
        this.internalArray = new Object[capacity];

    }

    public ArrayCollectionTest(int capacity) {
        this.capacity = capacity;
        this.internalArray = new Object[capacity];
    }

    ///test
    public int getSize() {
        return size;
    }

    public void addElement(int index, Object object) {
        if (index < 0) {
            index = 0;//
        }
        if (index > size) {
            index = size;
        }

        if (size < capacity) {
            for (int i = size; i > index; i--) {
                internalArray[size] = internalArray[size - 1];
            }
            internalArray[index] = object;
        } else {
            reSizeArray();
            for (int i = size; i > index; i--) {
                internalArray[size] = internalArray[size - 1];
            }
            internalArray[index] = object;
        }
        ++size;

    }

    public void addElement(Object object) {
        if (size < capacity) {
            internalArray[size] = object;
        } else {
            reSizeArray();
            internalArray[size] = object;
        }
        ++size;
    }

    private void reSizeArray() {
        capacity = capacity * 2;
        Object[] tempArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            tempArray[i] = internalArray[i];
        }
        internalArray = tempArray;


    }

    private boolean isBigger(int a, int b) {
        return a > b;
    }



    public boolean removeElement(int index) {
        if (index < 0 || index > size - 1)
            return false;
        else {
            for (int i = index; i < size - 1; i++) {
                internalArray[i] = internalArray[i + 1];
            }
            size--;
            return true;
        }

    }

    int indexOf(Object patern) {
        int result = -1;
        for (int i = 0; i < size; i++) {
            if (patern.equals(internalArray[i])) {
                result = i;
                break;
            }
        }
        return result;

    }

   public int lastIndexOf(Object patern) {
        int result = -1;
        for (int i = 0; i < size; i++) {
            if (patern.equals(internalArray[i])) {
                result = i;

            }
        }
        return result;
    }

    public void sortObject (NewComparator comparator){
        int n = internalArray.length;
       Object temp;
        boolean flag;
        for (int i = 0; i < n - 1; i++) {
            flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (comparator.compare(internalArray[j], internalArray[j + 1])==1) {
                    temp = internalArray[j];
                    internalArray[j] = internalArray[j + 1];
                    internalArray[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag)
                break;

        }
    }
    public void quickSortObject (NewComparator comparator){
      ArrayList<Object> myList= new ArrayList<Object>(Arrays.asList(internalArray));
        myList.sort(comparator);
        internalArray = myList.toArray();

    }
    Object getMax (NewComparator comparator){
        Object temp = internalArray[0];
        for (int i=0; i<size-1; i++){
            if (comparator.compare(internalArray[i+1],internalArray[i])==1){
                temp = internalArray[i+1];

            }
        }
        return temp;
    }
}
