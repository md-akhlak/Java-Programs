package QueueInJava;


public class Main {

    public static void main(String[] args) throws Exception {

        CustomQueue customQueue = new CustomQueue();

        customQueue.insert(9);
        customQueue.insert(0);
        customQueue.insert(5);
        customQueue.insert(5);
        customQueue.insert(3);
//        customQueue.insert(3);


        customQueue.display();
        System.out.println(customQueue.remove());
        System.out.println(customQueue.front());

        customQueue.display();
    }
}
