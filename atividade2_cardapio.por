programa
{
	
	funcao inicio()
	{
		inteiro codigo,qtd
		real total=0.0
		
		escreva("Código do Produto: ")
		leia(codigo)
		escreva("Quantidade: ")
		leia(qtd)

		se(codigo==1){
			escreva("Produto: Cachorro-quente")
			total=qtd*10.00
		}
		senao se(codigo==2){
			escreva("Produto: X-Salada")
			total=qtd*15.00
		}
		senao se(codigo==3){
			escreva("Produto: X-Bacon")
			total=qtd*18.00
		}
		senao se(codigo==4){
			escreva("Produto: Bauru")
			total=qtd*12.00
		}
		senao se(codigo==5){
			escreva("Produto: Refrigerante")
			total=qtd*8.00
		}
		senao se(codigo==6){
			escreva("Produto: Suco de laranja")
			total=qtd*13.00
		}
		senao{
			escreva("Código inválido")	
		}

		escreva("\nValor total: R$ "+total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 723; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */