public class MainAlumno{
    public static void main(String[] args){
        int lu = Integer.parseInt(args[0]);
        String nombre = args[1];
        String apellido = args[2];
        double nota1 = Double.parseDouble(args[3]);
        double nota2 = Double.parseDouble(args[4]);
        
        Alumno a1 = new Alumno(lu, nombre, apellido);
        
        //cargamos las notas mediante los setters publicos
        a1.setNota1(nota1);
        a1.setNota2(nota2);
        
        a1.mostrar();
    }
}