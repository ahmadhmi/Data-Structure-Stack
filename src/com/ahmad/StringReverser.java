package com.ahmad;
import java.util.Stack;

public class StringReverser {
    public String reverse(String input){
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> chars = new Stack<Character>();

        for (char ch: input.toCharArray()) {
            chars.push(ch);
        }

        StringBuffer reversed = new StringBuffer();
        while (!chars.empty()){
            reversed.append(chars.pop());
        }

        return reversed.toString();
    }
}
