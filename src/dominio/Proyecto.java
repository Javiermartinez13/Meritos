package dominio;

public class Proyecto extends Merito{
    
    protected double financiación;

    public Proyecto (String titulo, double financiación)
    {
        super(titulo);
        this.financiación = financiación;
    }

    public double valorar()
    {
        return financiación/100000;
    }
}

