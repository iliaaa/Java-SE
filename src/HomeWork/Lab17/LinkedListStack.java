package HomeWork.Lab17;

import java.util.LinkedList;

public class LinkedListStack {
    private LinkedList<Object> oLl;
    private int tos;

    public LinkedListStack() {
        this.oLl = new LinkedList<>();
        tos = -1;
    }

    void push(Object o) {
            oLl.add(++tos, o);
    }

    Object pop() {
        return oLl.get(tos--);
    }

    @Override
    public String toString() {
        return "LinkedListQeueStack{" +
                "oLl=" + oLl +
                '}';
    }

    public static void main(String[] args) {
        LinkedListStack linkedListStack = new LinkedListStack();

        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);
        System.out.println(linkedListStack);
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
    }
}
