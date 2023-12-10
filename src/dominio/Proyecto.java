package dominio;

public class Proyecto extends Merito{
    
    protected double financiacion;

    public Proyecto (String titulo, double financiacion)
    {
        super(titulo);
        this.financiacion = financiacion;
    }

    public double valorar()
    {
        return financiacion/100000;
    }
    public String toString()
    {
        return super.toString() + "Financiacion: " + financiacion;
    }



}

