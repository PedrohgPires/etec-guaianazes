import java.util. Scanner;
public class IMC {
	public static void main(String[] args) {
		System.out.println ("IMG");
		Scanner leia = new Scanner (System. in);
		double peso,  altura, imc;
		System.out.println(" Escreva o seu peso");
		peso = leia.nextDouble();
		System.out.print(" Escreva a sua altura");
		altura = leia.nextDouble();
		imc = (peso/(altura*altura));
		System.out.print ("O seu IMC é"+imc);
		if (imc<18.5) {
			System.out.print ("Excesso de Magreza");
		}else if (imc<25) {
			System.out.println ("Peso normal");
		}
			else if (imc<30) {
				System.out.println ("Excesso de Peso");
			} else if (imc<35) {
				System.out.println ("Obesidade (Grau 1)");
			} else if (imc<40) {
				System.out.println ("Obesidade (Grau 2)");
			} else if (imc>40) {
				System.out.println ("Obesidade (Grau 3)");
				leia.close();
		} 
		}
			
		}
	
		
		