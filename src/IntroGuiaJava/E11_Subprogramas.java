package IntroGuiaJava;
import java.util.Scanner;

public class E11_Subprogramas {
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

        String a = leer.nextLine();

        String b = codificar(a);

        System.out.println("Secuencia codificada: "+b);   
            
        }

    public static String codificar(String secuencia){
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < secuencia.length(); i++) {
            char caracter = secuencia.charAt(i);

            switch (caracter) {
                case 'a':
                    resultado.append("@");
                    break;
                case 'e':
                    resultado.append("#");
                    break;
                case 'i':
                    resultado.append("$");
                    break;
                case 'o':
                    resultado.append("%");
                    break;
                case 'u':
                    resultado.append("*");
                    break;
                default:
                    resultado.append(String.valueOf(caracter));
                    break;
            }
        }
        return resultado.toString();
    }
}


