package vetores;
import java.util.Random;
public class ex3 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        Random rand = new Random();

      
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = rand.nextInt(100); 
            }
        }

        for (int i = 0; i < 3; i++) {
            int soma = 0;
            for (int j = 0; j < 4 - 1; j++) {
                soma += matriz[i][j];
                System.out.print(matriz[i][j] + " ");
            }
            
            System.out.println(soma);
        }
    }
}
