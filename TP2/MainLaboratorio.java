
public class MainLaboratorio{
   
    public static void main(String[] args){
        Laboratorio l1 = new Laboratorio("Tutuca S.A.", "Mi casa", "3794-123456");
        Laboratorio l2 = new Laboratorio("Farfalinio", "Jujuy 739", "3794-123456");
        Laboratorio l3 = new Laboratorio("RamonMamon", "Rioja 888", "3794-123456");
        
        System.out.println(l1.mostrar() + "\n");
        System.out.println(l2.mostrar() + "\n");
        System.out.println(l3.mostrar());
    }


}