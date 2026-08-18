/**
 * Representa a un alumno universitario con sus notas, libreta universitaria (LU)
 * y cálculo de condición académica (promedio y aprobación).
 * * @author Luque Emmanuel y Gonzalez Exequiel
 */
public class Alumno{

    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;

    /**
     * Constructor que inicializa los datos del alumno e inicia sus notas en 0.0.
     * @param p_lu Número de Libreta Universitaria.
     * @param p_nombre Nombre del alumno.
     * @param p_apellido Apellido del alumno.
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido){
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }

    /**
     * Asigna la Libreta Universitaria.
     * @param p_lu Número de LU.
     */
    private void setLu(int p_lu){
        this.lu = p_lu;
    }

    /**
     * Asigna el nombre del alumno.
     * @param p_nombre Nombre del alumno.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;    
    }

    /**
     * Asigna el apellido del alumno.
     * @param p_apellido Apellido del alumno.
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;    
    }

    /**
     * @return El número de Libreta Universitaria.
     */
    public int getLu(){
        return lu;
    }

    /**
     * @return El nombre del alumno.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * @return El apellido del alumno.
     */
    public String getApellido(){
        return apellido;
    }

    /**
     * Asigna la nota de la primera evaluación.
     * @param p_nota Calificación obtenida.
     */
    public void setNota1(double p_nota){
        this.nota1 = p_nota;
    }

    /**
     * Asigna la nota de la segunda evaluación.
     * @param p_nota Calificación obtenida.
     */
    public void setNota2(double p_nota){
        this.nota2 = p_nota;
    }

    /**
     * @return La calificación de la primera evaluación.
     */
    public double getNota1(){
        return nota1;
    }

    /**
     * @return La calificación de la segunda evaluación.
     */
    public double getNota2(){
        return nota2;
    }

    /**
     * Determina si el alumno aprueba (promedio mayor a 7.0 y ambas notas mayores o iguales a 6.0).
     * @return true si aprueba, false en caso contrario.
     */
    private boolean aprueba(){ //evaluamos si la nota el promedio es mayor a 7 y si las notas son mayores a 6 entonces da true o false
        if((promedio() > 7) && (this.getNota1()  >= 6 && this.getNota2() >= 6)){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna la condición académica en texto.
     * @return "APROBADO" o "DESAPROBADO".
     */
    private String leyendaAprueba(){
        if(this.aprueba()){
            return "APROBADO"; 
        } else {
            return "DESAPROBADO";  
        }
    }

    /**
     * Calcula el promedio de las dos notas del alumno.
     * @return El promedio como un valor double.
     */
    public double promedio(){
        double promedio = ((this.nota1 + this.nota2) / 2);
        return promedio;
    }

    /**
     * Retorna el nombre y apellido en formato "Nombre Apellido".
     * @return Cadena con nombre y apellido.
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * Retorna el apellido y nombre en formato "Apellido Nombre".
     * @return Cadena con apellido y nombre.
     */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }

    /**
     * Muestra por consola los datos del alumno, sus notas, promedio y estado de aprobación.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("LU: " + this.getLu() + "   " + "Notas: " + this.getNota1() +" - "+ this.getNota2()); 
        System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());//no puse un \n porque al finalizar un println automaticamente ya hace un salto de linea, que loco
    }
}