package FamiliaInclusiva;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    private Persona conyuge;
    private Persona progenitorA;
    private Persona progenitorB;
    ArrayList<Persona> hijos = new ArrayList<Persona>();
    ArrayList<Persona> hermanos = new ArrayList<Persona>();

    public Persona(String nombre, String apellido, int edad) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public Persona getConyuge() {
        return conyuge;
    }

    public Persona getProgenitorA() {
        return progenitorA;
    }

    public Persona getProgenitorB() {
        return progenitorB;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setConyuge(Persona persona) {
        this.conyuge = persona;
        persona.conyuge = this;
    }

    public void setProgenitorA(Persona progenitorA) {
        this.progenitorA = progenitorA;
        progenitorA.addHijo(this);
    }

    public void setProgenitorB(Persona progenitorB) {
        this.progenitorB = progenitorB;
    }

    public void addHijo(Persona hijo) {
        // Le asignamos a hijo que 'this' es progenitor
        if (hijo.getProgenitorA() == null) {
            hijo.setProgenitorA(this);
        } else if (hijo.getProgenitorB() == null && hijo.getProgenitorA() != this) {
            hijo.setProgenitorB(this);
        }
        //
        if (this.conyuge != null && hijo.getProgenitorB() == null && hijo.getProgenitorA() != this.conyuge) {
            hijo.setProgenitorB(this.conyuge);
            if (!this.conyuge.hijos.contains(hijo)) {
                this.conyuge.hijos.add(hijo);
            }
        }
        for (Persona hijoExistente : this.hijos) {
            if (hijoExistente != hijo) {
                if (!hijo.hermanos.contains(hijoExistente)) {
                    hijo.hermanos.add(hijoExistente);
                }
                if (!hijoExistente.hermanos.contains(hijo)) {
                    hijoExistente.hermanos.add(hijo);
                }
            }
        }
        if (!this.hijos.contains(hijo)) {
            this.hijos.add(hijo);
        }
    }

    public void addHermano(Persona hermano) {
        if (this.progenitorA == null) {
            this.progenitorA = hermano.getProgenitorA();
        }
        if (this.progenitorB == null) {
            this.progenitorB = hermano.getProgenitorB();
        }
        if (!this.hermanos.contains(hermano)) {
            this.hermanos.add(hermano);
            hermano.hermanos.add(this);
        }
        for (Persona h : hermano.hermanos) {
            if (h != this && !this.hermanos.contains(h)) {
                this.hermanos.add(h);
                h.hermanos.add(this);
            }
        }
        if (this.progenitorA != null && !this.progenitorA.hijos.contains(this)) {
            this.progenitorA.hijos.add(this);
        }
        if (this.progenitorB != null && !this.progenitorB.hijos.contains(this)) {
            this.progenitorB.hijos.add(this);
        }
    }

    public void printInfoFamilia() {
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        if (getProgenitorA() != null) {
            System.out.println("Progenit@r: " + getProgenitorA().getNombre() + " " + getProgenitorA().getApellido());
        } else {
            System.out.println("Progenit@r: Sin Progenit@r");
        }
        if (getProgenitorB() != null) {
            System.out.println("Progenit@r: " + getProgenitorB().getNombre() + " " + getProgenitorB().getApellido());
        } else {
            System.out.println("Progenit@r: Sin Progenit@r");
        }
        if (!hermanos.isEmpty()) {
            System.out.print("Hermanos: ");
            for (Persona hermano : hermanos) {
                System.out.print(hermano.getNombre() + " " + hermano.getApellido() + ", ");
            }
            System.out.println();
        } else {
            System.out.println("Hermanos: Sin hermanos");
        }

        if (!hijos.isEmpty()) {
            System.out.print("Hijos: ");
            for (Persona hijo : hijos) {
                System.out.print(hijo.getNombre() + " " + hijo.getApellido() + ", ");
            }
            System.out.println();
        } else {
            System.out.println("Hijos: Sin Hijos");
        }
    }

}
