package case1;
import java.util.Scanner;
public class ex4 {
public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
int d;
System.out.println("Escreva o codigo do produto:");
d = leia.nextInt();
switch(d) {
case 1:
	System.out.println("Cachorro quente R$8,00");
	break;
case 2:
	System.out.println("Cheeseburger R$12,00");
	break;
case 3:
	System.out.println("X-Salada R$15,00");
	break;
case 4:
	System.out.println("Misto quente R$11,00");
	break;
case 5:
	System.out.println("Pão na chapa R$6,00");
	break;
default:
	System.out.println("codigo invalido");

}
}
}