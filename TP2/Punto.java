public class Punto{
    private double x;
    private double y;

    public Punto(){
        this.setX(0.0);
        this.setY(0.0);
    }
    
    public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }
    
    private void setX(double p_x){
        this.x = p_x;
    }
    
    private void setY(double p_y){
        this.y = p_y;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void desplazar(double p_dx, double p_dy){ //......
        this.x = this.x + p_dx;
        this.y = this.y + p_dy;
    }
    
    public void mostrar(){
        System.out.println("Punto. X: " + this.getX() + ", Y: " + this.getY());
    }
    
    public String coordenadas(){
        return "(" + this.getX() + ", " + this.getY() + ")";
    }
}