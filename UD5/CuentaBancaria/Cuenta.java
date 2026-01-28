package CuentaBancaria;

public class Cuenta {
    private String referencia;
    private double saldo;

    public Cuenta(String referencia, double saldo) {
        setReferencia(referencia);
        setSaldo(saldo);
    }

    public String getReferencia() {
        return referencia;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setReferencia(String referencia) {
        if (referencia != null && referencia.length() >= 10) {
            this.referencia = referencia;
        }  else {
            this.referencia = null;
        }
    }
    public void setSaldo(double saldo) {
        if (saldo >= -100) {
            this.saldo = saldo;
        } else {
            this.saldo = -100;
        }
    }

}
