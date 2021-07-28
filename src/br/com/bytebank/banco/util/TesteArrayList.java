package br.com.bytebank.banco.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.*;


import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(111,1);
        lista.add(cc1);
        Conta cp1 = new ContaPoupanca(111,2);
        lista.add(cp1);
        Conta cc2 = new ContaCorrente(111,3);
        lista.add(cc2);
        Conta cp2 = new ContaPoupanca(111,4);
        lista.add(cp2);
        Conta cc3 = new ContaCorrente(111,5);
        lista.add(cc3);
        Conta cp3 = new ContaPoupanca(111,6);
        lista.add(cp3);

        // O for abaixo tem o mesmo funcionamento de um forEach do JS
        // Para cada referencia do objeto "conta" da lista, realize a impressão do mesmo.
        for(Conta conta : lista){
            System.out.println(conta);
        }




    }
}
