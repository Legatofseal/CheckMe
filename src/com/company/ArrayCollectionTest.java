package com.company;

/**
 * Created by Legat on 16.04.2016.
 */
public class ArrayCollectionTest {
    int capacity = 500;
    int size = 0;
    Object[] internalArray;

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
     public void AddElement (int index, Object object) throws Exception {

         if (index<0||index>size){
             throw new Exception("Out of range");
         }
         else {
             if (size < capacity) {
                 for (int i=size; i>index; i--){
                     internalArray[size]=internalArray[size-1];
                 }
                 internalArray[index]=object;
             } else {
                 reSizeArray();
                 for (int i=size; i>index; i--){
                     internalArray[size]=internalArray[size-1];
                 }
                 internalArray[index]=object;
             }
             ++size;
         }
     }

    public void AddElement(Object object) {
        if (size < capacity) {
            internalArray[size] = object;
        } else {
            reSizeArray();
            internalArray[size] = object;
        }
        ++size;
    }

    public void reSizeArray() {
        capacity = capacity * 2;
        Object[] tempArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            tempArray[i] = internalArray[i];
        }
        internalArray = tempArray;


    }
}
