/**
 * Representa a un cliente con sus datos personales y saldo en cuenta,
 * permitiendo consultar su información y realizar actualizaciones de saldo.
 * * @author Luque Emmanuel y Gonzalez Exequiel
 */
public class Cliente{
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;

    /**
     * Constructor que inicializa los datos personales y el saldo del cliente.
     * @param p_dni Número de DNI del cliente.
     * @param p_apellido Apellido del cliente.
     * @param p_nombre Nombre del cliente.
     * @param p_importe Saldo inicial del cliente.
     */
    public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe){
        this.setNroDNI(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
    }

    /**
     * Asigna el número de DNI.
     * @param p_dni Número de DNI.
     */
    private void setNroDNI(int p_dni){
        this.nroDNI = p_dni;
    }

    /**
     * Asigna el apellido del cliente.
     * @param p_apellido Apellido del cliente.
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }

    /**
     * Asigna el nombre del cliente.
     * @param p_nombre Nombre del cliente.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * Asigna el saldo de la cuenta.
     * @param p_importe Monto a asignar.
     */
    private void setSaldo(double p_importe){
        this.saldo = p_importe;
    }

    /**
     * @return El número de DNI del cliente.
     */
    public int getNroDNI(){
        return nroDNI;
    }

    /**
     * @return El apellido del cliente.
     */
    public String getApellido(){
        return apellido;
    }

    /**
     * @return El nombre del cliente.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo(){
        return saldo;
    }

    //BASTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

    /**
     * Muestra por consola la información completa del cliente y su saldo actual.
     */
    public void mostrar(){
        System.out.println("- Cliente -\n"); //continuar con Exe
        System.out.println("Nombre y Apellido: " + nomYape() +"(" + this.getNroDNI() + ")" + "\nSaldo: $" + this.getSaldo());
    }

    /**
     * Reemplaza el saldo actual por un nuevo importe y retorna el nuevo saldo.
     * @param p_importe Nuevo importe para la cuenta.
     * @return El nuevo saldo asignado.
     */
    public double nuevoSaldo(double p_importe){
        this.saldo = p_importe; //saldo viejo por el nuevo
        return this.saldo;
    }

    /**
     * Agrega un importe al saldo existente y retorna el saldo actualizado.
     * @param p_importe Monto a sumar al saldo actual.
     * @return El saldo total resultante.
     */
    public double agregarSaldo(double p_importe){
        this.saldo = this.saldo + p_importe; //suma el nuevo importe al saldo que ya tenía
        return this.saldo;
    }

    /**
     * Retorna el apellido y nombre en formato "Apellido Nombre".
     * @return Cadena con el apellido y nombre.
     */
    public String apeYnom(){
        return apellido +" "+ nombre;
    }

    /**
     * Retorna el nombre y apellido en formato "Nombre Apellido".
     * @return Cadena con el nombre y apellido.
     */
    public String nomYape(){
        return nombre +" "+ apellido;
    }
}