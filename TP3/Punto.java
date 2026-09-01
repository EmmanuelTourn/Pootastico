/**
 * Esta clase representa un punto en el plano cartesiano mediante sus coordenadas x e y. 
 * 
 * @author Gonzalez R. Exequiel y Luque Tourn M. Emmanuel
 */
public class Punto {
    private double x;
    private double y;

    public Punto() {}
    
    /**
     * Constructor que permite crear un punto indicando sus coordenadas.
     * 
     * @param p_x coordenada x del punto.
     * @param p_y coordenada y del punto
     */
    public Punto(double p_x, double p_y) {
        setX(p_x);
        setY(p_y);
    }

    /* getters and setters */
    /**
     * Establece la coordenada de x del punto.
     * @param p_x nueva coordenada x.
     */

    public void setX(double p_x) {
        this.x = p_x;
    }
    /**
     * Establece la coordenada y del punto.
     * @param p_y nueva coordenada y.
     */
    public void setY(double p_y) {
        this.y = p_y;
    }
    
    /**
     * Retorna la coordena x del punto.
     * 
     * @return coordenada x.
     */
    public double getX() {return x;}
    
    /**
     * Retorna la coordena y del punto.
     * 
     * @return coordenada y.
     */
    public double getY() {return y;}

    /**
     * Calcula la distancia entre este punto y otro punto recibido.
     *
     * @param p_ptoDistante punto con el cual se calcula la distancia.
     * @return distancia entre ambos puntos con fórmula de Pitágoras.
     */
    public double distanciaA(Punto p_ptoDistante) {
        double dx = p_ptoDistante.getX() - this.getX();
        double dy = p_ptoDistante.getY() - this.getY();

        return Math.sqrt(Math.pow(dx, 2)  + Math.pow(dy, 2));
    }

    /**
     * Desplaza el punto una determinada cantidad sobre los ejes x e y.
     *
     * @param p_dx desplazamiento sobre el eje x.
     * @param p_dy desplazamiento sobre el eje y.
     */
    public void desplazar(double p_dx, double p_dy) {
        setX(getX() + p_dx);
        setY(getY() + p_dy);
    }

    /**
     * Muestra por pantalla las coordenadas del punto.
     */
    public void mostrar() {
        System.out.println("X: " + getX() + ", Y: " + getY());
    }

    /**
     * Retorna las coordenadas del punto en formato (x, y).
     *
     * @return cadena de texto con las coordenadas del punto.
     */
    public String coordenadas() {
        return "(" + getX() + ", " + getY() + ")";
    }
}
