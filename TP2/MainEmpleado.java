import java.util.Scanner;

public class MainEmpleado {
    public static void main(String[] args) {
        //instanciamos el Scanner REPASAR PORQUE TARDE 2HS EN ESTO
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.print("Ingrese CUIL: ");
        long cuil = teclado.nextLong();
        
        System.out.print("Ingrese Apellido: ");
        String apellido = teclado.next();
        
        System.out.print("Ingrese Nombre: ");
        String nombre = teclado.next();
        
        System.out.print("Ingrese Sueldo Básico: ");
        double sueldo = teclado.nextDouble();
        
        System.out.print("Ingrese Año de Ingreso: ");
        int anio = teclado.nextInt();
        
       
        Empleado emp1 = new Empleado(cuil, apellido, nombre, sueldo, anio);
        
        
        System.out.println("\n--- Datos del Empleado ---");
        emp1.mostrar();
        
        
        
        
        System.out.println("\n--- Formato Línea ---");
        System.out.println(emp1.mostrarLinea());
    }
}