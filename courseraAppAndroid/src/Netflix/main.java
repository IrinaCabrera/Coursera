package Netflix;

public class main {
    public static void main(String[]args){
        //Arreglos de 6 elementos, 2 por cada constructor. Es mejor así.
        Pelicula[] objPelicula = new Pelicula[5];
        Serie[] objSerie = new Serie[5];

        //Carga de objetos de Pelicula
        objPelicula[0]= new Pelicula();
        objPelicula[1]= new Pelicula("Contacto","Carl Sagan",1997);
        objPelicula[2]= new Pelicula("Hackers","United Artists",1995);
        objPelicula[3]= new Pelicula("Fausto","Épico","Goethe",106.0,1926);
        objPelicula[4]= new Pelicula("Dr. Jekyll and Mr. Hyde","Terror","Robert L. Stevenson",67.0,1920);

        //Carga objetos de Serie
        objSerie[0]= new Serie();
        objSerie[1]= new Serie("Naruto Shippuden","Masashi Kishimoto",1);
        objSerie[2]= new Serie("American Horror Story","James S. Levine , Mac Quayle",9);
        objSerie[3]= new Serie("Bates Motel","Terror psicológico"," Chris Bacon",5000.20,5);
        objSerie[4]= new Serie("Moon Lovers: Scarlet Heart Ryeo","Romance , Histórico","Jo Yoon-young",2200.55,1);

        //marcar visto Pelicula:
        objPelicula[3].marcarVisto(objPelicula[3].getVisto());
        objPelicula[4].marcarVisto(objPelicula[4].getVisto());
        //marcar visto Serie:
        objSerie[3].marcarVisto(objSerie[3].getVisto());
        objSerie[4].marcarVisto(objSerie[4].getVisto());

        //mejor hacerlo separados por si la dimensión cambia
        //mostrar peliculas vistas
        for(int i=0; i<objPelicula.length; i++){
            if(objPelicula[i].esVisto(objPelicula[i].getVisto())){
                System.out.println("Titulo: "+objPelicula[i].getTitulo());
                objPelicula[i].tiempoVisto(objPelicula[i].getDuracion());
            }
        }
        //mostrar series vistas
        for(int i=0; i<objSerie.length; i++){
            if(objSerie[i].esVisto(objSerie[i].getVisto())){
                System.out.println("Titulo: "+objSerie[i].getTitulo());
                objSerie[i].tiempoVisto(objSerie[i].getDuracion());
            }

        }
    }
}
