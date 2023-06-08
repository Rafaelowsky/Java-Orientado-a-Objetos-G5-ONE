
public class EjemploCaracteres {

	public static void main(String[] args) {
		
		char caracter = 'a'; //declaramos una variable como caracter
		System.out.println(caracter);
		
		caracter = 65; 
		System.out.println(caracter);
		//en la consola aparece una A, porque no estamos ocupando numeros
		//enteros, si no que al ocupar char estamos haciendo referencia
		//al codigo ASCII
		
		caracter = 65 + 1;
		char segundoCaracter = (char) (caracter + 1);
		System.out.println(segundoCaracter);
		//Esto es lo mismo que estamos haciendo en el metodo anterior
		//solo que aqui el 66 hace referencia a la letra "C"
		
		String palabra = "Alura Cursos online"; // String = cadena de caracteres
		System.out.println(palabra);
		
		palabra = palabra + " 2020"; // podemos concatenar estas cadenas de caracteres
		System.out.println(palabra);
		
	}
}
