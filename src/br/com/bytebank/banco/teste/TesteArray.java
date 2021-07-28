package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteArray {
    public static void main(String[] args) {
        GuardaContas guardador = new GuardaContas();

        Conta cc = new ContaCorrente(111,1);
        Cliente iago = new Cliente("Iago Baldani");
        cc.setTitular(iago);

        Conta cp = new ContaPoupanca(111,2);

        guardador.adiciona(cc);
        guardador.adiciona(cp);


        System.out.println(guardador.getQtdContas());
    }
}
