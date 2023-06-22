package IntroGuiaJava;
import java.util.Scanner;

public class E8_While {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una nota");
        int a = leer.nextInt();

        while (a < 0 || a > 10) {
            System.out.println("Ingrese una nota valida");
            a = leer.nextInt();  
        }

        System.out.println("La nota "+a+" está entre 0 y 10");

    }
}
