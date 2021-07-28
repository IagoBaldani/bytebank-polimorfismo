package br.com.bytebank.banco.util;

import br.com.bytebank.banco.modelo.*;
import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(111,1);
        lista.add(cc1);

        Conta cp1 = new ContaPoupanca(111,2);
        lista.add(cp1);

        Conta cc2 = new ContaCorrente(111,1);

        // O método "contains" ORIGINALMENTE identifica se há a referência "cc2" no ArrayList
        // Como alteramos o método Equals da classe conta e o método contains utiliza do equals
        // o código abaixo identificará se as agências e os números das contas são iguais entre as referências.
        // Nesse caso, a lista não contém a referência cc2, porém tem uma referência que possui os mesmos valores.
        System.out.println("Já existe? " + lista.contains(cc2));


    }

}
