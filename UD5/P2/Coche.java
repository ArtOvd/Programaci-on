package P2;

public class Coche {
    private String modelo;
    private String color;
    private boolean metalizada;
    private boolean matricula;
    private String tipoCoche;
    private int year;
    private String seguro;

    public Coche(String modelo, String color, boolean metalizada, boolean matricula, String tipoCoche, int year, String seguro) {
        setModel(modelo);
        setColor(color);
        setMetalizada(metalizada);
        setMatricula(matricula);
        setTipoCoche(tipoCoche);
        setYear(year);
        setSeguro(seguro);
    }

    public String getModel() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public boolean getMetalizada() {
        return metalizada;
    }

    public boolean getMatricula() {
        return matricula;
    }

    public String getTipoCoche() {
        return tipoCoche;
    }

    public int getYear() {
        return year;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setModel(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMetalizada(boolean metalizada) {
        this.metalizada = metalizada;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public void setTipoCoche(String tipoCoche) {
        if (tipoCoche != null && (tipoCoche.equals("MINI") ||
                tipoCoche.equals("UTILITARIO") ||
                tipoCoche.equals("FAMILIAR") ||
                tipoCoche.equals("DEPORTIVO"))) {
            this.tipoCoche = tipoCoche;
        } else {
            this.tipoCoche = null;
            System.out.println("Tipo de coche invalido");
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSeguro(String seguro) {
        if (seguro != null && (seguro.equals("TODO_RIESGO") || seguro.equals("TERCEROS"))) {
            this.seguro = seguro;
        } else {
            this.seguro = null;
            System.out.println("Tipo de seguro invalido");
        }
    }

    public void mostrar() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.color);
        System.out.println("Metalizada: " + this.metalizada);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Tipo de coche: " + this.tipoCoche);
        System.out.println("Año de fabricación: " + this.year);
        System.out.println("Tipo de seguro: " + this.seguro);
        System.out.println("---------------------------");
    }
}