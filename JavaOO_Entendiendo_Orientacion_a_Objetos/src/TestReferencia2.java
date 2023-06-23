
public class TestReferencia2 {
	public static void main(String[] args) {
		
	Cliente diego = new Cliente(); 
	diego.nombre = "diego";
	diego.documento = "319055539";
	diego.telefono = "55 71202614";
	
	Cuenta cuentaDiego = new Cuenta();
	cuentaDiego.titular = diego;
	System.out.println(cuentaDiego.titular.telefono);
	}
	
}
