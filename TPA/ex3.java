package case1;
import java.util.Scanner;
public class ex3 {
public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
int d;
System.out.println("Escreva a sua idade:");
d = leia.nextInt();
switch(d) {
case 6:
	System.out.println("Dente de leite:");
	break;
case 7:
	System.out.println("J�nior");
	break;
case 8:
	System.out.println("J�nior max");
	break;
case 9:
	System.out.println("J�nior master");
	break;
case 10:
	System.out.println("Master");
	break;
default:
	System.out.println("idade invalida");

}
}
}
