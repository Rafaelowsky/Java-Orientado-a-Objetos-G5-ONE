
public class TestConversion {
	public static void main (String[] args) {
		
		//Aqui hay que hacer un cast para poder compilar el programa.
		float puntoFlotante = 3.14f; 
		
		//En este caso para poder compilar tenemos que hacer un cast sobre la variable salario
		//para pasarla a entero y poder compilar
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.print(valor);
		
		//Aqui es la muestra de que double no siempre es la mejor opción
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.print(total);
		
		//Esta es la prueba de que con el cast podemos hacer nuestro codigo funcione
		System.out.print(puntoFlotante);
		
	}
}
