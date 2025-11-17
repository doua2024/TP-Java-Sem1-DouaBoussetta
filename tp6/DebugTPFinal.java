import java.util.Scanner;

public class DebugTPFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une phrase : ");
        String phrase = sc.nextLine().toLowerCase();

        String[] mots = phrase.split(" ");
        int nbVoyelles = 0;
        String motLong = "";

        for (char c : phrase.toCharArray()) {
            if ("aeiouy".indexOf(c) != -1) {
                nbVoyelles++;
            }
        }

        for (String m : mots) {
            if (m.length() > motLong.length()) {
                motLong = m;
            }
        }

        System.out.println("Nombre de mots : " + mots.length);
        System.out.println("Nombre de voyelles : " + nbVoyelles);
        System.out.println("Mot le plus long : " + motLong);

        sc.close();
    }
}
