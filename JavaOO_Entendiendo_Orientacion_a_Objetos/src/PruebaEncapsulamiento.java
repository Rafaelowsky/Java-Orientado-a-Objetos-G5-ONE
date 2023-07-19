
public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("asdf99s9s");
		cliente.setTelefono("2763264398");
		
		System.out.println(cliente.getNombre());
		System.out.println();
	}
}
