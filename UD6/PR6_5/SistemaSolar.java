package PR6_5;

import java.util.ArrayList;

public class SistemaSolar {
    protected String nombre;
    private ArrayList<Astro> planetas;

    public SistemaSolar(String nombre){
        this.nombre = nombre;
        setPlanetas(new ArrayList<>());
    }

    public ArrayList<Astro> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(ArrayList<Astro> planetas) {
        this.planetas = planetas;
    }

    public String toString() {
        return "Nombre: " + nombre;
    }

    public void mostrarAstros() {
        System.out.println("Planetas de " + nombre);
        for (Astro astro : getPlanetas()) {
            System.out.println(planetas.get(getPlanetas().indexOf(astro)));
        }
    }

    public void addPlaneta(Astro planeta) {
        getPlanetas().add(planeta);
    }

    public void removePlaneta(Astro planeta) {
        getPlanetas().remove(planeta);
    }
}
