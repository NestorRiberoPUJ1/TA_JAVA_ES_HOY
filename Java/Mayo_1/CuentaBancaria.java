
public class CuentaBancaria {

    private String numeroCuenta;
    private double saldoAhorros;
    private double saldoCorriente;

    private static int cuentasCreadas = 0;
    private static double dineroAlmacenado = 0.0;

    public CuentaBancaria() {
        this.numeroCuenta = generateNumeroCuenta();
        cuentasCreadas += 1;
    }

    private static String generateNumeroCuenta() {
        String cuenta = "";
        for (int i = 0; i < 10; i++) {
            int aleatorio = ((int) (Math.random() * 10)) + 48;
            char num = (char) aleatorio;
            cuenta += num;
        }
        return cuenta;
    }

    public void consignarDinero(double cantidad, String cuenta) {
        switch (cuenta) {
            case "ahorros":
                this.saldoAhorros += cantidad;
                dineroAlmacenado += cantidad;
                break;
            case "corriente":
                this.saldoCorriente += cantidad;
                dineroAlmacenado += cantidad;
                break;

            default:
                break;
        }

    }

    public void retirarDinero(double cantidad, String cuenta) {
        switch (cuenta) {
            case "ahorros":
                if (cantidad <= this.saldoAhorros) {
                    this.saldoAhorros -= cantidad;
                    dineroAlmacenado -= cantidad;
                } else {
                    System.out.println("FONDOS INSUFICIENTES");
                }
                break;
            case "corriente":
                if (cantidad <= this.saldoCorriente) {
                    this.saldoCorriente -= cantidad;
                    dineroAlmacenado -= cantidad;
                } else {
                    System.out.println("FONDOS INSUFICIENTES");
                }
                break;

            default:
                break;
        }

    }

    public void verSaldos() {
        System.out.println("SALDO AHORROS: $" + this.saldoAhorros);
        System.out.println("SALDO CORRIENTE: $" + this.saldoCorriente);
    }

    /* GETTERS */

    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    public double getSaldoCorriente() {
        return saldoCorriente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public static int getCuentasCreadas() {
        return cuentasCreadas;
    }

    public static double getDineroAlmacenado() {
        return dineroAlmacenado;
    }

}