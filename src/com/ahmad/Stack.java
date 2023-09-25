package com.ahmad;

import java.util.Arrays;

public class Stack {
    private int[] array = new int[5];
    private int count;


    private boolean isFull(){
        return count == array.length;
    }


    public void push(int num){
        if (isFull())
            throw new StackOverflowError();
        array[count++] = num;
    }
    public int peek(){
        if (empty())
            throw new IllegalStateException();
        return array[count - 1];
    }

    public int pop(){
        if (empty())
            throw new IllegalStateException();
        return array[--count];
    }

    public boolean empty(){
        return count == 0;
    }

    @Override
    public String toString(){
        int[] content = Arrays.copyOfRange(array, 0, count);
        return Arrays.toString(content);
    }



}
