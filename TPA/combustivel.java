
import java.util. Scanner;
public class combustivel {
	public static void main(String[] args) {
		System.out.println ("Neutro");
		Scanner leia = new Scanner (System.in);
		int km, capactanque, gastomedio;
		System.out.println(" Escreva quantos quilometros foram pescorridos");
		km = leia.nextInt();
		System.out.println("Escreva a capacidade do tanque");
		capactanque = leia.nextInt ();
		gastomedio = (km/capactanque);
		System.out.println ("O seu gasto médio foi "+gastomedio);
		if (gastomedio<10) {
		  System.out.println ("O seu carro nao é economico");
		} else if (gastomedio>=10) {
		  System.out.println ("O seu carro é economico");
		leia.close();
		}}}
		