programa {
  funcao inicio() {
    inteiro num, i = 1

    escreva("Digite um número (1 - 10): ")
    leia(num)

    se(num < 1 ou num > 10) {
      escreva("Digite um número inteiro entre 1 e 10")
    } 
    senao {
      enquanto(i <= 10){
        escreva("" + num + " x " + i + " = " + num*i + "\n")
        i++
      }
    }
  }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 89; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */