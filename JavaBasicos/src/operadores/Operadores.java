package operadores;

public class Operadores {
	
	public static void main(String[] args) {
		
		// Operadores Aritmeticos
		
		// + -  / * %
		
		int a = 10;
		int b = 20;
		
		int c = a + b;
		System.out.println(c);	
		
		
		String strl = "El resultado de la suma es:";
		System.out.println(strl + c);
		
		// Resta
		
		System.out.println("El resulado de la resta :" + (a - b));
		
		
		// Division
		
		int division = b / a;
		
		System.out.println("El resulatado de la division es :" + (division));
		
		double division2 = (double)a / b;
		System.out.println("El resulatado de la division2 es :" + (division2));
		
		
		// Multiplicacion
		
		double multiplicacion = a * b;
		System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
		
		
		// Modulo
		
		int modulo = a % b;
		System.out.println("El modulo de la operacion es : " + modulo);
		
		// Operadoor de asignacioon
		// ( = )
		
		
		//Operador de declararcion Compuesta
		// += -= *= /= %=
		
		
		// Operadores Relacionales
		//  ( < )  ( > )   ( >= )  ( <= )
		// == igualdad
		// != diferencia
		
		// Resultado de tipo booleano
		// true false
		
		
		
		int hilo = 15, iman = 25;
		String jon = "Hola";
		
		System.out.println(hilo > iman); 
		System.out.println(hilo < iman);
		System.out.println(iman != hilo);
		
		
		// Operador unario
		// > preasignacion ( ++ )
		// > postasignacion ( -- )
		
		
		int k = 0, l = 5;
		System.out.println(++k);
		
		// Operadores logicos 
		// And - &&
		// or - ||
		// Not !
		
		
		int n=3;
		 if (n%2==0) {
		 System.out.println("El número  " + n + " Es par");
		 }else{
		 System.out.println("El número " + n + " Es impar");
		 }
		
		 
		 
		 
		 
		
	}

}
