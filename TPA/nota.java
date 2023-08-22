import java.util. Scanner;
public class nota {
	public static void main(String[] args) {
		System.out.println ("Nota");
		Scanner leia = new Scanner (System.in);
		double nota1, nota2, media, exame, media2;
		System.out.println("Escreva a sua primeira nota");
		nota1 = leia.nextInt();
		System.out.println("Escreva a sua segunda nota");
		nota2 = leia.nextInt ();
		media = ((nota1+nota2)/2);
		System.out.println ("Essa é sua média"+media);
		if (media<3) {
			System.out.println ("Reprovado");
		} else if (media>=6){
			System.out.println ("Aprovado");
		} else if (media>=3 && media<6) {
			System.out.println ("Está em exame");
		System.out.println ("Escreva sua nota de exame");
		exame = leia.nextInt ();
		media2 = ((exame+media)/2);
		if (media2>=6) {
			System.out.println ("Aprovado");
		} else {
			System.out.println ("Reprovado");
		}
		
		
		}
		
		
	}
}