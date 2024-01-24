package com.test.find;

import java.util.List;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
* Open brackets must be closed by the same type of brackets.
* Open brackets must be closed in the correct order.
* Every close bracket has a corresponding open bracket of the same type.
 */

public class Parentheses {

   public boolean validParatheses(String input) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else if (bracket == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (bracket == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (bracket == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
