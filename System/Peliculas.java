public class Peliculas extends Producto{
    
    //Atributos del objeto 
    private String genero;
    private int anoProduccion;

    // Creacion del constructor 
    public Peliculas(String nombreProducto, float cantidadPagar, int cantidadDiasPrestamo, boolean disponiblidad, String genero,  int anoProduccion){
        super(nombreProducto, cantidadPagar, cantidadDiasPrestamo, disponiblidad);
        this.genero = genero;
        this.anoProduccion = anoProduccion;
        
    }

    //Metodos del objeto
    public void setGenero (String genero) {
        this.genero = genero;
    }

    public String getGenero(){
        return genero;
    }

    public void setAnoProduccion(int anoProduccion) {
        this.anoProduccion = anoProduccion;
    }

    public int getAnoProduccion(){
        return anoProduccion;
    } 

}
