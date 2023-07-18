
public class PruebaAcceso {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		cuenta.saldo = 200;
		cuenta.retirar(300);
		
		// Si nosotros cambiamos el saldo = private, este no se podra modificar desde aqui
		// se tiene que modificar desde la clase Cuenta
		System.out.println(cuenta.saldo);
	}
}
