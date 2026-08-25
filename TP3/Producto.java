public class Producto{
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;

    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_lab);
        this.setStock(0);
    }

    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setLaboratorio(p_lab);
        this.setStock(0);
    }

    private void setLaboratorio(Laboratorio p_lab){
        this.laboratorio = p_lab;    
    }

    public Laboratorio laboratorio(){
        return laboratorio;
    }

    private void setStock(int p_stock){
        this.stock = p_stock;
    }

    public int getStock(){
        return stock;
    }

    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }

    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }

    private void setDescripcion(String p_desc){
        this.descripcion = p_desc;
    }

    private void setCosto(double p_costo){
        this.costo = p_costo;
    }

    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }

    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }

    public int getCodigo(){
        return  codigo;
    }

    public String getRubro(){
        return rubro;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getCosto(){
        return costo;
    }

    public double getPorcPtoRepo(){
        return porcPtoRepo;
    }

    public int getExistMinima(){
        return existMinima;
    }

    public void mostrar(){
        System.out.println(this.laboratorio.mostrar());
        System.out.println("Rubro: " + this.getRubro() + "\nDescripcion: " + this.getDescripcion());
        System.out.println("Precio Costo: " + this.getCosto() + "\nStock: " + this.getStock() + " - Stock Valorizado: $" + this.stockValorizado());
    }

    public void ajuste(int p_cantidad){
        this.setStock(this.getStock() + p_cantidad); //El set guarda el resultado final. El get recupera el stock que ya tenia guardado y el parametro define cuánto se altera. 
    }

    public double stockValorizado(){
        double totalCosto = (this.getStock() * this.getCosto());
        return totalCosto + (totalCosto * 0.12);
    }

    public double precioLista(){
        return this.getCosto() + (this.getCosto() * 0.12); //pones costo mas costo por 0.12 porque si haces solo 100 x 0.12 es 12 pesos Y NO PUE
    }

    public double precioContado(){
        return this.precioLista() - (this.precioLista() * 0.05); 
    }

    public String mostrarLinea(){
        return this.getDescripcion() + "   " + this.precioLista() + "   " + this.precioContado();
    }

    public void ajustarPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce); 
    }

    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }
}