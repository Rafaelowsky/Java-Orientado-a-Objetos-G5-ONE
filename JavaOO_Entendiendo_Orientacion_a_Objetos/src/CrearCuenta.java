
public class CrearCuenta {
	public static void main(String[] args) {
		//Con esto llamamos a la clase cuenta para poder generar datos con ella
		//con el comando "new" hacemos referencia a hacer espacio en la memoria para recibir nuevos datos
		//Variable       ->      Valor
		//Variable       ->     12384DA
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 1000;
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 500;
		System.out.println(segundaCuenta.saldo);
		
		primeraCuenta.saldo = 500;
		//Con esto podemos ver que ID's tienen los objetos
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		//Con esto podemos ver que aunque tienen los mismos atributos
		//tienen diferentes IDs
		if(primeraCuenta == segundaCuenta) {
			System.out.println("Son los mismos ID's");
		} else {
			System.out.println("No son los mismos ID's");
		}
		
		//Y aunque tengan diferentes atributos pero pueden contener
		//los mismos atributos independientes entre si
		if (primeraCuenta.saldo == segundaCuenta.saldo) {
			System.out.println("Tienen los mismos atributos");
		} else {
			System.out.println("No tienen los mismos atributos");
		}
	}
}
