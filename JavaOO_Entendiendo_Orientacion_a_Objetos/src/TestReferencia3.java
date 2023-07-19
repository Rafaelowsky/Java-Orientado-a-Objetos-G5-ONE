
public class TestReferencia3 {
	public static void main(String[] args) {
		Cuenta cliente = new Cuenta();
		cliente.titular.setNombre("diego");
		System.out.println(cliente.titular.getNombre());
	}
}
