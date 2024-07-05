package stackandqueue;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("C#");

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }




    }

}
