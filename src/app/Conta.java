package app;

public class Conta {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    // Construtor

    public Conta(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Getters

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para exibir dados formatados

    public void exibirMensagem() {
        System.out.println("\nOlá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia +
                ", conta " + numero +
                " e seu saldo " + saldo +
                " já está disponível para saque.");
    }
}

