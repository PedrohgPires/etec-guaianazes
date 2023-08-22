
import java.util. Scanner;
public class triangulo {
	public static void main(String[] args) {
		System.out.println ("Triangulo");
		Scanner leia = new Scanner (System.in);
		double  A, B, C, triangulo;
		System.out.println ("Escreva o valor da primeira medida");
		A= leia.nextDouble();
		System.out.println ("Escreva o valor da segunda medida");
		B= leia.nextDouble();
		System.out.println("Escreva o valor da terceira medida");
		C= leia.nextDouble();
		
		if (B+C>A && C+B>A) {
			System.out.println("nao um triangulo");
		}else if (C+A>B && A+C>B) {
			System.out.println("nao um triangulo");
		}else if (A+B>C && B+A>C) {
			System.out.println("nao é um triangulo");
		}else {
			System.out.println("  é um triangulo");
			
		}
	}
}
		
	