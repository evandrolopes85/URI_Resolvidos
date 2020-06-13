import java.util.Scanner;

public class VariasNotasComValidacaoURI1118{
	public static void main( String[] args ){
		Scanner teclado = new Scanner( System.in );
		double note   = 0.0;
		double amount = 0.0;
		double average;
		int count = 0; 
		int x = 0;

		while( teclado.hasNextDouble() || teclado.hasNextInt() ){

			note = teclado.nextDouble();
			
			if( note >= 0.0 && note <= 10.0 ){
				amount += note;
				count++;
			}else{
				System.out.println( "nota invalida" );
			}

			if(count == 2){
				
				average = amount / 2;
				System.out.printf( "media = %.2f\n", average );
				
				amount = 0;
				count  = 0;
				
				do{
					System.out.println("novo calculo (1-sim 2-nao)");
					x = teclado.nextInt();
				}while(x < 1 || x > 2);
			
				if( x == 2 )
					break;
			}
		};
		


		teclado.close();
	}
}