//----------- TP 1 -----------
//Ejercicio 2

public class Multiplo {
    public static void main(String[] args) {
        System.out.println("Los multiplos de 4 desde el 42 y hasta el 150 son:\n");
        /*int n= 0;
        for(int i=41; i<=150;i++) {
            if(i%4==0) {
                n++;
                System.out.println("Multiplo de 4 n° " + n + " =" + i);
            }
        }*/

        int i = 42; // inicio
        int n = 0;  // contador de múltiplos

        while(i <= 150) {
            if (i % 4 == 0) {
                n++;
                System.out.println("Multiplo de 4 n° " + n + " = " + i);
            }
            i++;
        }
    }
}
