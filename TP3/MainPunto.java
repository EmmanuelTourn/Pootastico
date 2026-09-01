public class MainPunto {
    public static void main(String[] args) {

        // Datos recibidos por argumentos
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        // Instanciar los objetos
        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto(x2, y2);

        // Mostrar los puntos
        System.out.println("=== Punto 1 ===");
        p1.mostrar();

        System.out.println("\n=== Punto 2 ===");
        p2.mostrar();

        // Calcular la distancia
        System.out.println("\nDistancia: " + p1.distanciaA(p2));

        // Desplazar punto 1
        p1.desplazar(2, 3);

        System.out.println("\nPunto 1 después de desplazar (2, 3): ");
        p1.mostrar();

        // Mostrar coordenadas
        System.out.println("\nCoordenadas punto 1: " + p1.coordenadas());
        
        //Ejemplo de caso: {"2", "3", "6", "6"}
    }
}