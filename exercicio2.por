programa {
  funcao inicio() {
    inteiro num1, num2, i

    escreva("Digite o primeiro n�mero do intervalo: ")
    leia(num1)
    escreva("Digite o �ltimo n�mero do intervalo: ")
    leia(num2)

    se(num2 < num1) {
      escreva("Intervalo inv�lido!")
    }
    senao {
      para(i = num1; i <= num2 ; i++){
        se(i % 3 == 0 e i % 5 == 0)
          escreva("" + i + " � m�ltiplo de 5 e 3\n")
      }
    } 
  }
}
