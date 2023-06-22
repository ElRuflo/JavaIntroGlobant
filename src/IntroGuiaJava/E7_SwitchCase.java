package IntroGuiaJava;
import java.util.Scanner;

public class E7_SwitchCase {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        int op;

        System.out.println("Ingrese el tipo de motor");
        op = leer.nextInt();

        switch (op) {
            case 1:
                System.out.println("La bomba es de agua");
                break;
            case 2:
                System.out.println("La bomba es de gasolina");
                break;
            case 3:
                System.out.println("La bomba es de hormigon");
                break;
            case 4:
                System.out.println("La bomba es de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido");
        }
    }
}
