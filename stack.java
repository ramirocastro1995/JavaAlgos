package JavaAlgos;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        //stacked one after another in order
        stack.push("Minecraft");
        stack.push("Skrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        stack.pop();//removes TOP component,that is FFVII
        stack.pop();//removes new top component Borderlands
        String lastpopedgame = stack.pop();
        System.out.println("The last poped game is " + lastpopedgame);
        System.out.println(stack.peek()); //returns top of the stack in this case,Skrim 
        System.out.println(stack);
        System.out.println(stack.search("Skrim"));//return 1 if finds it
    }
}
