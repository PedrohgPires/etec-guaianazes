package vetor;
import java.util.Scanner;
public class ex2 {

	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		final int TAM=10;
		int a[],b[], i, c[];
		a = new int[TAM];
		b = new int[TAM];
		c =  new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("digite o " +(i+1)+"- valor do vetor A");
			a[i] = leia.nextInt();
	}
		for(i=0; i<TAM; i++) {
			System.out.println("digite o " +(i+1)+"- valor do vetor B");
			b[i] = leia.nextInt();
}
		for(i=0; i<TAM; i++) {
			 c[i] = a[i]+b[i];
			System.out.println("" +(i+1)+"- valor do vetor C="+c[i]);
		  
	}
}
}


