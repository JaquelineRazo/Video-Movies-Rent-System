public class Producto {

    //Atributos del objeto 
    private String nombreProducto;
    private float cantidadPagar;
    private int cantidadDiasPrestamo;
    private boolean disponiblidad;

    // Creacion del constructor 
    public Producto(String nombreProducto, float cantidadPagar, int cantidadDiasPrestamo, boolean disponiblidad){
        this.nombreProducto = nombreProducto;
        this.cantidadPagar = cantidadPagar;
        this.cantidadDiasPrestamo = cantidadDiasPrestamo;
        this.disponiblidad = disponiblidad;
    }

    //Metodos del objeto
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public void setCantidadPagar(float cantidadPagar) {
        this.cantidadPagar = cantidadPagar;
    }

    public float getCantidadPagar(){
        return cantidadPagar;
    }

    public void setCantidadDiasPrestamo(int cantidadDiasPrestamo) {
        this.cantidadDiasPrestamo = cantidadDiasPrestamo;
    }

    public int getCantidadDiasPrestamo(){
        return cantidadDiasPrestamo;
    }

    public void setDisponiblidad (Boolean disponiblidad) {
        this.disponiblidad = disponiblidad;
    }

    public boolean getDisponiblidad(){
        return disponiblidad;
    }
    
}
