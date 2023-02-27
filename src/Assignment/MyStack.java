package Assignment;

import java.util.EmptyStackException;

public class MyStack<T> {

    private Node<T> top;
    private int size;

    // Constructor to initialize the stack
    public MyStack() {
        top = null;
        size = 0;
    }

    // Node class to define the structure of each element in the stack
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Push method to add an element to the top of the stack
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Pop method to remove and return the element at the top of the stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Peek method to return the element at the top of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    public MyStack<T> duplicate() {
        MyStack<T> copy = new MyStack<>();
        Node<T> current = top;
        while (current != null) {
            copy.push(current.data);
            current = current.next;
        }
        return copy;
    }
    
    // Method to return the size of the stack
    public int size() {
        return size;
    }
}