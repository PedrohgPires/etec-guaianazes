package case1;
import java.util.Scanner;
public class ex2 {
public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
int d;
System.out.println("Escreva o numero do M�S:");
d = leia.nextInt();
switch(d) {
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
	System.out.println("O M�s tem 31 dias");
	break;
case 4:
case 6:
case 9:
case 11:
	System.out.println("O M�s tem 30 dias");
	break;
case 2:
    System.out.println("O M�s tem 29 ou 28 dias");
    break;
default:
	System.out.println("M�s invalido");




	
}
}
}
