
public class Alumno{
    
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;

    
    public Alumno(int p_lu, String p_nombre, String p_apellido){
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }
    
    
    private void setLu(int p_lu){
        this.lu = p_lu;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;    
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;    
    }
    
    public int getLu(){
        return lu;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setNota1(double p_nota){
        this.nota1 = p_nota;
    }
    
    public void setNota2(double p_nota){
        this.nota2 = p_nota;
    }
    
    public double getNota1(){
        return nota1;
    }
    
    public double getNota2(){
        return nota2;
    }
    
    
    
    private boolean aprueba(){ //evaluamos si la nota el promedio es mayor a 7 y si las notas son mayores a 6 entonces da true o false
        if((promedio() > 7) && (this.getNota1()  >= 6 && this.getNota2() >= 6)){
            return true;
        } else {
            return false;
        }
    }
    
    private String leyendaAprueba(){
        if(this.aprueba()){
            return "APROBADO"; 
        } else {
           return "DESAPROBADO";  
        }
    }
    
    public double promedio(){
        double promedio = ((this.nota1 + this.nota2) / 2);
        return promedio;
    }
    
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("LU: " + this.getLu() + "   " + "Notas: " + this.getNota1() +" - "+ this.getNota2()); 
        System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());//no puse un \n porque al finalizar un println automaticamente ya hace un salto de linea, que loco
    }
}