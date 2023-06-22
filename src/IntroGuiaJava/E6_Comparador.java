package IntroGuiaJava;
import java.util.Scanner;

public class E6_Comparador {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

        int a = leer.nextInt();
        int b = leer.nextInt();

        if (a>25 && b>25) {
            System.out.println("Los dos numeros son mayores a 25");
        } else if (a>25 || b>25) {
                System.out.println("Uno de los dos es mayor a 25");
                } else {
                    System.out.println("Ninguno es mayor a 25");
                }
    }

}
