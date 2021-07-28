package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{

     public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }


    @Override
    public boolean saca(double valor){
        double valorMaisPorcentagem = valor + (valor * 0.1);

        if(super.saldo >= valorMaisPorcentagem && valorMaisPorcentagem > 0){
            super.saldo -= valorMaisPorcentagem;
            System.out.println("----------------------------------");
            System.out.println("Saque concluído com sucesso! (R$"+ valor +" + 10% de taxa)");
            this.mostraSaldo();
            return true;
        }
        else{
            System.out.println("----------------------------------");
            System.out.println(this.getTitular().getNome() + ", seu saldo é inferior ao valor que deseja sacar! (R$"
                    + valor +")");
            this.mostraSaldo();
            return false;
        }
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public String toString(){
        return "Conta corrente, " + super.toString();
    }
}
