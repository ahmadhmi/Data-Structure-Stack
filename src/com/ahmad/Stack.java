package com.ahmad;

public class Stack {
    private int[] array;
    private int size;

    public Stack(int length){
        array = new int[length];
    }

    private boolean isFull(){
        return size == array.length;
    }

    private void expand(){
        int[] newArray = new int[size * 2];
        for (int i = 0; i < size; i++)
            newArray[i] = array[i];
        array = newArray;
    }

    public void push(int num){
        if (isFull())
            expand();
        array[size] = num;
        size++;
    }
    public int peek(){
        return array[size];
    }

    public int pop(){

    }



}
