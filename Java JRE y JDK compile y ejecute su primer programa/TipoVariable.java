
public class TipoVariable {
	public static void main (String[] args) {
		//"int" sirve para declarar variables enteras
		int edad = 28;
		//con el siguiente método podemos imprimir en consola
		System.out.println(edad);
		
		edad = 48; //después podemos volver a cambiar el valor de la variable
		System.out.println(edad);
		
		edad = 26 + 30; //aquí podemos ver como se puede realizar operaciones con una variable para cambiar su valor
		//Gracias a el simbolo + podemos concatenar variables con strings
		System.out.println("Mi edad es de " + edad);
		
		//Con double declaramos variables con varios decimales,
		//aunque el resultado sea entero puede ocuparse la variable declarada como double
		//pero lo adecuado para optimizar el programa es utilizar el tipo de variable adecuada
		double salario = 28;
		double salarioMitad = salario/2;
		System.out.println(salarioMitad);
		
		//Al declarar un variable entera y su resultado sea fraccionaria, este se va a redondear
		int division = 1250 / 3;
		System.out.println(division);
		
	}
}
