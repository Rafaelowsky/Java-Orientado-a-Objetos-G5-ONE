
public class EjemplosCondicionales {
	public static void main(String[] args) {
		System.out.println();
		
		//Aqui comenzamos a utilizar las condicionales dentro de Java
		int edad = 17;
		int cantidad = 2;
		
		if (edad >= 18) {
			System.out.println("Tienes permitido pasar");
		} else {
			if (cantidad > 1) {
				System.out.println("Puedes ingresar aunque seas menor");
			}

			else {
				System.out.println("No tienes permitido pasar");
			}
		}
	}
}
