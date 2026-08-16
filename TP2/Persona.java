import java.util.*;

public class Persona{
    // Instanciar variables
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;

    /**
     * Constructor
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }

    //Seterssssssssssss
    private void setDNI(int p_dni){
        this.nroDni = p_dni;
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setAnioNacimiento(int p_anio){
        this.anioNacimiento = p_anio;
    }
    
    //Geterssssssssssss
    
    public int getDNI(){
        return nroDni;
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getAnioNacimiento(){
        return anioNacimiento;
    }
    
    

    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        return anioHoy - anioNacimiento;
    }
    
    public String nomYApe(){
        return getNombre() + " " + getApellido();
    }
    
    public String apeYNom(){
        return getApellido() + " " + getNombre();
    }
    
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("DNI: " + getDNI() + "  Edad: " + edad() + " años\n");
    }
}