import java.util.*;

/**
 * Representa una persona con su DNI, nombre, apellido y año de nacimiento,
 * permitiendo calcular su edad actual y mostrar sus datos formateados.
 * * @author Luque Emmanuel y Gonzalez Exequiel
 */
public class Persona{
    // Instanciar variables
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;

    /**
     * Constructor para inicializar una persona con todos sus datos personales.
     * @param p_dni Número de DNI de la persona.
     * @param p_nombre Nombre de la persona.
     * @param p_apellido Apellido de la persona.
     * @param p_anio Año de nacimiento.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }

    //Seterssssssssssss

    /**
     * Asigna el número de DNI.
     * @param p_dni Número de documento.
     */
    private void setDNI(int p_dni){
        this.nroDni = p_dni;
    }

    /**
     * Asigna el nombre de la persona.
     * @param p_nombre Nombre de la persona.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * Asigna el apellido de la persona.
     * @param p_apellido Apellido de la persona.
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }

    /**
     * Asigna el año de nacimiento.
     * @param p_anio Año de nacimiento.
     */
    private void setAnioNacimiento(int p_anio){
        this.anioNacimiento = p_anio;
    }

    //Geterssssssssssss

    /**
     * @return El número de DNI de la persona.
     */
    public int getDNI(){
        return nroDni;
    }

    /**
     * @return El nombre de la persona.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * @return El apellido de la persona.
     */
    public String getApellido(){
        return apellido;
    }

    /**
     * @return El año de nacimiento de la persona.
     */
    public int getAnioNacimiento(){
        return anioNacimiento;
    }

    /**
     * Calcula la cantidad de años cumplidos a la fecha actual por diferencia de años.
     * @return La edad de la persona en años.
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);

        return anioHoy - anioNacimiento;
    }

    /**
     * Retorna el nombre y apellido en formato "Nombre Apellido".
     * @return Cadena con nombre y apellido.
     */
    public String nomYApe(){
        return getNombre() + " " + getApellido();
    }

    /**
     * Retorna el apellido y nombre en formato "Apellido Nombre".
     * @return Cadena con apellido y nombre.
     */
    public String apeYNom(){
        return getApellido() + " " + getNombre();
    }

    /**
     * Muestra por consola los datos personales de la persona y su edad calculada.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("DNI: " + getDNI() + "  Edad: " + edad() + " años\n");
    }
}