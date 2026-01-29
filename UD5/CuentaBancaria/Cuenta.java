package CuentaBancaria;

public class Cuenta {
    private Cliente cliente;
    private double saldo;

    public Cuenta(Cliente cliente) {
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
        if (saldo < 0) {
            saldo = this.saldo;
        }
        this.saldo = saldo;
    }

}
