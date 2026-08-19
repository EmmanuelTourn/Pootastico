public class Circunferencia {
    public static void main(String[] args) {

        int radio= Integer.parseInt(args[0]);

        double perimetro= 2*Math.PI*radio;

        System.out.println("El perimetro de la circunferencia es: " + perimetro);
    }
}