package Ex9.Dominio;

public class Conta {
    
    private double saldo;
    private String titular;

    public Conta(double saldo,String titular)
    {
        this.saldo=saldo;
        this.titular=titular;
    }

    public void setSaldo(double saldo){this.saldo=saldo;}
    public double getSaldo(){return saldo;}
    public void setTitular(String titular){this.titular=titular;}
    public String getTitular(){return titular;}

    public void sacar( double valor) throws SaldoInsuficienteException{
        if(valor>saldo)
            {
                throw new SaldoInsuficienteException(saldo, valor);
            }
            setSaldo(saldo-valor);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso! Novo saldo: R$ " + saldo);
    }
}
