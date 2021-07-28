package br.com.bytebank.banco.util;


public class TesteWrapper {
    public static void main(String[] args) {

        // Wrappers são transformadores de primitivos em Objetos
        // Exemplo de autoboxing e unboxing

        Double dImp = 3.5; // Autoboxing implícito (O Java faz o código abaixo, porém "por baixo dos panos")
        Double dExp = Double.valueOf(3.5); // Autoboxing explícito;

        System.out.println(dImp + 1); // Unboxing implícito (O Java faz o código abaixo, porém "por baixo dos panos")
        System.out.println(dExp.doubleValue() + 1); // Autoboxing explícito;


    }
}
