package com.ahmad;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExpressionExaminer {

    private final List<Character> leftBrackets = Arrays.asList('(', '{', '[', '<');
    private final List<Character> rightBrackets = Arrays.asList(')', '}', ']', '>');

    public boolean isBalanced(String input){
        Stack<Character> chars = new Stack<Character>();
        for (char ch: input.toCharArray()) {
            if (isLeftBracket(ch)) {
                chars.push(ch);
            }

            if (isRightBracket(ch)){
                if (chars.empty()) return false;

                char top = chars.pop();
                if (isMatching(top, ch)) return false;

            }
        }
        return (chars.empty());
    }

    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }

    private boolean isMatching(char left, char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
