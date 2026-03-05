package PR6_5;

import java.util.ArrayList;

public class Planeta extends Astro{
    private int distanciaSol;
    private ArrayList<Satelite> satelites;

    public Planeta(String nombre, int masa, double tmpMedia, int distanciaSol){
        super(nombre, masa, tmpMedia);
        setDistanciaSol(distanciaSol);
        setSatelites(new ArrayList<>());
    }

    public int getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(int distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }

    public void setSatelites(ArrayList<Satelite> satelites) {
        this.satelites = satelites;
    }

    public String toString(){
       return super.toString() + getDistanciaSol();
    }

    public void mostrarAstros(){
        System.out.println("Satelites de " + nombre);
        for (Satelite sat: getSatelites()){
            System.out.println(satelites.get(getSatelites().indexOf(sat)));
        }
    }

    public void addSatelite(Satelite sat){
        getSatelites().add(sat);
    }

    public void removeSatelite(Satelite sat){
        getSatelites().remove(sat);
    }
}
