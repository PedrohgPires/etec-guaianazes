package vetores;
import java.util.Scanner;
public class vetorextra {
    public static void main(String[] args) {
    	Scanner leia = new Scanner (System.in);

    	final int TAM=20;
		int a[], b[];
		a = new int [TAM];
		b = new int [TAM];
		
		for (int i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"termo do vetor a");
			a[i] = leia.nextInt();
		}
        int indicePar = 0;
        int indiceImpar = a.length - 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
             b[indicePar] = a[i];
                indicePar++;
            } else {
                b[indiceImpar] = a[i];
                indiceImpar--;
            }
        }
        System.out.print("Números pares: ");
        for (int i = 0; i < indicePar; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.print("Números ímpares: ");
        for (int i = a.length - 1; i > indiceImpar; i--) {
            System.out.print(b[i] + " ");
        }
    }
}
