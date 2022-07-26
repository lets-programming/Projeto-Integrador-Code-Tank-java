package br.com.emcriptus.TiposDeContas;

public class ContaCorrente extends Conta{

    private int contadorTalao;

    public ContaCorrente(int numero, String cpf) {
        super(numero, cpf);
    }

    public double debito(double valor){
        double saldo =  super.getSaldo() - valor;
        super.setSaldo(saldo);
        return  saldo;
    }

    public String pediTalao(){

        if(contadorTalao == 3){
            return "Limite de talões excedidos";
        }

        contadorTalao++;

        return "Cheque solicitado com sucesso! \n Seu novo saldo é: R$" + debito(30);
    }
}
