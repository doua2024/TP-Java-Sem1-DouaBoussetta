import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("veuillez saisir une phrase:");
        String ch2 = Sc.nextline();
        StringBuffer ch = new StringBuffer(ch2);
        System.out.println("le contenu de stringbuffer est:" + ch);
        Sc.close();

    }
}