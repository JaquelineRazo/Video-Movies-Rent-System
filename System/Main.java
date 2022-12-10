import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Creacion del array para almacenar las peliculas
        ArrayList<Peliculas> peliculas = new ArrayList<Peliculas>();

        //Variables del programa
        int numPelis;
        int opciones = 0;
        int verificar;
        
        //Inicia ingreso de peliculas para crear el catalogo
        System.out.println("Cuantas peliculas vas a ingresar?\t");
        numPelis = in.nextInt();
        
        //Usamos un for loop para que el codigo se repita tantas peliculas el usuario indico que va a ingresar
        for(int i = 0; i < numPelis; i++)
        {
            in.nextLine();
            System.out.print("Cual es el nombre del producto " + (i + 1) + " ?\t");
            String nombre = in.nextLine();
            System.out.print("\n");
            System.out.print("Cual es la cantidad a pagar por rentar ese producto " + (i + 1) + " ?\t");
            float cantidad = in.nextFloat();
            System.out.print("\n");
            System.out.print("Cual es la cantidad de dias que se presta el producto cuando se renta " + (i + 1) + " ?\t");
            int dias = in.nextInt();
            System.out.print("\n");
            System.out.print("Esta disponible " + (i + 1) + " ? (true: no / false: si)\t");
            boolean dispo = in.nextBoolean();
            in.nextLine();
            System.out.print("\n");
            System.out.print("Cual es el genero " + (i + 1) + " ? (accion, fantasia, drama, comedia y aventura)\t");
            String gen = in.nextLine();
            System.out.print("\n");
            System.out.print("Cual es el ano de produccion " + (i + 1) + " ?\t");
            int pro = in.nextInt();
            System.out.print("\n");
            Peliculas peli = new Peliculas(nombre, cantidad, dias, dispo, gen, pro);
            peli.setNombreProducto(nombre);
            peli.setCantidadPagar(cantidad);
            peli.setCantidadDiasPrestamo(dias);
            peli.setDisponiblidad(dispo);
            peli.setGenero(gen);
            peli.setAnoProduccion(pro);

            //Almacenamos la pelicula en el array
            peliculas.add(peli);      
        }

        // Creacion del array para almacenar los videojuegos
        ArrayList<Juegos> videJuegos = new ArrayList<Juegos>();
        int numJuegos;

        //Inicia ingreso de videojuegos para crear el catalogo
        System.out.println("Cuantos videojuegos vas a ingresar?");
        numJuegos = in.nextInt();

        //Usamos un for loop para que el codigo se repita tantos videojuegos el usuario indico que va a ingresar
        for(int j = 0; j < numJuegos; j++)
        {
            in.nextLine();
            System.out.print("Cual es el nombre del producto " + (j + 1) + " ?\t");
            String nombre = in.nextLine();
            System.out.print("\n");
            System.out.print("Cual es la cantidad a pagar por rentar ese producto " + (j + 1) + " ?\t");
            float cantidad = in.nextFloat();
            System.out.print("\n");
            System.out.print("Cual es la cantidad de dias que se presta el producto cuando se renta " + (j + 1) + " ?\t");
            int dias = in.nextInt();
            System.out.print("\n");
            System.out.print("Esta disponible " + (j + 1) + " ? (true: no / false: si)\t");
            boolean dispo = in.nextBoolean();
            in.nextLine();
            System.out.print("\n");
            System.out.print("Cual es el estilo " + (j + 1) + " ? (accion, deportes y aventuras)\t");
            String estilo = in.nextLine();
            System.out.print("\n");
            System.out.print("En que plataforma se ejecuta " + (j + 1) + " ? (Xbox, PlayStation, Wii)\t");
            String plat = in.next();
            System.out.print("\n");
            Juegos video = new Juegos(nombre, cantidad, dias, dispo, estilo, plat);
            video.setNombreProducto(nombre);
            video.setCantidadPagar(cantidad);
            video.setCantidadDiasPrestamo(dias);
            video.setDisponiblidad(dispo);
            video.setEstilo(estilo);
            video.setPlataforma(plat);

            //Almacenamos el videojuego en el array
            videJuegos.add(video);      
        }


        //Despliegue de menu
        System.out.println("\n-----------------------------------\n");
        System.out.println("\n---- VIDEOCLUB GAMES & VIDEOS  ----\n");
        System.out.println("\n-----------------------------------\n");

        //Usamos la variable flag para que el programa regrese al menu de opciones despues de ejecutar la accion
        boolean flag=true;
        
        do {

            System.out.println("\nMenu de opciones:\n");
            System.out.println("[1] - Despliega todos los productos");
            System.out.println("[2] - Despliega todas las peliculas");
            System.out.println("[3] - Despliega todos los videojuegos");
            System.out.println("[4] - Checar si una pelicula está rentada");
            System.out.println("[5] - Verifica si un videojuego esta o no rentado");
            System.out.println("[6] - Devuelve la cantidad de peliculas que estan rentadas");
            System.out.println("[7] - Indica la cantidad de videojuegos cuya plataforma es Xbox One");
            System.out.println("[8] - Termina el programa");
            
            opciones = in.nextInt();
            boolean ver;

            /// Menu de opciones
            switch (opciones) {
                
                case 1:

                    System.out.println("\n----- PRODUCTOS ------\n\n");

                    System.out.println("\n----- PELICULAS ------\n");

                    for(int i = 0; i < numPelis; i++)
                    {
                        System.out.println("Nombre:                                          "+ peliculas.get(i).getNombreProducto()+
                                        "\nPrecio para renta:                               $"+peliculas.get(i).getCantidadPagar()+
                                        "\nDias disponibles para renta                       "+ peliculas.get(i).getCantidadDiasPrestamo()+
                                        "\nDisponibilidad (true: rentada/false: disponible): "+peliculas.get(i).getDisponiblidad()+
                                        "\nGenero:                                           "+ peliculas.get(i).getGenero()+
                                        "\nAno de produccion:                                "+ peliculas.get(i).getAnoProduccion()+"\n\n");
                    }

                    System.out.println("\n----- VIDEOJUEGOS ------\n");

                    for(int j = 0; j < numJuegos; j++)
                    {
                        System.out.println("Nombre:                                           "+ videJuegos.get(j).getNombreProducto()+
                                        "\nPrecio para renta:                               $"+videJuegos.get(j).getCantidadPagar()+
                                        "\nDias disponibles para renta                        "+ videJuegos.get(j).getCantidadDiasPrestamo()+
                                        "\nDisponibilidad (true: rentada/false: disponible):  "+videJuegos.get(j).getDisponiblidad()+
                                        "\nEstilo:                                            "+ videJuegos.get(j).getEstilo()+
                                        "\nPlataforma:                                        "+ videJuegos.get(j).getPlataforma()+"\n\n");
                    }

                    flag= true;
                    break;

                case 2:

                    System.out.println("\n----- PELICULAS ------\n");

                    for(int i = 0; i < numPelis; i++)
                    {
                        System.out.println("Nombre:                                          "+ peliculas.get(i).getNombreProducto()+
                                        "\nPrecio para renta:                               $"+peliculas.get(i).getCantidadPagar()+
                                        "\nDias disponibles para renta                       "+ peliculas.get(i).getCantidadDiasPrestamo()+
                                        "\nDisponibilidad (true: rentada/false: disponible): "+peliculas.get(i).getDisponiblidad()+
                                        "\nGenero:                                           "+ peliculas.get(i).getGenero()+
                                        "\nAno de produccion:                                "+ peliculas.get(i).getAnoProduccion()+"\n\n");
                    }
                    flag= true;
                    break;

                case 3:
                    
                    System.out.println("\n----- VIDEOJUEGOS ------\n");

                    for(int j = 0; j < numJuegos; j++)
                    {
                        System.out.println("Nombre:                                           "+ videJuegos.get(j).getNombreProducto()+
                                        "\nCPrecio para renta:                               $"+videJuegos.get(j).getCantidadPagar()+
                                        "\nDias disponibles para renta                        "+ videJuegos.get(j).getCantidadDiasPrestamo()+
                                        "\nDisponibilidad (true: rentada/false: disponible):  "+videJuegos.get(j).getDisponiblidad()+
                                        "\nEstilo:                                            "+ videJuegos.get(j).getEstilo()+
                                        "\nPlataforma:                                        "+ videJuegos.get(j).getPlataforma()+"\n\n");
                    }
                    flag= true;
                    break;

                case 4:
                    
                    
                    System.out.println("\n----- PELICULAS EN RENTA ------\n\n");
                    System.out.println("Nombre de peliculas: \n");

                    for(int i = 0; i < numPelis; i++)
                    {
                        System.out.println((i + 1) + ".-" + "Nombre: "+ peliculas.get(i).getNombreProducto()+"\n\n");
                    }
                    
                    System.out.println("Que pelicula quieres verificar?");
                    verificar = in.nextInt();

                    ver = peliculas.get(verificar-1).getDisponiblidad();

                    if (ver == true) {
                        System.out.println("\nPelicula no disponible");
                      } else {
                        System.out.println("\nPelicula disponible");
                      }

                    flag= true;
                    break;

                case 5:

                    System.out.println("\n----- VIDEOJUEGOS EN RENTA ------\n\n");

                    for(int j = 0; j < numJuegos; j++)
                    {
                        System.out.println((j + 1) + ".-" +"Nombre: "+ videJuegos.get(j).getNombreProducto()+"\n\n");
                    }

                    System.out.println("Que videojuego quieres verificar?");
                    verificar = in.nextInt();

                    ver = videJuegos.get(verificar-1).getDisponiblidad();

                    if (ver == true) {
                        System.out.println("\nJuego no disponible");
                      } 
                    else {
                        System.out.println("\nJuego disponible");
                      }



                    flag= true;
                    break;

                case 6:

                    Boolean peliRen;
                    System.out.println("\n----- CANTIDAD DE PELICULAS RENTADA ------\n\n");

                    int pelisRen = 0;

                    for(int i = 0; i < numPelis; i++)
                    {
                        peliRen = peliculas.get(i).getDisponiblidad();
                        
                        if (peliRen == true) {
                            pelisRen ++;
                          } 
                    }

                    System.out.println("Numero de peliculas rentadas: "+ pelisRen);
                    flag= true;
                    break;

                case 7:
                    System.out.println("\n----- VIDEOJUEGOS PARA XBOX ONE ------\n\n");
                    
                    int xbox = 0;
                    String plat;

                    for(int j = 0; j < numJuegos; j++)
                    {
                        plat = videJuegos.get(j).getPlataforma();
                        
                        if (plat.equals("Xbox")) {
                            xbox ++;
                          } 
                    }

                    System.out.println("Cantidad de videojuegos para Xbox: "+ xbox);

                    flag= true;
                    break;
                
                default:
					System.exit(0);

            }
        } while(flag=true);

    }  

    }
    

