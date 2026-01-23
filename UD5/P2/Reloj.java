package P2;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    ;

    public Reloj(int hora, int minuto, int segundo) {
        setReloj(hora, minuto, segundo);
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 24) {
            System.out.println("Hora no valida.");
        } else {
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            System.out.println("Minuto no valido.");
        } else {
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            System.out.println("Segundo no valido.");
        } else {
            this.segundo = segundo;
        }
    }

    public void setReloj(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public String dimeHora() {
        return getHora() + ":" + getMinuto() + ":" + getSegundo();
    }

    public String dimeHora12() {
        if (getHora() > 12) {
            return getHora() - 12 + "pm" + ":" + getMinuto() + ":" + getSegundo();
        } else {
            return getHora() + "am" + ":" + getMinuto() + ":" + getSegundo();
        }
    }

    public void imprimirHora() {
        System.out.println(dimeHora());
    }

    public void imprimirHora12() {
        System.out.println(dimeHora12());
    }

    public void tick() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;

            if (minuto == 60) {
                minuto = 0;
                hora++;

                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }
}
