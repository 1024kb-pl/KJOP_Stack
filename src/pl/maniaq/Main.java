package pl.maniaq;

public class Main {

    public static void main(String[] args) {
	    Stack<String> stack = new Stack();
	    stack.push("Pablo");
        stack.push("coś na stosie");
        stack.push("Witam");
        stack.push("nowy pablo");
        stack.displayStack();

        stack.pop();
        stack.pop();
        System.out.println("=====");
        stack.displayStack();
    }
}
