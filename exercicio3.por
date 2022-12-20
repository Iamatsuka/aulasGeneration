programa {
  funcao inicio() {
    inteiro i, num, contPar = 0, contImpar = 0
    
    para(i = 1; i <= 10; i++) {
      escreva("Digite o " + i + "º número: ")
      leia(num)

      se (num % 2 ==0)
        contPar++
      senao
        contImpar++
    }

    escreva("\nTotal de números pares: " + contPar + "\n")
    escreva("Total de números ímpares: " + contImpar)
  }
}
