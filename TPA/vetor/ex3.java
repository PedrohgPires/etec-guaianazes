package vetor;
import java.util.Scanner;
public class ex3 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
        int[] A = new int[10];
        
        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            A[i] = leia.nextInt();
        }
        
       
        int[] B = new int[10];
        for (int i = 0; i < 10; i++) {
            B[i] = A[9 - i]; 
        }
      
        System.out.println("Vetor B (invertido):");
        for (int i = 0; i < 10; i++) {
            System.out.print(B[i] + " ");
        }
    }
}

