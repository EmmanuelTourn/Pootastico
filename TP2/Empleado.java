import java.util.Calendar;

/**
 * Representa a un empleado de la empresa, permitiendo calcular su antigüedad,
 * adicionales, descuentos y el sueldo neto a liquidar.
 * 
 * @author Luque Emmanuel y Gonzalez Exequiel
 */
public class Empleado{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;

    /**
     * Constructor para inicializar los datos de un empleado.
     * @param p_cuil Número de CUIL del empleado.
     * @param p_apellido Apellido del empleado.
     * @param p_nombre Nombre del empleado.
     * @param p_importe Sueldo básico inicial.
     * @param p_anio Año de ingreso a la empresa.
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnio(p_anio);
    }
    
    /**
     * Asigna el número de CUIL.
     * @param p_cuil Número de CUIL.
     */
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;      
    }
    
    /**
     * Asigna el apellido del empleado.
     * @param p_apellido Apellido del empleado.
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    /**
     * Asigna el nombre del empleado.
     * @param p_nombre Nombre del empleado.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Asigna el sueldo básico.
     * @param p_importe Importe del sueldo básico.
     */
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }
    
    /**
     * Asigna el año de ingreso.
     * @param p_anio Año de ingreso.
     */
    private void setAnio(int p_anio){
        this.anioIngreso = p_anio;
    }
    
    /**
     * @return El número de CUIL del empleado.
     */
    public long getCuil(){
        return cuil;
    }
    
    /**
     * @return El apellido del empleado.
     */
    public String getApellido(){
        return apellido;
    }
    
    /**
     * @return El nombre del empleado.
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * @return El sueldo básico del empleado.
     */
    public double getSueldoBasico(){
        return sueldoBasico;
    }
    
    /**
     * @return El año de ingreso a la empresa.
     */
    public int getAnio(){
        return anioIngreso;
    }
    
    /**
     * Calcula la antigüedad del empleado en años a la fecha actual.
     * @return Cantidad de años de servicio.
     */
    public int antiguedad(){ 
        //calendar para sacar el año actual
        Calendar fechaHoy = Calendar.getInstance();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        // almacenamos el calculo en resultado y lo llamamos con un return para que muestre
        int resultado = anioHoy - this.getAnio(); 
        return resultado;
    }
    
    /**
     * Calcula el descuento por obra social (2%) más el seguro de vida ($1500).
     * @return Monto total a descontar del sueldo básico.
     */
    private double descuento(){
        //Parecido a lo anterior pero aca probe retornar directamente (no me gusto jajaja)
        return (0.02 * this.getSueldoBasico()) + 1500;
    }
    
    /**
     * Calcula la asignación adicional sobre el sueldo básico según la antigüedad.
     * @return Monto adicional correspondiente.
     */
    private double adicional(){
        if(antiguedad() < 2){
            return this.getSueldoBasico() * 0.02; //al final si me gusto jajaja
        } else if(antiguedad() < 10){ //antiguedad() >= 2 &&
            return this.getSueldoBasico() * 0.04;
        } else{
            return this.getSueldoBasico() * 0.06; //mucho.
        }
    }
    
    /**
     * Calcula el sueldo neto sumando básico y adicional, y restando descuentos.
     * @return Sueldo neto final a percibir.
     */
    public double sueldoNeto(){
        return (this.getSueldoBasico() + this.adicional()) - this.descuento();
    }
    
    /**
     * Retorna el nombre y apellido en formato "Nombre Apellido".
     * @return Cadena con nombre y apellido.
     */
    public String nomYApe(){
        return this.getNombre() +" "+ this.getApellido();
    }
    
    /**
     * Retorna el apellido y nombre en formato "Apellido Nombre".
     * @return Cadena con apellido y nombre.
     */
    public String apeYNom(){
        return this.getApellido() +" "+ this.getNombre();
    }
    
    /**
     * Muestra por consola el detalle completo del empleado y su liquidación.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("CUIL: " + this.getCuil() + "  Antiguedad: " + this.antiguedad() + " años de antiguedad");
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
    }
    
    /**
     * Retorna una línea resumida con CUIL, apellido y nombre, y sueldo neto.
     * @return Cadena formateada para listados de sueldos.
     */
    public String mostrarLinea(){
        return this.getCuil() +" "+ this.apeYNom() + "...........................$" + this.sueldoNeto();
    }
}