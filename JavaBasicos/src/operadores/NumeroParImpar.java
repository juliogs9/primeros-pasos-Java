package operadores;

import java.util.Scanner;

/*
		 * Crear un nuevo proyecto llamado NumeroParImpar
			crear el m�todo main
			crear una funci�n que eval�e si un n�mero es par o impar (se puede usar el operador ternario)
			Imprimir en terminal el resultado
		 	*extra, investigar c�mo usar la clase Scanner en java.
	 */ 


public class NumeroParImpar{

	public static void main (String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int numero;
		

        System.out.printf( "Ingresa el n�mero: " );
        numero = teclado.nextInt();

        if ( numero % 2 == 0 )
        {
            System.out.printf( "ES PAR" );
        }
        else
        {
            System.out.printf( "ES IMPAR" );
        }
			
	
	}

}