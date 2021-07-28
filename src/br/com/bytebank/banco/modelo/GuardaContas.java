package br.com.bytebank.banco.modelo;

public class GuardaContas {

    private Conta[] contas;
    private static int posicaoLivre = 0;

    public GuardaContas (){
        this.contas = new Conta[10];
    }

    public void adiciona (Conta c){
        this.contas[this.posicaoLivre] = c;
        this.posicaoLivre++;
    }

    public int getQtdContas(){
        //System.out.println("Este guardador possui: " + this.posicaoLivre + " contas guardadas.");
        return this.posicaoLivre;
    }

    public Conta getConta(int posicao){
        return this.contas[posicao];
    }


}
