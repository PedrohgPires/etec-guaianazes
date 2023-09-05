import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 0;
        int menorDeIdade = 0;
        int maiorDeIdade = 0;
        int idade;

        System.out.println("Digite 10 idades:");

        while (i < 10) {
            System.out.println("Digite a idade:");
            idade = leia.nextInt();

            if (idade < 18) {
                System.out.println("Você é menor de idade");
                menorDeIdade++;
            } else {
                System.out.println("Você é maior de idade");
                maiorDeIdade++;
            }

            i++;
        }

        System.out.println("Total de menores de idade: " + menorDeIdade);
        System.out.println("Total de maiores de idade: " + maiorDeIdade);
    }
}

