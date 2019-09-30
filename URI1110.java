// JOGANDO CARTAS FORA

/*Dada uma pilha de n cartas enumeradas de 1 até n com a carta 1 no topo e a carta n na base.  
A seguinte operação é ralizada enquanto tiver 2 ou mais cartas na pilha.

Jogue fora a carta do topo e mova a próxima carta (a que ficou no topo) para a base da pilha.

Sua tarefa é encontrar a sequência de cartas descartadas e a última carta remanescente.

Cada linha de entrada (com exceção da última) contém um número n ≤ 50. A última linha contém 0 e não deve 
ser processada. Cada número de entrada produz duas linhas de saída. A primeira linha apresenta a sequência 
de cartas descartadas e a segunda linha apresenta a carta remanescente.

Entrada

A entrada consiste em um número indeterminado de linhas contendo cada uma um valor de 1 até 50. A última linha 
contém o valor 0.

Saída

Para cada caso de teste, imprima duas linhas. A primeira linha apresenta a sequência de cartas descartadas, 
cada uma delas separadas por uma vírgula e um espaço. A segunda linha apresenta o número da carta que restou. 
Nenhuma linha tem espaços extras no início ou no final. Veja exemplo para conferir o formato esperado.

Exemplo de Entrada 	

7
19
10
6
0
	
Exemplo de Saída

Discarded cards: 1, 3, 5, 7, 4, 2
Remaining card: 6
Discarded cards: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 4, 8, 12, 16, 2, 10, 18, 14
Remaining card: 6
Discarded cards: 1, 3, 5, 7, 9, 2, 6, 10, 8
Remaining card: 4
Discarded cards: 1, 3, 5, 2, 6
Remaining card: 4
*/

import java.util.Scanner;

public class URI1110{
	
	public class Fila{
		private int[] elements;
		private int start;
		private int end;
		private int total;

		public Fila(){
			elements = new int[50];
			start = 0;
			end   = 0;
			total = 0;
		}

		public void add(int element){
			elements[end] = element;
			end = (end + 1) % 50;
			total++;
		}

		public int remove(){
			int element = elements[start];
			start = (start + 1) % 50;
			total--;
			return element;
		}

		public boolean isEmpty(){
			return (total == 0);
		}

		public boolean isFull(){
			return (total == 50);
		}

		public int getTotal(){
			return this.total;
		}
	} 
 
    public static void main(String[] args){
 
        Scanner input = new Scanner(System.in);
		while(input.hasNextInt()){
			int length = input.nextInt();
			if(length == 0)
				return;

			URI1110 uri = new URI1110();

			Fila fila = uri.new Fila();

			int index = 1;

			while(index <= length){
				fila.add(index);
				index++;
			}

			System.out.print("Discarded cards: ");
			while(fila.getTotal() > 1){
				int element = fila.remove();
				System.out.print((fila.getTotal() != 1) ? element + ", " : element);
				fila.add(fila.remove());
			}

			System.out.printf("\nRemaining card: %d",fila.remove());
			System.out.println();
		}
 
    } 
}