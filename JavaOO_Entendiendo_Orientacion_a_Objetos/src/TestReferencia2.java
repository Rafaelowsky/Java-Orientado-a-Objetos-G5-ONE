
public class TestReferencia2 {
	public static void main(String[] args) {
		
	Cliente diego = new Cliente(); 
	diego.setNombre("diego");
	diego.setDocumento("319055539");
	diego.setTelefono("55 71202614");
	
	Cuenta cuentaDiego = new Cuenta();
	cuentaDiego.titular = diego;
	System.out.println(cuentaDiego.titular.getTelefono());
	}
	
}
