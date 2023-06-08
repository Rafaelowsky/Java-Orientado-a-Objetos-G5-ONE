
public class EjemploValoresVariables {
	public static void main(String[] args) {
		
		int numero1 = 5;
		int numero2 = 9;
		System.out.println(numero2);
		
		//Aqui guardamos el valor de numero1 en la variable numero2
		numero2 = numero1;
		System.out.println(numero2); // aqui se imprime el valor del numero1
		
		//Aqui se muestra el resultado de 5 porque el programar en java es secuencial
		//Entonces pasa que si se cambio el valor en numero1 pero no se volvio a cambiar en numero 2
		//por eso es que en consola se imprime un 5 otra vez
		numero1 = 88;
		System.out.println(numero2);
	}
}
