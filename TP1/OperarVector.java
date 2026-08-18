import java.util.Scanner;

public class OperarVector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] notas = new int[5];
        int mayor= 0;
        int suma = 0;

        for(int i= 0; i < notas.length; i++){
            System.out.println("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();

            suma += notas[i]; //acumula las notas

            if(notas[i] > mayor){
                mayor= notas[i];
            }
        }
        double promedio = (double) suma / notas.length;

        /*
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        */

        System.out.println("\nNotas ingresadas: ");
        for(int nota : notas){
            System.out.print("| " + nota + " |");
        }

        System.out.println("\n\nPromedio: " + promedio);
        System.out.println("Mayor nota: " + mayor);
    }
}
