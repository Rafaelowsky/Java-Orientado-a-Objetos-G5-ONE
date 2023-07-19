
public class CrearCuenta {
	public static void main(String[] args) {
		//Con esto llamamos a la clase cuenta para poder generar datos con ella
		//con el comando "new" hacemos referencia a hacer espacio en la memoria para recibir nuevos datos
		//Variable       ->      Valor
		//Variable       ->     12384DA
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.setSaldo(1000);
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.setSaldo(500);
		System.out.println(segundaCuenta.getSaldo());
		
		primeraCuenta.setSaldo(500);
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
		if (primeraCuenta.getSaldo() == segundaCuenta.getSaldo()) {
			System.out.println("Tienen los mismos atributos");
		} else {
			System.out.println("No tienen los mismos atributos");
		}
	}
}
