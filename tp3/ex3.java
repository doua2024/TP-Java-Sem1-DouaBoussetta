import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String ch, inv = "";
        int i;
        System.out.println("donner ch");
        ch = Sc.nextLine();
        for (i = ch.length() - 1; i >= 0; i--) {
            inv = inv + ch.charAt(i);

        }
        if (ch.equals(inv)) {
            System.out.println(ch + "est palndrome");
        } else {
            System.out.println(ch + "n'est pas plandrome");
        }
        System.out.println(inv);

    }
}
