
public class Matrices {
	public static void main(String[] args) {
		for (int fila = 0; fila <= 10; fila++) {
			//Podemos hacer  una declaracion dentro del for para declarar cuando se va a realizar
			//ese bloque de codigo.
			for (int columna = 0; columna < fila; columna++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}
