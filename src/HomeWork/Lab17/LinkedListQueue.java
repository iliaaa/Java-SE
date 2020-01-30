package HomeWork.Lab17;

import java.util.LinkedList;

public class LinkedListQueue {
    private LinkedList<Object> oLl;
    private int tos;

    public LinkedListQueue() {
        this.oLl = new LinkedList<>();
        this.tos = 0;
    }

    void push(Object o) {
        oLl.add(tos++, o);
    }

    Object pop() {
        return oLl.get(oLl.size() - tos--);
    }

    @Override
    public String toString() {
        return "LinkedListQueue{" +
                "oLl=" + oLl +
                '}';
    }

    public static void main(String[] args) {
        LinkedListQueue linkedListQueue = new LinkedListQueue();

        linkedListQueue.push(1);
        linkedListQueue.push(2);
        linkedListQueue.push(3);
        linkedListQueue.push(4);
        System.out.println(linkedListQueue);
        System.out.println(linkedListQueue.pop());
        System.out.println(linkedListQueue.pop());
        System.out.println(linkedListQueue.pop());
        System.out.println(linkedListQueue.pop());
    }
}