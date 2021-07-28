package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TestesTributaveis {
    public static void main(String[] args) {
        Cliente iago = new Cliente("Iago");
        ContaCorrente cc = new ContaCorrente(222,333);
        cc.setTitular(iago);
        cc.deposita(100);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImposto calc = new CalculadorImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println("O total a ser pago em impostos é de: R$" + calc.getTotalImposto());
    }
}
