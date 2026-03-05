package PR6_5;

public abstract class Astro extends  SistemaSolar{
    protected int masa;
    protected double tempMedia;

    public Astro(String nombre, int masa, double tempMedia){
        super(nombre);
        this.masa = masa;
        this.tempMedia = tempMedia;
    }

    public String toString(){
        return "Nombre: " + nombre + " Masa: " + masa + " Temperatura media: " + tempMedia;
    }
}
