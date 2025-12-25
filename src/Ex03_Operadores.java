//Exercício 03 - Operadores
//Crie um programa que demonstre o uso de operadores aritméticos, de comparação e lógicos em Java.

public class Ex03_Operadores {
    
        public static void main(String[] args) {
        
        int a = 10;
        int b = 3;
        int soma = a + b;
        int subtracao = a - b; 
        int multiplicacao = a * b;
        int divisao = a / b;

        System.out.println();
        System.out.println();
        System.out.println("Operadores Aritméticos:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("==============================");
        System.out.println("Operadores de comparação:");
        System.out.println("a é igual a b? " + (a == b));
        System.out.println("a é maior que b? " + (a > b));
        System.out.println("Soma é maior que multiplicação? " + (soma > multiplicacao));
        System.out.println("Subtração é menor que divisão? " + (subtracao <  divisao));
        System.out.println("==============================");
        System.out.println("Operadores Lógicos:");
        boolean resultado1 = (a > b) && (soma > multiplicacao);
        boolean resultado2 = (a < b) || (subtracao < divisao);
        System.out.println("Resultado da operação (a > b) && (soma > multiplicação): " + resultado1);
        System.out.println("Resultado da operação (a < b) || (subtração < divisão): " + resultado2);    
        }
}
