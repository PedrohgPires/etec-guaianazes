import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class idadeusuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeUsuarios = 5;
        Usuario[] usuarios = new Usuario[quantidadeUsuarios];
        for (int i = 0; i < quantidadeUsuarios; i++) {
            System.out.print("Digite o nome do usuário " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade do usuário " + (i + 1) + ": ");
            int idade = Integer.parseInt(scanner.nextLine());
            usuarios[i] = new Usuario(nome, idade);
        }
        Arrays.sort(usuarios, Comparator.comparingInt(Usuario::getIdade));
        System.out.println("\nUsuários em ordem crescente de idade:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome() + " - " + usuario.getIdade() + " anos");
        }
    }
} 
          class Usuario {
          private String nome;
          private int idade;
          public Usuario(String nome, int idade) {
          this.nome = nome;
          this.idade = idade;
    }
          public String getNome() {
          return nome;
    }
          public int getIdade() {
          return idade;
    }
}
//Este programa solicita o nome e a idade de cada um dos 5 usuários e, em seguida, os armazena em objetos da classe Usuario. Em seguida, ele usa a função Arrays.sort() para classificar os usuários com base em sua idade, usando um Comparator que compara as idades. Por fim, ele imprime os usuários em ordem crescente de idade, exibindo seus nomes e idades.