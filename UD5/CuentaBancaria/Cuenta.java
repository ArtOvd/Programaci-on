package CuentaBancaria;

public class Cuenta {
    private Cliente cliente;
    private double saldo;
    private final String iban;
    private static int contador = 0;

    public Cuenta(Cliente cliente) {
        iban = "ES" + String.format("%04d", contador++);
        setCliente(cliente);
        this.saldo = 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public int getContador() {
        return contador;
    }

}
