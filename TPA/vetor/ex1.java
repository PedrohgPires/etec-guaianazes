package vetor;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final int TAM=10;
		int a[],b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("digite o " +(i+1)+"- valor do vetor A");
			a[i] = leia.nextInt();
		}
		for(i=0; i<TAM; i++) {
			b[i] = a[i]*a[i];
			System.out.println("b = "+b[i]);
		}
	
		
		
}
}

