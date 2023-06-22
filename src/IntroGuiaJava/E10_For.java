package IntroGuiaJava;
import java.util.Scanner;

public class E10_For {
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            
            System.out.println("Ingrese un numero entre 1 y 20");
            int a = leer.nextInt();
            while (a<1||a>20){
                System.out.println("El numero debe estar entre 1 y 20");
                System.out.println("Ingrese un numero entre 1 y 20");
                a = leer.nextInt();
            }
            System.out.print(a);
            
        for (int j = 0; j < a; j++) {
            System.out.print("*");
        }
        System.out.println();


        }

    }
}
