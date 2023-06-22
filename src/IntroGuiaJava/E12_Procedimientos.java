package IntroGuiaJava;
import java.util.Scanner;

public class E12_Procedimientos {
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

        int a = leer.nextInt();
        int b = leer.nextInt();
        
        esMultiplo(a, b);
    }

    public static void esMultiplo(int n1,int n2){

        if (n1 % n2 == 0) {
            System.out.println(n1+" es multiplo de "+n2);
        }else{
            System.out.println(n1+" no es multiplo de "+n2);
        }

    }

}
