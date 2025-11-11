import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch, verbe;

        System.out.print("Entrez un verbe du premier groupe : ");
        ch = sc.nextLine();

        if (!ch.endsWith("er") || ch.equals("aller")) {
            System.out.println("Ce n'est pas un verbe régulier du premier groupe !");
        } else {
            verbe = ch.substring(0, ch.length() - 2);
            System.out.println("Conjugaison du verbe \"" + ch + "\" au présent :");
            System.out.println("Je " + verbe + "e");
            System.out.println("Tu " + verbe + "es");
            System.out.println("Il/Elle " + verbe + "e");
            System.out.println("Nous " + verbe + "ons");
            System.out.println("Vous " + verbe + "ez");
            System.out.println("Ils/Elles " + verbe + "ent");
        }
    }
}
