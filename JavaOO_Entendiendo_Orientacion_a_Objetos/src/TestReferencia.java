
public class TestReferencia {
 public static void main(String[] args) {
	//Aqui estamos declarando otra cuenta, pero por lo visto se genera
	//un ID diferente al que ya teniamos declarado para primeraCuenta
	Cuenta primeraCuenta = new Cuenta();
	primeraCuenta.setSaldo(100);
	//Al declarar esto se genera que los ID's de segunda y primer 
	//Cuenta sean los mismos y estos comparten los mismos atributos
	Cuenta segundaCuenta = primeraCuenta;
	System.out.println(primeraCuenta.getSaldo());
	System.out.println(segundaCuenta.getSaldo());
	
	
	if(primeraCuenta == segundaCuenta) {
		System.out.println("Son los mismos ID's");
	} else {
		System.out.println("No son los mismos ID's");
	}
	
	System.out.println(primeraCuenta);
	System.out.println(segundaCuenta);
}
}
