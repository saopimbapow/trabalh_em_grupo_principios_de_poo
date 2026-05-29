package Ex9.Controle;

import Ex9.Dominio.*;

public class ControlaException{

    public static void main(String[] args) {
        Conta c=new Conta(5000,"Andre");

        try{
             System.out.println("Tentando realizar saque dentro do limite...");
            c.getSaldo(); // Apenas ilustrativo
            c.sacar(600.0); // Força o disparo da exceção
        }catch(SaldoInsuficienteException e)
        {
             System.err.println("Capturado no Bloco Catch -> " + e.getMessage());
        }finally{
            System.out.println("Fluxo de validação bancária encerrado.");
        }
    




    }
}