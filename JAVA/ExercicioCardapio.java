package DesenvolvimentoJava;

import java.util.Scanner;

public class ExercicioCardapio {

	public static void main(String[] args) {
		
		
		int codigo,quantidade;
		Scanner leia = new Scanner(System.in);

		System.out.print("\nCódigo do produto: ");
		codigo = leia.nextInt();
		System.out.print("\nQuantidade: ");
		quantidade = leia.nextInt();
		
		if(codigo == 1)
		{
			System.out.print("\nProduto:Cachorro-quente\n");
			System.out.print("\nValor total:R$ "+quantidade*10.00+"");
		}
		else if(codigo == 2)
		{
			System.out.print("\nProduto:X-Salada\n");
			System.out.print("\nValor total:R$ "+quantidade*15.00+"");
		}
		else if(codigo == 3)
		{
			System.out.print("\nProduto:X-Bacon\n");
			System.out.print("\nValor total:R$ "+quantidade*18.00+"");
		}
		else if(codigo == 4)
		{
			System.out.print("\nProduto:Bauru\n");
			System.out.print("\nValor total:R$ "+quantidade*12.00+"");
		}
		else if(codigo == 5)
		{
			System.out.print("\nProduto:Refrigerante\n");
			System.out.print("\nValor total:R$ "+quantidade*8.00+"");
		}
		else if(codigo == 6)
		{
			System.out.print("\nProduto:Suco de laranja\n");
			System.out.print("\nValor total:R$ "+quantidade*13.00+"");
		}
		else
		{
			System.out.print("\nOpcao Invalida");
		}

	}

}
