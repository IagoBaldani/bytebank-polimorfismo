package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class Testes {

    public static void main(String[] args) {

        Conta cp = new ContaPoupanca(1,359);
        Conta cc = new ContaCorrente(1,360);

        System.out.println(cp);
        System.out.println(cc);
    }


}
