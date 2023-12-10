package dominio;

public class Articulo extends Merito{

    protected double impacto;
    
    public Articulo(String titulo, double impacto)
    {
        super(titulo);
        this.impacto = impacto;
    }

    public double valorar()
    {
        return impacto;
    }

    public String toString()
    {
        return super.toString() + "Impacto: " + impacto;
    }
}
