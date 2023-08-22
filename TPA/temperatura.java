
import java.util. Scanner;
public class temperatura {
	public static void main(String[] args) {
		System.out.println ("Temperatura");
		Scanner leia = new Scanner (System.in);
		double celsius, fahrenheit, conversao;
		System.out.println ("escreva a temperatura em fahrenheit");
		fahrenheit=leia.nextDouble();
		conversao=(fahrenheit - 32) * 5 / 9;
		celsius=conversao;
		System.out.print("temperatura="+celsius);
		if(celsius<15) {
			System.out.println("frio");
		}else if (celsius>=22 ) {
			System.out.println("calor");
		}else {
			System.out.println("=ameno");
			leia.close();
		}
	}
			
		
		
		
		//tinha dado erro naquele dia
		
	{	
	}
}