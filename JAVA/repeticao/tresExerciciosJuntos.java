package DesenvolvimentoJava;

import java.util.Scanner;

public class tresExerciciosJuntos {

	public static void main(String[] args) {
		int num1, num2, i;
		Scanner leia = new Scanner(System.in);
		
	    System.out.print("Digite o primeiro numero do intervalo: ");
	    num1 = leia.nextInt();
	    
	    System.out.print("Digite o ultimo numero do intervalo: ");
	    num2 = leia.nextInt();

	    if(num2 < num1) {
	    	System.out.print("Intervalo invalido!");
	    }
	    else {
	      for(i = num1; i <= num2 ; i++){
	        if(i % 3 == 0 && i % 5 == 0)
	        System.out.print("" + i + " eh multiplo de 5 e 3\n");
	      }

	    }	
	}
}
//____________________________________________________________________________
package DesenvolvimentoJava;

import java.util.Scanner;

public class SomaNumPositivo {

	public static void main(String[] args) {
		{
		    int num, soma = 0;
		    Scanner leia = new Scanner(System.in);

		    do{
		    	System.out.print("Digite um numero: ");
		    	num = leia.nextInt();

		      if(num > 0)
		        soma = soma + num;
		    }
		    while(num != 0);

		    System.out.print("A soma dos numeros positivos eh: " + soma);
		  }

	}

}
//___________________________________________________________________________________________
package DesenvolvimentoJava;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		int idade, sexo, categoria;
		int contBack = 0, contFrontM = 0, contMobH = 0, contFullM = 0;
		Scanner leia = new Scanner(System.in);
		String continuar = "S";
		
		while(continuar.equals("S")) {
			System.out.print("Digite a Idade: ");
			idade = leia.nextInt();
			
			System.out.print("Digite o Sexo: ");
			sexo = leia.nextInt();
			
			System.out.print("Digite a Categoria: ");
			categoria = leia.nextInt();
			
			if(categoria == 1) {
				contBack++;
			}
			
			if(sexo == 2 && categoria == 2) {
				contFrontM++;
			}
			
			if(sexo == 1 && categoria == 3 && idade>40){
				contMobH++;
			}
			
			if(sexo == 2 && categoria == 4 && idade<30) {
				contFullM++;
			}
			
			System.out.println("Deseja continuar (S/N): ");
			continuar = leia.next();			
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: "+contBack);
		System.out.println("Total de mulheres desenvolvedoras Frontend: "+contFrontM);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: "+contMobH);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: "+contFullM);
	}

}

