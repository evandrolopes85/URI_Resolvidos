import java.util.Scanner;

public class ValidacaoDeNotaURI1117{
	public static void main( String[] args ){
		Scanner teclado = new Scanner( System.in );
		double note   = 0.0;
		double amount = 0.0;
		double average;
		int count = 0; 

		while( teclado.hasNextDouble() ){

			note = teclado.nextDouble();
			
			if( note >= 0.0 && note <= 10.0 ){
				amount += note;
				count++;
			}else{
				System.out.println( "nota invalida" );
			}		
		};
		
		average = amount / count;

		System.out.printf( "media = %.2f\n", average );
	}
}