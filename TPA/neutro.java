import java.util. Scanner;
public class neutro {
	public static void main(String[] args) {
		System.out.println ("Neutro");
		Scanner leia = new Scanner (System.in);
		int numero, positivo, negativo;
		System.out.println("Escreva o seu numero");
		numero = leia.nextInt();
		if(numero > 0) {
	    	System.out.println("pósitivo");
	    }else if (numero == 0) {
	    	System.out.println("neutro");
	    }else {
	    	System.out.println("negativo");
	    	leia.close();
	    }
}
}