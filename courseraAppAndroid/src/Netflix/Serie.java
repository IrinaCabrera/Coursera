package Netflix;

public class Serie extends Netflix implements Visualizable{

    //Atributo/s
    private int numTemporada;

    //constructor/es
    public Serie() {
    }

    public Serie(String titulo, String creador, int numTemporada) {
        super(titulo, creador);
        this.numTemporada = 0;
    }

    public Serie(String titulo, String genero, String creador, double duracion, int numTemporada) {
        super(titulo, genero, creador, duracion);
        this.numTemporada = numTemporada;
    }

    //Getter/s & Setter/s
    public int getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
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
        long min = (long) duracion;
        int seg = (int) ((duracion - min)*Math.pow(10,1));
        System.out.println("Se ha visto "+min+" minutos y "+seg+" segundos.");
    }

    //toString()
    @Override
    public String toString() {
        return "Serie{" +
                "numTemporada=" + numTemporada +
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
