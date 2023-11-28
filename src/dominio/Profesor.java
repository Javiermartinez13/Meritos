package dominio;
import java.util.ArrayList;
public abstract class Profesor {

    protected ArrayList<Merito> meritos = new ArrayList<>();
    protected String nombre;
    public Profesor(String nombre)
    {
        meritos = new ArrayList<>();
        this.nombre = nombre;

    }
    
    public abstract double calcularValoracion();
    
    public Profesor annadirMerito(Merito m)
    {
        meritos.add(m);
        return this;
    }

}