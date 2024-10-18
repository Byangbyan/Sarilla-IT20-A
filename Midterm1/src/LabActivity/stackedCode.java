package LabActivity;

import java.util.Stack;

public class stackedCode {

    public static void main(String[] args) {

        Stack<Integer> mystack = new Stack<>();

        mystack.push(5);
        mystack.push(8);
        mystack.push(1);

        System.out.println("Stack: " + mystack);

        int topElement = mystack.pop();
        System.out.println("Popped: " + topElement);

        int peekedElement = mystack.peek();
        System.out.println("Peeked: " + peekedElement);

        boolean isEmpty = mystack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);

        int stackSize = mystack.size();
        System.out.println("Stack Size: " + stackSize);
    }
}