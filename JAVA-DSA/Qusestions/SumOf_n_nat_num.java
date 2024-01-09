package Qusestions;

import java.util.Scanner;

public class SumOf_n_nat_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("The sum of first n naturals : " + sum);



        input.close();
    }

}
