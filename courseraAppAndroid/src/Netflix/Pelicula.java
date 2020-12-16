package Netflix;

public class Pelicula extends Netflix implements Visualizable{
    //Atributo/s
    private int anio;

    //constructor/es
    public Pelicula() {
    }

    public Pelicula(String titulo, String creador, int anio) {
        super(titulo, creador);
        this.anio = 0;
    }

    public Pelicula(String titulo, String genero, String creador, double duracion, int anio) {
        super(titulo, genero, creador, duracion);
        this.anio = anio;
    }

    //getter/s & setter/s
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //marcarVisto
    public void marcarVisto(boolean visto){
        if(!visto){
            setVisto(true);
        }
    }
    //esVisto()
    public boolean esVisto(boolean visto){
        return visto;
    }
    //tiempoVisto()
    public void tiempoVisto(double duracion){
        int min = (int) duracion;
        int seg = (int) ((duracion - min)*Math.pow(10,1));
        System.out.println("Se ha visto "+min+" minutos y "+seg+" segundos.");
    }
    //toString()
    @Override
    public String toString() {
        return "Pelicula{" +
                "anio=" + anio +
                '}';
    }

    @Override
    public void marcarVisto() {

    }

    @Override
    public boolean esVisto() {
        return false;
    }

    @Override
    public void tiempoVisto() {

    }
}
