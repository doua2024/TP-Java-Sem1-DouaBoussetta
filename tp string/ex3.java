import java.util.Scanner;
import java.util.StringTokenizer;

public class ex3 {
    public static void main(String[] args) {
        String text1="bonjour les etudiant , bienvenue en java";
        StringTokenizer st1=new StringTokenizer(text1);
        System.out.println("decoupage du text en mots:");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());

        }
        System.out.println("le text principale est :"+text1);


    }
}