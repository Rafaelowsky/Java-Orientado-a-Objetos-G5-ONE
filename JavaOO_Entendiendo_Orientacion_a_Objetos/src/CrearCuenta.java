
public class CrearCuenta {
	public static void main(String[] args) {
		//Con esto llamamos a la clase cuenta para poder generar datos con ella
		//con el comando "new" hacemos referencia a hacer espacio en la memoria para recibir nuevos datos
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 1000;
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 500;
		System.out.println(segundaCuenta.saldo);
	}
}
