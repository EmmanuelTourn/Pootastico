import java.util.Calendar;
public class Empleado{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;

    
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setImporte(p_importe);
        this.setAnio(p_anio);
    }
    
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;      
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setImporte(double p_importe){
        this.sueldoBasico = p_importe;
    }
    
    private void setAnio(int p_anio){
        this.anioIngreso = p_anio;
    }
    
    public long getCuil(){
        return cuil;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getImporte(){
        return sueldoBasico;
    }
    
    public int getAnio(){
        return anioIngreso;
    }
    
    
    public int antiguedad(){ 
        //calendar para sacar el año actual
        Calendar fechaHoy = Calendar.getInstance();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        // almacenamos el calculo en resultado y lo llamamos con un return para que muestre
        int resultado = anioHoy - this.getAnio(); 
        return resultado;
    }
    
    private double descuento(){
        //Parecido a lo anterior pero aca probe retornar directamente (no me gusto jajaja)
        return (0.02 * this.getImporte()) + 1500;
    }
    
    private double adicional(){
        if(antiguedad() < 2){
            return this.getImporte() * 0.02; //al final si me gusto jajaja
        } else if(antiguedad() >= 2 && antiguedad() < 10){
            return this.getImporte() * 0.04;
        } else{
            return this.getImporte() * 0.06; //mucho.
        }
    }
    
    public double sueldoNeto(){
        return (this.getImporte() + this.adicional()) - this.descuento();
    }
    
    public String nomYApe(){
        return this.getNombre() +" "+ this.getApellido();
    }
    
    public String apeYNom(){
        return this.getApellido() +" "+ this.getNombre();
    }
    
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("CUIL: " + this.getCuil() + "  Antiguedad: " + this.antiguedad() + " años de antiguedad");
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
    }
    
    public String mostrarLinea(){
        return this.getCuil() +" "+ this.apeYNom() + "...........................$" + this.sueldoNeto();
    }
}