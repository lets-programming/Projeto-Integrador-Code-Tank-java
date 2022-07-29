package br.com.emcriptus.TiposDeContas;

import java.util.ArrayList;
import java.util.Random;

public abstract class Conta {

    private int numero;
    private String cpf;
    private double saldo;
    private String nome;

    private boolean ativo;

    public Conta(int numero, String cpf, String nome) {
        this.numero = numero;
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
        return cpf;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double debito(double valor){
        saldo -= valor;
        return  saldo;
        //Fazer verificações: Valor a ser debitado não pode ser maior que saldo
    }

    public void credito(double valor){
        saldo += valor;
        //Fazer retorno do Saldo atual do cliente
    };

    public static int gerarNumConta(ArrayList<Integer> contas) {
        Random random = new Random();

        int numConta = (random.nextInt(99999 - (10000 - 1)) + 10000); //Valor aleatorio 10000 até 99999

//        for(int i = 0; i <= contas.size(); i++ ){
//            while(contas.get(i) == numConta){
//                numConta = (random.nextInt(99999 - (10000 - 1)) + 10000); //Novo numero aleatorio
//            }
//        }

        for (int i: contas) { //foreach contas[i]
            while(i == numConta){
                numConta = (random.nextInt(99999 - (10000 - 1)) + 10000); //Novo numero aleatorio
            }
        }

        return numConta;
    }

}
