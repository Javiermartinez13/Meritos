package dominio;

public class ProfesorTitular extends Profesor{
    
    public ProfesorTitular(String nombre)
    {
        super(nombre);
    }
    public double calcularValoracion()
    {
        
        double suma = 0;
        if(meritos.size()==0)
        {
            return 0.0;
        }
        else
        {
            for(Merito m : meritos)
            {
                suma += m.valorar();
            }
            return suma/meritos.size();
        }
    }
}
