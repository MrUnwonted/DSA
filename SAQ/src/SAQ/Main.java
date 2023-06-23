package SAQ;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        stack.push("Hi");
        stack.push("Hello");
        stack.push("Hey");
        stack.push("Bye");

        System.out.println(stack.isEmpty());

        System.out.println(stack);

    }
}