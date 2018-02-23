package mx.edu.ittepic.lab_cardview_15;

/**
 * Created by Carolina Mondragon on 22/02/2018.
 */

public class musica{
    int id;
    String genero;
    String cancion;
    String foto;
    int color;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public musica(int id, String genero, String cancion, String foto, int color) {
        this.id = id;
        this.genero = genero;
        this.cancion = cancion;
        this.foto = foto;
        this.color = color;
    }
}
