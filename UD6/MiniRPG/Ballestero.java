package MiniRPG;

public class Ballestero extends Arquero {

    private boolean recargando = false;

    public Ballestero(String nombre, int vida, int ataqueBase, int nivel) {
        super(nombre, vida, ataqueBase, nivel);
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
            setRecargado(false);
        } else {
            enemigo.recibirDano(ataqueBase + (nivel * 5));
            setRecargado(true);
        }

    }
}
