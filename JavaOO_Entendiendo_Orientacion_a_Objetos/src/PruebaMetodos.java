
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo = 200;
		miCuenta.depositar(300);
		System.out.println(miCuenta.saldo);
	}
}
