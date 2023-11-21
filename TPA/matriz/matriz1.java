package vetores;
import java.util.Random;
public class matriz1 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random rand = new Random();

      
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = rand.nextInt(100); 
            }
        }

  
        int menor = matriz[0][0];
        int maior = matriz[0][0];
        int linhaMenor = 0, colunaMenor = 0, linhaMaior = 0, colunaMaior = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

       
        System.out.println("Matriz gerada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] );
            }
            System.out.println();
        }

        System.out.println("O menor valor é " + menor + " na linha " + linhaMenor + ", coluna " + colunaMenor);
        System.out.println("O maior valor é " + maior + " na linha " + linhaMaior + ", coluna " + colunaMaior);
    }
}
