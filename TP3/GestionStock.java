public class GestionStock{
    public static void main(String[] args){
        Laboratorio unLab = new Laboratorio("Kanga", "Arequipa 3325", "3794-123456", 500, 2);
        
        Producto unProducto = new Producto(3324, "Salud", "Carigram", 83000, 100, 2, unLab);
        
        unProducto.ajuste(500);
        
        
        
        unProducto.mostrar();
    }
}