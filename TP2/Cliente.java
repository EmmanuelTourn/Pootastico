public class Cliente{
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;

    
    public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe){
        this.setNroDNI(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
    }
    
    private void setNroDNI(int p_dni){
        this.nroDNI = p_dni;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setSaldo(double p_importe){
        this.saldo = p_importe;
    }
    
    public int getNroDNI(){
        return nroDNI;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    //BASTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
    
    public void mostrar(){
        System.out.println("- Cliente -\n"); //continuar con Exe
        System.out.println("Nombre y Apellido: " + nomYape() +"(" + this.getNroDNI() + ")" + "\nSaldo: $" + this.getSaldo());
    }
    
    public double nuevoSaldo(double p_importe){
        this.saldo = p_importe; //saldo viejo por el nuevo
        return this.saldo;
    }
    
    public double agregarSaldo(double p_importe){
        this.saldo = this.saldo + p_importe; //suma el nuevo importe al saldo que ya tenía
        return this.saldo;
    }
    
    public String apeYnom(){
        return apellido +" "+ nombre;
    }
    
    public String nomYape(){
        return nombre +" "+ apellido;
    }
}