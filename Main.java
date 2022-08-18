/******************************************************************************
Calculadora de ecuaciones de Segundo Grado.

Por terminar la parte de las ecuaciones con soluciones imaginarias. 
*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Bienvenido a la calculadora de ecuaciones de segundo grado. \n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número a");
		double a = sc.nextDouble();
		
		System.out.println("Introduce el número b");
		double b = sc.nextDouble();
		
		System.out.println("Introduce el número c");
		double c = sc.nextDouble();
		
		sc.close();
		
		resolve(a,b,c);
	}
	
	public static void resolve(double a, double b, double c){
	    
	    
	    double raiz = ((b*b) - (4*a*c));
	    double sol1 = (-b + Math.sqrt(raiz)) / (2*a);
	    double sol2 = (-b - Math.sqrt(raiz)) / (2*a);
	    if ( raiz < 0) {
	        raiz = -raiz;
	        double real = (-b / (2*a));
	        double img1 = Math.sqrt(raiz) / (2*a);
	        System.out.println("La primera solución imaginaria es: "+ real + " + "+ img1 + "i");
	        System.out.println("La segunda solución imaginaria es: "+ real + " - "+ img1 + "i");
	    } else {
	        System.out.println("La primera solución es: "+ sol1);
	        System.out.println("La segunda solución es: "+ sol2);
	    }
	    System.out.println("Gracias por venir, simpático");
	}
}
