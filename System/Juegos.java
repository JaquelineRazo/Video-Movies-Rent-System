public class Juegos extends Producto{

    //Atributos del objeto 
    private String estilo;
    private String plataforma;

    // Creacion del constructor 
    public Juegos(String nombreProducto, float cantidadPagar, int cantidadDiasPrestamo, boolean disponiblidad, String estilo, String plataforma){
    super(nombreProducto, cantidadPagar, cantidadDiasPrestamo, disponiblidad);
        this.estilo = estilo;
        this.plataforma = plataforma;

    }

    //Metodos del objeto
    public void setEstilo (String estilo) {
        this.estilo = estilo;
    }

    public String getEstilo(){
        return estilo;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getPlataforma (){
        return plataforma;
    } 


}
