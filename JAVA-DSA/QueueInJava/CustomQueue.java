package QueueInJava;

public class CustomQueue {

    int[] data;

    int end = 0;
    private static final int DEFAULT_SIZE = 5;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }


    public CustomQueue(int size) {
        this.data = new int[size];

    }

    public boolean isFull() {
        return end == data.length;
    }

    private boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int val) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");

        }

        data[end++] = val;

        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int rem = data[0];

//        shifting element towards left

        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }

        end--;

        return rem;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
