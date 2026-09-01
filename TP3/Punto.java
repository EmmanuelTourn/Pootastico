/**
 * Representa un punto en el plano cartesiano con coordenadas (X, Y).
 * Permite realizar desplazamientos y consultar su posición.
 * 
 * @author Luque Emmanuel y Gonzalez Exequiel
 */
public class Punto{
    private double x;
    private double y;

    /**
     * Constructor por defecto. Inicializa el punto en (0.0, 0.0).
     */
    public Punto(){
        this.setX(0.0);
        this.setY(0.0);
    }
    public Punto(){
        
    }
    /**
     * Constructor con coordenadas iniciales.
     * @param p_x Coordenada en el eje X.
     * @param p_y Coordenada en el eje Y.
     */
    public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }

    /**
     * Asigna la coordenada X.
     * @param p_x Nuevo valor de X.
     */
    private void setX(double p_x){
        this.x = p_x;
    }

    /**
     * Asigna la coordenada Y.
     * @param p_y Nuevo valor de Y.
     */
    private void setY(double p_y){
        this.y = p_y;
    }

    /**
     * @return El valor actual de la coordenada X.
     */
    public double getX(){
        return x;
    }

    /**
     * @return El valor actual de la coordenada Y.
     */
    public double getY(){
        return y;
    }
    
    public double distanciaA(Punto p_ptoDistante){
                
    }
    
    /**
     * Desplaza el punto sumando los valores recibidos a las coordenadas actuales.
     * @param p_dx Desplazamiento en el eje X.
     * @param p_dy Desplazamiento en el eje Y.
     */
    public void desplazar(double p_dx, double p_dy){ //......
        this.x = this.x + p_dx;
        this.y = this.y + p_dy;
    }

    /**
     * Muestra por consola las coordenadas actuales del punto.
     */
    public void mostrar(){
        System.out.println("Punto. X: " + this.getX() + ", Y: " + this.getY());
    }

    /**
     * Retorna las coordenadas del punto en formato de texto.
     * @return Cadena con el formato "(X, Y)".
     */
    public String coordenadas(){
        return "(" + this.getX() + ", " + this.getY() + ")";
    }
}