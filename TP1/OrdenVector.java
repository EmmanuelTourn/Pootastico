import java.util.Scanner;

public class OrdenVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[4];

        //Ingreso de datos
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = sc.nextDouble();
        }

        //Determinar el menor elemento
        double menor = vector[0];
        for (double num : vector) {
            if (num < menor) {
                menor = num;
            }
        }

        //Metodo Burbuja
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    double aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }

        //Resultados
        System.out.println("\nMenor elemento: " + menor);

        System.out.println("\nVector ordenado (menor a mayor):");
        for (double num : vector) {
            System.out.print("| " + num + " |");
        }
    }
}

