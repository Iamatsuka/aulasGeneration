import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        int v[] = new int[10];
        int soma = 0;
        double media = 0.0;
        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.print("v["+i+"]: ");
            v[i] = leia.nextInt();
            soma += v[i];
        }

        System.out.println("\nElementos nos indices impares:");

        for(int i = 1; i < 10; i += 2) {
            System.out.print("" + v[i] + " ");
        }

        System.out.println("\n\nElementos pares:");

        for(int i = 0; i < 10; i++) {
            if(v[i] % 2 ==0) {
                System.out.print("" + v[i] + " ");
            }
        }

        media = soma/10.0;

        System.out.println("\n\nSoma: " + soma);

        System.out.println("\nMedia: " + media);
    }
}

//__________________________________________________________________

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        double m[][] = new double[10][4];
        double v[] = new double[10];
        double soma;
        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            soma = 0.0;

            for(int j = 0; j < 4; j++) {
                System.out.print("m["+i+"]["+j+"]: ");
                m[i][j] = leia.nextDouble();

                soma += m[i][j];
            }

            v[i] = soma/4;
        }

        for(int i = 0; i < 10; i++) {
            System.out.print("" + v[i] + " | ");
        }
    }
}