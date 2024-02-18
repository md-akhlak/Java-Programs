package StackInJava;

// import java.lang.reflect.Executable;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int val) throws Exception {

        if (isFull()) {
            System.out.println("stack is full");
            return false;
        }

        ptr++;
        data[ptr] = val;
        return true;

    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }

        return data[ptr--];
    }

    private int peek() throws Exception {

        if (isEmpty()) {
            throw new Exception("can't peel in empty stack");
        }

        return data[ptr];
    }


    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }


}
