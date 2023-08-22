import java.util. Scanner;
public class equaçao {
	public static void main(String[] args) {
		System.out.println ("Neutro");
		Scanner leia = new Scanner (System.in);
		double A, B, C, delta, x1, x2, raizQuadrada;
		System.out.println("Escreva o A");
		A = leia.nextDouble();
		System.out.println("Escreva o B");
		B = leia.nextDouble ();
		System.out.println("Escreva o C");
		C = leia.nextDouble ();
		delta = ((B*B)-4*A*C);
		System.out.println ("Esse é o valor de delta="+delta);
		//delta = leia.nextInt ();
		if (delta<0) {
			System.out.println ("Não existem raizes reais para a equação");	
	    }else if  (delta == 0) {
		System.out.println ("Existe apenas uma raiz para a equação");
	    }else if (delta>0) {
	    	System.out.println ("Existem duas raizes para a equação");
	    	leia.close();
	    	raizQuadrada = Math.sqrt(delta);
	    System.out.println ("A raiz de delta é ="+raizQuadrada);
	    x1 = (-B+raizQuadrada)/(2*A);
	    System.out.println ("O valor de X1 é ="+x1);
	    x2 = (-B-raizQuadrada)/(2*A);
	    System.out.println ("O valor de X2 é ="+x2);

	    
	}
}
		
	}