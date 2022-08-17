/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Bienvenido a la calculadora de ecuaciones de segundo grado. \n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número a");
		int a = sc.nextInt();
		
		System.out.println("Introduce el número b");
		int b = sc.nextInt();
		
		System.out.println("Introduce el número c");
		int c = sc.nextInt();
		
		sc.close();
		
		resolve(a,b,c);
	}
	
	public static void resolve(int a, int b, int c){
	    
	    
	    double raiz = ((b*b) - (4*a*c));
	    double sol1 = (-b + Math.sqrt(raiz)) / (2*a);
	    double sol2 = (-b - Math.sqrt(raiz)) / (2*a);
	    if ( raiz < 0) {
	        raiz = -raiz;
	        double real1 = -b / (2*a);
	        double img1 = Math.sqrt(raiz) / (2*a);
	        System.out.println("La primera solución imaginaria es: "+ real1 + " + "+ img1 + "i");
	    } else {
	        System.out.println("La primera solución es: "+ sol1);
	        System.out.println("La segunda solución es: "+ sol2);;
	    }
	}
}
