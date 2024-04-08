package javadoc;

import java.util.Iterator;
import java.util.Random;

import utilidades.Entrada;

/**
 * La clase funciones proporciona funciones como indexOf, esPar, esPrimo,crearArray, mostrarArray, convertirCelsiusAFarenheit,
 * convertirFarenheitACelsius, tirarDado, areaTriangulo, sumar, restar, dividir, multiplicar, saludar y redondear.
 * @author Daniel.Calvo
 * @version 20
 * @since 03/04/2024
 */

public class Funciones {
	/**
	 * Encontrar posición de string en un array de strings.
	 * 
	 * @param dicc El array de string
	 * @param pal El string que se quiere buscar su posición.
	 * @return La posicion del string.
	 */
	
	public static int indexOf(String[] dicc, String pal) {
		int encontrado=-1;
		
		for (int i = 0; i < dicc.length && encontrado==-1; i++) {
			if (dicc[i].equalsIgnoreCase(pal))
				encontrado=i;
		}
		return encontrado;
	}	
	
	/**
	 * Comprobar si un número es par.
	 * 
	 * @param n El número que se quiere comprobar.
	 * @return Devuelve si es par
	 */
	public static boolean esPar(int n) {
		return n%2==0;
	}
	
	/**
	 * Comprobar si un número es Primo
	 * 
	 * @param n El número que se quiere comprobar
	 * @return Si el número es primo
	 */

	public static boolean esPrimo(int n) {
		boolean primo=true;
		//Si n es 5 probaríamos divisibilidad entre 2,3 y 4
		for (int i = 2; i < n && primo; i++) {
			if (n%i==0)
				primo=false;
		}
		return primo;
	}
	
	/**
	 * Creación de un array
	 * 
	 * @param n1 Primer valor del array.
	 * @param n2 Segundo valor del array.
	 * @return El array 
	 */

	public static int [] crearArray(int n1,int n2) {
		int [] a=new int[2];
		
		a[0]=n1;
		a[1]=n2;
		
		return a;
	}
	
	/**
	 * Mostrar un array completo.
	 * 
	 * @param a El array
	 */
	public static void mostrarArray(int[] a) {
		System.out.print("(");
		for (int i = 0; i < a.length; i++) {
			if (i==a.length-1) //Último elemento
				System.out.print(a[i]);
			else
				System.out.print(a[i]+",");
		}
		System.out.println(")");
	}
	
	/**
	 * Pasar temperatura de celsius a farenheit
	 * 
	 * @param tempCelsius Temperatura en celsius
	 * @return La temperatura en Farenheit
	 */
	public static double convertirCelsiusAFarenheit(double tempCelsius) {
		return (tempCelsius*9/5)+32;
	}
	
	/**
	 * Pasar temperatura de farenheit a celsius
	 * 
	 * @param tempFarenheit Temperatura en farenheit
	 * @return Temperatura en celsius
	 */
	public static double convertirFarenheitACelsius(double tempFarenheit) {
		
		return (tempFarenheit-32)*5/9;
	}
	
	/**
	 * Tirar un dado
	 * 
	 * @param r Número del dado.
	 * @return El número del dado al azar
	 */
	private static int tirarDado() {
		Random r=new Random();
		
		return r.nextInt(6)+1;
	}
	
	/**
	 * Sacar el area de un triángulo
	 * 
	 * @param base La base del triángulo
	 * @param altura La altura del triángulo
	 * @return El area del triángulo
	 */
	public static double areaTriangulo(double base,double altura) {
		double area=base*altura/2;
		
		return area;
	}
	
	/**
	 * Suma de dos números
	 * 
	 * @param n1 Primer número
	 * @param n2 Segundo número
	 * @return La suma de los dos números
	 */
	public static double sumar(double n1, double n2) {
		double suma;
		suma=n1+n2;
		return suma;
		
	}
	
	/**
	 * Resta de dos números
	 * 
	 * @param n1 El primer número.
	 * @param n2 El segundo número.
	 * @return La resta de los dos números.
	 */
	public static double restar(double n1, double n2) {
		return n1-n2;
	}
	
	/**
	 * Multiplicación de dos números
	 * 
	 * @param n1 El primer número.
	 * @param n2 Segundo número
	 * @return La multiplicación de los dos números
	 */
	public static double multiplicar(double n1, double n2) {
		return n1*n2;
	}
	
	/**
	 * División de dos números
	 * 
	 * @param n1 Primer número
	 * @param n2 Segundo número
	 * @return La division de los dos números
	 */
	public static double dividir(double n1, double n2) {
		return n1/n2;
	}
	
	/**
	 * Saludar 
	 * 
	 * @param nombre El nombre
	 * @param veces Las veces que quieres que salude
	 */
	public static void saludar(String nombre, int veces) {
		for (int i = 1; i <=veces; i++) {
			System.out.println("Hola");
			System.out.println("¿cómo estás "+nombre+"?");
		}
	}
	
	/**
	 * Redondear dos números
	 * 
	 * @param numeroParaRedondear El número que quieres redondear
	 * @param numeroDeDecimalesDeseados Cantidad de decimales 
	 * @return El número redondeado
	 */
	public static double redondear(double numeroParaRedondear, int numeroDeDecimalesDeseados) {
		if (numeroDeDecimalesDeseados < 0)
			throw new IllegalArgumentException("El número de decimales para el redondeo no puede ser negativo: "+numeroDeDecimalesDeseados);
		// Movemos coma decimal hacia la derecha o a la izquierda multiplicando o dividiendo por este factor
		double factor = Math.pow(10, numeroDeDecimalesDeseados); 
		double redondeo = Math.round(numeroParaRedondear * factor);
		return redondeo / factor;
	}
}