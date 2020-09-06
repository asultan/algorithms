package minofstack;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        final CustomStack stack = new CustomStack();
        stack.push(1);
        stack.push(5);
        stack.push(4);
        stack.push(0);
        stack.push(3);
        stack.push(8);

        stack.min();
        stack.pull();
        stack.pull();
        stack.pull();
        stack.min();
        stack.push(-1);
        stack.min();
    }
}
