package Netflix;

public class Netflix {
    private String titulo;
    private String genero;
    private String creador;
    private double duracion;
    private boolean visto;

    public Netflix() {
    }

    public Netflix(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.titulo = titulo;
        this.creador = creador;
        genero="";
        duracion=0;
        visto=false;
    }

    public Netflix(String titulo, String genero, String creador, double duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() { return creador; }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public boolean getVisto() { return visto; }

    public void setVisto(boolean visto) { this.visto = visto; }

    @Override
    public String toString() {
        return "Netflix{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", duracion=" + duracion +
                ", visto=" + visto +
                '}';
    }
}
