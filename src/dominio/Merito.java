package dominio;

import java.io.Serializable;

public abstract class Merito implements Serializable {

    protected String titulo;

    public Merito(String titulo)
    {
        this.titulo = titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    public String getTitulo()
    {
        return titulo;
    }

    public abstract double valorar();

    public String toString()
    {
        return "Meritos: " + titulo + "\nValoracion: " + valorar();
    }
}





