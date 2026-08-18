import java.util.Scanner;

public class OperarVector {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] notas = new int[5];
        
        //Cargar el vector
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nota: ");
            notas[i] = teclado.nextInt();
        }
        
        //Sumar las notas para el promedio
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma = suma + notas[i];
        }
        double promedio = (double) suma / 5;
        
        //Buscar la mayor nota
        int mayor = notas[0];
        for (int i = 0; i < 5; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
        }
        
    
        for (int i = 0; i < 5; i++) {
            System.out.print(notas[i] + "\t");
        }
        
        System.out.println();
        System.out.println("El promedio es: " + promedio);
        System.out.println("La mayor nota es: " + mayor);
    }
}