package case1;
import java.util.Scanner;
public class ex1 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int d;
System.out.println("Escreva o ultimo numero na sua placa:");
d = in.nextInt();
switch(d) {
case 1:
case 2:
	System.out.println("Seu veiculo não pode andar segunda feira");
	break;
case 3:
case 4:
	System.out.println("Seu veiculo não pode andar terça feira");
	break;
case 5:
case 6:
	System.out.println("Seu veiculo não pode andar quarta feira");
	break;
case 7:
case 8:
	System.out.println("Seu veiculo não pode andar quinta feira");
	break;
case 9:
case 0:
	System.out.println("Seu veiculo não pode andar sexta feira");
	break;
default:
	System.out.println("Dia invalido");
	

}
}
}
