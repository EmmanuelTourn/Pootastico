public class TrianguloRectangulo {
    public static void main(String[] args) {
        double hipotenusa= Double.parseDouble(args[0]);
        double cateto1= Double.parseDouble(args[1]);
        double cateto2= Double.parseDouble(args[2]);
        
        double hipotenusaAlCuadrado= hipotenusa*hipotenusa;
        double cuadradosCatetos= (cateto1*cateto1)+(cateto2*cateto2);
        
        System.out.println("("+hipotenusa + ")^2= " + hipotenusaAlCuadrado);
        System.out.println("("+ cateto1 +")^2 + "+ "("+cateto2 + ")^2= " + cuadradosCatetos);
        
        if(hipotenusaAlCuadrado == cuadradosCatetos) {
            System.out.println("Los valores ingresados corresponden con un triangulo rectangulo.");
        } else {
            System.out.println("Los valores ingresados no son de un triangulo rectangulo.");
        }
        
    }
}