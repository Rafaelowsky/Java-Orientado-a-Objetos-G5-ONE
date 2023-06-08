
public class EjemploCondicionales2 {
	public static void main(String[] args) {
		int edad = 17;
		int cantidadPersonas = 2;
		//Los datos de tipo booleano son solo dos, true y false.
		boolean acompañado = cantidadPersonas > 1;
		
		System.out.println("¿La persona esta acompañada? " + acompañado);
		
		//Podemos ocupar los booleanos como sentencia para nuestra iteración
		if (edad >= 18 && acompañado) {
			System.out.println("Tienes permitido pasar");
		} else {
				System.out.println("No tienes permitido pasar");
			}
	}
}

