import java.util.Scanner;

public class URI1116 {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int x;
		int y;
		int i = 0;

		System.out.println(n);
		while(i < n){
			
			x = teclado.nextInt();
			y = teclado.nextInt();

			if(y == 0){
				System.out.println("divisao impossivel");	
			}else{
				System.out.printf("%.1f\n", ((double)x/(double)y));	
			}
				
			
			i++;
		};
	}
}