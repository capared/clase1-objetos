package Clase2;

public class CuentaCorriente {
    private int saldo;

    public CuentaCorriente() {

    }

    public CuentaCorriente(int saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cuenta) {
        this.saldo = cuenta.getSaldo();
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void ingreso(int valor){
        this.saldo += valor;
    }

    public void egreso(int valor){
        this.saldo -= valor;
    }

    public void reintegro(int reintegro){
        this.ingreso(reintegro);
        System.out.println("Se reintegró: " + reintegro);
    }

    public void transferencia(CuentaCorriente cuenta, int valor){
        this.egreso(valor);
        cuenta.ingreso(valor);
    }
}
