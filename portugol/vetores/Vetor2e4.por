programa {
  funcao inicio() {
    real m[10][4], i, j, soma, v[10]

    para(i = 0; i < 10; i++) {
      soma = 0.0

      para(j = 0; j < 4; j++) {
        escreva("m["+i+"]["+j+"]: ")
        leia(m[i][j])

        soma += m[i][j]
      }

      v[i] = soma/4
    }

    para(i = 0; i < 10; i++) {
      escreva("" + v[i] + " | ")
    }
  }
}
//__________________________________________________________________
programa {
  funcao inicio() {
    inteiro v[10], i, soma = 0
    real media = 0.0

    para(i = 0; i < 10; i++) {
      escreva("v["+i+"]: ")
      leia(v[i])
      soma += v[i]
    }

    escreva("Elementos nos indices impares:\n")

    para(i = 1; i < 10; i += 2)
      escreva("" + v[i] + " ")

    escreva("\nElementos pares:\n")

    para(i = 0; i < 10; i++) {
      se(v[i] % 2 ==0)
        escreva("" + v[i] + " ")
    }

    media = soma/10

    escreva("\nSoma:\n" + soma)

    escreva("\nMedia:\n" + media)
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 938; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */