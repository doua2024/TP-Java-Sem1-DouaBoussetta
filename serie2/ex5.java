import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        do {
        System.out.println("donner le numer de moi de 1a12:");
        x= sc.nextInt();}
        while ((12<x)||(x<1));
        switch (x) {
            case 12,1,2:{System.out.println("hiver");}
                
                break;
            case 3,4,5:{System.out.println("printemps");}
                break;
            case 6,7,8:{System.out.println("été");}
            default:{System.out.println("automne");}
                }
             
    }

}
