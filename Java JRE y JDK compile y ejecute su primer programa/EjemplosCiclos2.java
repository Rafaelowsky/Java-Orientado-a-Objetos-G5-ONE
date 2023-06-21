
public class EjemplosCiclos2 {
	public static void main(String[] args) {

		//Con esto podemos hacer un ciclo donde se este modificando
		//un programa con el que con la iteracion de while, modificamos
		//el valor de una variable e imprimirla al final
		int contador = 0;
		int total = 0;
		while (contador <= 10) {
			total = total + contador;
			System.out.println(contador);
			contador++;
		}
		System.out.println(total);
	}
}
