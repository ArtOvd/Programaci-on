package MiniRPG;

public class Ballestero extends Arquero {
    private boolean recargando;
    public Ballestero(String nombre, int vida, int ataqueBase, int nivel) {
        super(nombre, vida, ataqueBase, nivel);
        setRecargado(false);
    }

    public boolean getRecargado() {
        return recargando;
    }

    public void setRecargado(boolean recargado) {
        this.recargando = recargado;
    }

    @Override
    public void atacar(Personaje enemigo) {
        if (recargando) {
            System.out.println("Ataque de ballestero todavía está recargando...");
            setRecargado(false);
        } else {
            System.out.println(this.getClass().getSimpleName() + " " + this.nombre + " ataca a " + enemigo.getClass().getSimpleName() + " " + enemigo.nombre);
            enemigo.recibirDano(ataqueBase + (nivel * 5));
            System.out.println(enemigo.getClass().getSimpleName() + " " + enemigo.nombre + " ahora tiene " + enemigo.vida + " HP");
            setRecargado(true);
        }

    }
}
