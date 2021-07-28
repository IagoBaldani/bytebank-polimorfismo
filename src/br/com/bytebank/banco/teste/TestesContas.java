package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TestesContas {
    public static void main(String[] args) {
        Cliente t1 = new Cliente("Titular 1");
        Cliente t2 = new Cliente("Titular 2");

        ContaCorrente cc = new ContaCorrente(111,111);
        cc.setTitular(t1);
        cc.deposita(500);
        cc.saca(200);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.setTitular(t2);
        cp.deposita(500);

        cc.transfere(cp,200);
        cp.mostraSaldo();


    }
}
