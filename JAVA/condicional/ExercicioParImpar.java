package DesenvolvimentoJava;

import java.util.Scanner;

public class ExercicioParImpar {

	public static void main(String[] args) 
	{
		int numero;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um numero: ");
		numero = leia.nextInt();
		
		if(numero%2 == 0)
		{
			System.out.print("\nO Numero "+numero+" eh par");
		}
		else
		{
			System.out.print("\nO Numero "+numero+" eh i-9mpar");
		}
		
		if (numero>0)
		{
			System.out.println(" e positivo!");
		}
		else
		{
			System.out.println(" e negativo!");
		} 

	}

}
