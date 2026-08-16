public class MainCliente{
    public static void main(String[] args){
        int nroDNI = Integer.parseInt(args[0]);
        String apellido = args[1];
        String nombre = args[2];
        double saldo = Double.parseDouble(args[3]);
        
        Cliente c1 = new Cliente(nroDNI, apellido, nombre, saldo);
        c1.mostrar();
    }
}