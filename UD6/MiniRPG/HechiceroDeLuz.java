package MiniRPG;

public class HechiceroDeLuz extends Mago implements ISanador {

    public HechiceroDeLuz(String nombre, int vida, int ataqueBase, int nivel, int mana) {
        super(nombre, vida, ataqueBase, nivel, mana);
    }

    @Override
    public void habilidadEspecial(Personaje enemigo) {
        if (this.mana >= 6) {
            if (enemigo instanceof HechiceroOscuro) {
                enemigo.recibirDano((ataqueBase + nivel) * 4);
            } else {
                enemigo.recibirDano((ataqueBase + nivel) * 2);
            }
            this.mana -= 6;
        } else {
            System.out.println("No hay mana para atacar.");
        }
    }

    @Override
    public void sanar(Personaje objetivo) {
        if (objetivo.vida >= objetivo.vidaMax) {
            return;
        }
        int vidaAntes = objetivo.vida;
        objetivo.vida = Math.min(objetivo.vida + getCantidadSanacion(), objetivo.vidaMax);
        int curado = objetivo.vida - vidaAntes;
        System.out.println(this.nombre + " sana a " + objetivo.nombre + " +" + curado + " HP");
    }

    @Override
    public int getCantidadSanacion() {
        return 20;
    }


}
