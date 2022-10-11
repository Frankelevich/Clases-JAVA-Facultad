package Ejercicios_LAB2;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente(double saldo, String nombreTitular) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void transferencia (CuentaCorriente cuentaDestino, double importe){
        this.saldo-=importe;
        cuentaDestino.saldo+=importe;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "saldo=" + saldo +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                '}';
    }
}
