
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo = 200;
		miCuenta.depositar(300);
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.saldo);
		
		Cuenta cuentaJimena = new Cuenta ();
		cuentaJimena.depositar(1000);
		
		if (cuentaJimena.transferir(400, miCuenta)) {
			System.out.println("Transferencia exitosa");
		} else { System.out.println("Imposible de realizar"); 
		
		}
		System.out.println(cuentaJimena.saldo);
		System.out.println(miCuenta.saldo);
	}
}
