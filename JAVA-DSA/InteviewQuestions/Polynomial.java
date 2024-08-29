package InteviewQuestions;

import java.util.Scanner;

public class Polynomial {
    class Term {
        int coff;
        int exp;

        public Term(int coff, int exp) {
            this.coff = coff;
            this.exp = exp;
        }
    }

    int n;
    Term term;

    public void createPoly(Term p){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of terms in Polynomial");
        n = sc.nextInt();

        p = new Term(n, n);

        sc.close();
    }

}
