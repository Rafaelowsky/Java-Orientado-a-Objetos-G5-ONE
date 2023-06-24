
public class TestReferencia3 {
	public static void main(String[] args) {
		Cuenta cliente = new Cuenta();
		cliente.titular.nombre = "diego";
		System.out.println(cliente.titular.nombre);
	}
}
