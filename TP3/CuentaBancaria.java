Clase CuentaBancaria {
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    public CuentaBancaria(int p_nroCuenta, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
    }
    
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    public double depositar(double p_importe) {
        return this.getSaldo() =+ p_importe;
    }
    
    public double extraer(double p_importe) {
        return this.getSaldo() =- p_importe;
    }
    
    public void mostrar() {
        System.out.println("- Cuenta Bancaria -\n" + "Titular: " + titular.getNomYApe() + " (" + titular.edad() + " años)\n" + "Saldo: " + this.getSaldo());
    }
    
    public String toString() {
        return String.format("\t" + this.getNroCuenta() + " " + titular.getNomYApe() + "\t" + this.getSaldo());
    }
}