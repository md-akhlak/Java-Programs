package StackInJava;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int val) throws Exception {

        // take care of is the array if full
        if (this.isFull()) {
            // double tha data[] size
            int[] temp = new int[data.length * 2];
            // copy the previous data of data[] into temp[]
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // at this point we know the array is not full
        // insert item
        return super.push(val);
    }
}
