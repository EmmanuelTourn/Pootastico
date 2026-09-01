/**
 * Representa a un laboratorio productor de medicamentos con su información de contacto,
 * compra mínima y día de entrega.
 * * @author Luque Emmanuel y Gonzalez Exequiel
 */
public class Laboratorio{

    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    /**
     * Constructor completo con todos los datos del laboratorio.
     * @param p_nombre Nombre del laboratorio.
     * @param p_domicilio Dirección del laboratorio.
     * @param p_telefono Teléfono de contacto.
     * @param p_compraMin Monto o cantidad de compra mínima.
     * @param p_diaEnt Día pactado de entrega.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMin);
        this.setDiaEntrega(p_diaEnt);
    }
    
    /**
     * Constructor sobrecargado para inicializar datos básicos de contacto.
     * @param p_nombre Nombre del laboratorio.
     * @param p_domicilio Dirección del laboratorio.
     * @param p_telefono Teléfono de contacto.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
    }
    
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    /**
     * Asigna el nombre del laboratorio.
     * @param p_nombre Nombre del laboratorio.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Asigna el domicilio del laboratorio.
     * @param p_domicilio Dirección del laboratorio.
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    /**
     * Asigna el teléfono del laboratorio.
     * @param p_telefono Teléfono de contacto.
     */
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    
    /**
     * Asigna la compra mínima del laboratorio.
     * @param p_compraMin Valor de compra mínima.
     */
    private void setCompraMinima(int p_compraMin){
        this.compraMinima = p_compraMin;
    }
    
    /**
     * Asigna el día de entrega pactado.
     * @param p_diaEnt Día de entrega.
     */
    private void setDiaEntrega(int p_diaEnt){
        this.diaEntrega = p_diaEnt;
    }
    
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    /**
     * @return El nombre del laboratorio.
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * @return El domicilio del laboratorio.
     */
    public String getDomicilio(){
        return domicilio;
    }
    
    /**
     * @return El teléfono de contacto.
     */
    public String getTelefono(){
        return telefono;
    }
    
    /**
     * @return El valor de compra mínima.
     */
    public int getCompraMinima(){
        return compraMinima;
    }
    
    /**
     * @return El día pactado de entrega.
     */
    public int getDiaEntrega(){
        return diaEntrega;
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    /**
     * Actualiza el valor de la compra mínima permitida.
     * @param p_compraMin Nuevo valor de compra mínima.
     */
    public void nuevaCompraMinima(int p_compraMin){
        //La variable que quiero actualizar          el nuevo valor
        compraMinima = p_compraMin;
    }
    
    /**
     * Actualiza el día pactado para la entrega.
     * @param p_diaEnt Nuevo día de entrega.
     */
    public void nuevoDiaEntrega(int p_diaEnt){
        diaEntrega = p_diaEnt;
    }
    
    /**
     * Retorna una cadena con la información de contacto del laboratorio.
     * @return Cadena formateada con nombre, domicilio y teléfono.
     */
    public String mostrar(){ //El UML nos dice que es de tipo String entonces necesita "retornar" algo, a diferencia del Objeto que era de tipo void
        return "Laboratorio: " + nombre + "\nDomicilio: " + domicilio + " - Telefono: " + telefono + "\n";
    }
    
}