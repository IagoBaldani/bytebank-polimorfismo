package br.com.bytebank.banco.modelo;

import java.util.Comparator;

public abstract class Conta implements Comparable<Conta> {
    protected double saldo;
    private int agencia, numero;
    private Cliente titular;
    private static int total;

    // ----------------------------------------------
    // Construtor
    // ----------------------------------------------


    public Conta(int agencia, int numero){
        total++;
        System.out.println("----------------------------------");
        System.out.println("Conta criada com sucesso! O total de contas é de: "+ total);

        this.agencia = agencia;
        this.numero = numero;
    }



    // ----------------------------------------------
    // Métodos
    // ----------------------------------------------

    public boolean deposita(double valor){
        if(valor > 0 ){
            this.saldo += valor;
            System.out.println("----------------------------------");
            System.out.println("Depósito concluído com sucesso! (R$" + valor + ")");
            // this.mostraSaldo();
            return true;
        }
        else{
            System.out.println("----------------------------------");
            System.out.println("Não é possível depositar valores negativos!");
            return false;
        }
    }

    public boolean saca(double valor){
        if(this.saldo >= valor && valor > 0){
            this.saldo -= valor;
            System.out.println("----------------------------------");
            System.out.println("Saque concluído com sucesso! (R$" + valor + ")");
            this.mostraSaldo();
            return true;
        }
        else{
            System.out.println("----------------------------------");
            System.out.println(this.titular.getNome() + ", seu saldo é inferior ao valor que deseja sacar! (R$"
                    + valor +")");
            this.mostraSaldo();
            return false;
        }
    }

    public boolean transfere (Conta contaRecebedora, double valor){
        if(this.saldo >= valor && valor > 0){
            this.saldo -= valor;
            contaRecebedora.saldo += valor;
            System.out.println("----------------------------------");
            System.out.println("Tranferência concluída com sucesso! (R$" + valor + ")");
            this.mostraSaldo(); 
            return true;
        }
        else{
            if (this.saldo < valor){
                System.out.println("----------------------------------");
                System.out.println(this.titular.getNome() + ", seu saldo é inferior ao valor que deseja transferir! (R$"
                        + valor +")");
                this.mostraSaldo();
            }
            else{
                System.out.println("----------------------------------");
                System.out.println("Não é possível depositar valores negativos!");
            }
            return false;
        }
    }

    public double mostraSaldo (){
        System.out.println("----------------------------------");
        System.out.println( this.getTitular().getNome() + ", seu saldo é de: R$"+ this.getSaldo());
        return this.getSaldo();
    }

    // ----------------------------------------------
    // Overrides - Sobreescritas de métodos de outras classes mães
    // ----------------------------------------------


    @Override
    public String toString(){
        System.out.println("----------------------------------");
        return "número: "+ this.numero + " | Agência: "+ this.agencia;
    }

    @Override
    public boolean equals(Object c){
        Conta oRef = (Conta) c;

        if(this.numero == oRef.getNumero() && this.agencia == oRef.getAgencia()){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int compareTo(Conta c2) {
        return Double.compare(this.saldo, c2.saldo);
    }

    // ----------------------------------------------
    // Getters e Setters
    // ----------------------------------------------

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    // --------------------------------------------------------------
    // Os métodos abaixos são métodos da CLASSE, não dá instância.
    // --------------------------------------------------------------
    public static int getTotal() {
        return total;
    }
    public static void setTotal(int total) {
        Conta.total = total;
    }
}

