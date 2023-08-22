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
	System.out.println("Júnior");
	break;
case 8:
	System.out.println("Júnior max");
	break;
case 9:
	System.out.println("Júnior master");
	break;
case 10:
	System.out.println("Master");
	break;
default:
	System.out.println("idade invalida");

}
}
}
