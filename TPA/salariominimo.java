
import java.util. Scanner;
public class salariominimo {
	public static void main(String[] args) {
		System.out.println ("Salario");
		Scanner leia = new Scanner (System.in);
		double salario, salariomin;
		System.out.println("Escreva o seu salário");
		salario = leia.nextDouble();
		salariomin = (954);
		if(salario > salariomin) {
	    	System.out.println("acima do salario minimo");
	    }else if (salario == salariomin) {
	    	System.out.println("igual ao salario minimo");
	    }else {
	    	System.out.println("abaixo do salario minimo");
	    	leia.close();
	    	
	    }
}
}
