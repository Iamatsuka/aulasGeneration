programa {
  funcao inicio() {
    inteiro num1, num2, i

    escreva("Digite o primeiro número do intervalo: ")
    leia(num1)
    escreva("Digite o último número do intervalo: ")
    leia(num2)

    se(num2 < num1) {
      escreva("Intervalo inválido!")
    }
    senao {
      para(i = num1; i <= num2 ; i++){
        se(i % 3 == 0 e i % 5 == 0)
          escreva("" + i + " é múltiplo de 5 e 3\n")
      }
    } 
  }
}
//====================================================================================================
programa {
  funcao inicio() {
    inteiro num, soma = 0

    faca{
      escreva("Digite um número: ")
      leia(num)

      se(num > 0)
        soma = soma + num
    }
    enquanto(num != 0)

    escreva("A soma dos números positivos é: " + soma)
  }
}
//===================================================================================================
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
//====================================================================================================
programa {
  funcao inicio() {
    inteiro num, soma = 0

    faca{
      escreva("Digite um número: ")
      leia(num)

      se(num > 0)
        soma = soma + num
    }
    enquanto(num != 0)

    escreva("A soma dos números positivos é: " + soma)
  }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1577; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */