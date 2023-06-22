package IntroGuiaJava;
import java.util.Scanner;

public class E9_DoWhile {
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        int b = 0,c = 0;
        int a;

        System.out.println("Ingresa 20 numeros!");

            do{
                b++;
                a = leer.nextInt();
                if (a==0){
                System.out.println("Se capturo el numero cero!");
                break;
                }
                if(a<0){
                continue;
                }else{
                c=c+a;
                }
        
            } while (b!=20);
    
        System.out.println("La suma de los numeros leidos es: "+c);

    }

}
