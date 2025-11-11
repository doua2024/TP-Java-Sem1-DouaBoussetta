import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        int i = 0;
        char c;
        do {
            System.out.println("Saisir une phrase : ");
            ch = sc.nextLine();
        } while (ch.length() > 50);

        for (i = 0; i < ch.length(); i++) {
            c = ch.charAt(i);
            if (Character.isLowerCase(c)) {
                i++;
            }
        }

        System.out.println("Le nombre de lettres minuscules est : " + i);
    }
}