package BITS_MANUPULATION;

public class BitsManupulation {

    public static int getBit(int n, int i) {
        int bitMast = 1 << i;
        if ((n & bitMast) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setBit(int n, int i) {
        int bitMast = 1 << i;
        return n | bitMast;
    }

    public static int clearBit(int n, int i) {
        int bitMast = ~(1 << i);
        return n & bitMast;
    }

    public static int updateBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // clearBit(n, i);
        // } else {
        // return setBit(n, i);
        // }

        n = clearBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;

    }

    public static void main(String[] args) {
        System.out.println(getBit(10, 3)); // get i'th bit -> 1

        System.out.println(setBit(10, 2)); // set i'th bit -> 14

        System.out.println(clearBit(10, 1));

        System.out.println(updateBit(10, 2, 1));

    }
}
