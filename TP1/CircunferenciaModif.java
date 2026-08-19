import java.util.Scanner;

public class CircunferenciaModif {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese radio: ");
        int radio = teclado.nextInt();
        
        while (radio > 0) {
            double perimetro = 2 * 3.1416 * radio;
            System.out.println("Perimetro: " + perimetro);
            
            System.out.println("Ingrese radio: ");
            radio = teclado.nextInt();
        }
    }
}