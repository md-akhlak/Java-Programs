package BITS_MANUPULATION;

public class BitwiseOperator {
    public static void main(String[] args) {
        /*
         * -> Binary AND : &
         * -> Binary OR : |
         * -> Binary XOR : ^
         * -> Binary one's complement : ~
         * -> Binary left Swift : <<
         * -> Binary right Swift : >>
         */

        // 1-> Binary AND : &
        int a = 5;
        int b = 6;
        int c = a & b;
        System.out.println("The AND is : " + c);

        // 2-> Binary OR : |
        int x = 5;
        int y = 6;
        int z = x | y;
        System.out.println("The OR is : " + z);

        // 3-> Binary XOR : ^
        int d = 5;
        int e = 6;
        int f = d ^ e;
        System.out.println("The XOF is : " + f);

        // 4-> Binary one's complement : ~

        int i = 4;
        System.out.println("The NOT is : " + ~i);

        // 5-> Binary left Swift : << [a<<b = a*2^b]

        System.out.println(5 << 2); // 20

        // 6-> Binary right Swift : >> [a/2^b]

        System.out.println(6 >> 1); // 3

    }
}
