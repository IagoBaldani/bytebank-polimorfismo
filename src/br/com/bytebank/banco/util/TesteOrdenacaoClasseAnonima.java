package br.com.bytebank.banco.util;
import br.com.bytebank.banco.modelo.*;
import java.util.*;

public class TesteOrdenacaoClasseAnonima {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente("Iago");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente("Ana");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente("Lívia");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente("Juliene");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        // Instancia o comparador por numero da conta já como parâmetro do Sort
        // Classe anônima 1ª forma - Inserindo a classe dentro da função sort sem atribuir referência
        lista.sort(new Comparator<Conta>() {
            @Override
            public int compare(Conta c1, Conta c2) {
                return c1.getNumero() - c2.getNumero();
            }
        });


        // Classe anônima 2ª forma - Inserindo a classe dentro da função sort atribuindo referência
        Comparator<Conta> comp = new Comparator<Conta>() {
            @Override
            public int compare(Conta c1, Conta c2) {
                String nomeC1 = c1.getTitular().getNome();
                String nomeC2 = c2.getTitular().getNome();

                return nomeC1.compareTo(nomeC2);
            }
        };

        // Instancia o comparador por nome do titular da conta já como parâmetro do Sort
        lista.sort(comp);

        // Ordena de acordo com a ordem natural da classe
        // Collections.sort(lista);

        for(Conta c : lista){
            System.out.println(c + ", " + c.getTitular().getNome());
            c.mostraSaldo();
        }
    }

}
