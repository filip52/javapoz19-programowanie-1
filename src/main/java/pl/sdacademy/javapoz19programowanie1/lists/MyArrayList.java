package pl.sdacademy.javapoz19programowanie1.lists;

import java.util.Arrays;

public class MyArrayList {

    public static void main(String[] args){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4); //myArrayList:MyArrayList;
    }


    private Integer[] data;
    private int size;

    public MyArrayList() {
        this.data = new Integer[3];
        this.size = 0;

    }

    public Integer get(int index) {
        if (index >= size)
            throw new ArrayIndexOutOfBoundsException(index);
        return data[index];
    }

    public void add(Integer value) {
        doubleSpaceIfNeeded();
        data[size++] = value;
    }

    public void remove(int index){
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        if (index == size - 1) {
            size--;
            return;
        }

    }

    private void doubleSpaceIfNeeded() {
        if (size == data.length) {
            Integer[] newArray = new Integer[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newArray[i] = data[i];
            }
            this.data = newArray;
            this.data = Arrays.copyOf(data,data.length * 2);
        }
    }
}
