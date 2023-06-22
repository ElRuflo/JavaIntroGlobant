package IntroGuiaJava;

public class E13_VectoresMatrices {

    public static void main(String[] args) {
    
        // Crear Vector

        int[] vector = new int[8];

        // Inicializar Vector con 0

        for (int i = 0; i < vector.length; i++) {
            vector[i] = 0;
        }

        // Mostrar Vector

        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println(" ");
        

        // Crear Matriz

        int[][] matriz = new int[5][5];

        // Inicializar matriz con 0

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 0;
            }
        }

        // Mostrar Matriz

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }




    }
    
}
