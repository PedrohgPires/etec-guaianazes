import java.util.Scanner;

public class crescente {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a, b, c, temp;
        System.out.print("Digite o valor de A: ");
        a = leia.nextInt();
        System.out.print("Digite o valor de B: ");
        b = leia.nextInt();
        System.out.print("Digite o valor de C: ");
        c = leia.nextInt();
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println("Valores em ordem crescente: " + a + ", " + b + ", " + c);
        
    }
}