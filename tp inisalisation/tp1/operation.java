import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }
        int A = 8, B = 17;
        boolean res;
        System.out.println("A>B:" + res);
        res = !(A > B);
        System.out.println("!(A>B):" + res);
        res = A == B;
        System.out.println("A==B:" + res);
        res = A != B;
        System.out.println("A!=B:" + res);
        res = ((A < B) & (A == B));
        System.out.println("(A<B)&(A==B)?:" + res);
        res = ((A < B) | (A == B));
        System.out.println("(A<B)|(A==B)?:" + res);
        res = ((A < B) ^ (A == B));
        System.out.println("(A<B)^(A==B)?:" + res);
        res = (A < B) ? true : false;
        System.out.println("(A!=?:" + res);
        int x = 4, y = 10;
        /*
         * x=y++;
         * system.out.println(x);
         * system.out.println(y);
         */
        x = ++y;
        System.out.println(x);
        System.out.println(y);

    }

}
