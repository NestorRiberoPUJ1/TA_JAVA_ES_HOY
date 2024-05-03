
public class CuentaBancariaTest {

    public static void main(String[] args) {

        CuentaBancaria cuentaNestor= new CuentaBancaria();
        CuentaBancaria cuentaCheco= new CuentaBancaria();

        cuentaNestor.consignarDinero(1000, "ahorros");
        cuentaNestor.consignarDinero(1200, "corriente");
        cuentaNestor.verSaldos();
        cuentaNestor.retirarDinero(800, "corriente");
        cuentaNestor.verSaldos();
        cuentaNestor.retirarDinero(800, "corriente");
        cuentaNestor.verSaldos();

        cuentaCheco.consignarDinero(2500, "corriente");


        System.out.println(CuentaBancaria.getCuentasCreadas());
        System.out.println(CuentaBancaria.getDineroAlmacenado());
        System.out.println(cuentaNestor.getNumeroCuenta());
        System.out.println(cuentaCheco.getNumeroCuenta());


    }

}
