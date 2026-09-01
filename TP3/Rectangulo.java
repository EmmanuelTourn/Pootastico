public class Rectangulo{
    private Punto origen;
    private double ancho;
    private double alto;
    
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    public Rectangulo(double p_ancho, double p_alto){
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
        Punto punto0 = new Punto();
        this.setOrigen(punto0);
    }
    
    
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    
    public Punto getOrigen(){
        return this.origen;
    }
    
    public double getAncho(){
        return this.ancho;
    }
    
    public double getAlto(){
        return this.alto;
    }
 
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx,p_dy);
    }
    

    public void caracteristicas(){
        System.out.println( "\n****** Rectangulo ******"+
                            "\nOrigen: " + this.getOrigen().coordenadas() + " - Alto: " +this.getAlto()+ " - Ancho: " + this.getAncho() +
                            "\nSuperficie: " + superficie() + "  - Perímetro: " + perimetro());
    }
    
    public double perimetro(){
        return 2*(this.getAlto() + this.getAncho());
    }
    
    public double superficie(){
        return this.getAlto() * this.getAncho();
    }
    
    public double distanciaA(Rectangulo otroRectangulo){
        return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
    }

    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if (superficie() > otroRectangulo.superficie()){
            return this;
        }
        else if(superficie() < otroRectangulo.superficie()){
            return otroRectangulo;
        }
        else{
            return this;
        }
    }
}