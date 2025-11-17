import java.util.StringTokenizer;
public class DebugExemple3 {
public static void main(String[] args) {
String phrase = "Java est amusant";
StringBuffer sb = new StringBuffer(phrase);
sb.reverse();
System.out.println("Phrase inversée : " + sb);
StringTokenizer st = new StringTokenizer(phrase, " ");
int compteur = 0;
while (st.hasMoreTokens()) {
String mot = st.nextToken();
compteur++;
}
System.out.println("Nombre de mots : " + compteur);
}
}