package Ejercicios_LAB2;

public class UsoCuenta {

    public static void main(String[] args) {
	    CuentaCorriente Cuenta1= new CuentaCorriente(10000,"Horacio");
        CuentaCorriente Cuenta2= new CuentaCorriente(5000,"Esteban");
        Cuenta1.transferencia(Cuenta2,2500);
        System.out.println(Cuenta1.toString()+"\n\n"+Cuenta2.toString());
    }
}
