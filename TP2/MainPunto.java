import java.util.Scanner;
public class MainPunto{
     public static void main(String[] args) {
        //instanciamos el Scanner REPASAR PORQUE TARDE 2HS EN ESTO
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.print("Valor de X: ");
        double x = teclado.nextDouble(); //toma el numero y lo representa con decimal en caso de que pongas un entero 
        
        System.out.print("Valor de Y: ");
        double y = teclado.nextDouble();
        
       
        Punto punt1 = new Punto(x, y);
        
        punt1.mostrar();
        
        System.out.println(punt1.coordenadas());
        
    }
}