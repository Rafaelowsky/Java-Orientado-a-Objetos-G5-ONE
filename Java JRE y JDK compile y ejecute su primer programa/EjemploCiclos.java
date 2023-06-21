
public class EjemploCiclos {
	public static void main(String[] args) {
		
		int contador = 0;
		
		//Esta es una forma de iterar una parte de codigo mientras que la sentencia que nosotros
		//hayamos puesto se cumpla
		while (contador <= 10) {
			System.out.println(contador);
			//Para aumentar el contador se puede de hacer varias maneras, tal como:
			//contador = contador + 1;
			//contador += 1;
			//Pero la forma mas eficaz de lograr esto es con este ultimo:
			contador ++;
		}
	}
}
