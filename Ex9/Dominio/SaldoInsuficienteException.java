package Ex9.Dominio;

public class SaldoInsuficienteException extends Exception
{
    private double saldo;
    private double valorOperacao;

    public SaldoInsuficienteException(double saldo,double valorOperacao)
    {
        super("Erro transacional: Tentativa de sacar R$:"+valorOperacao+" em uma conta com saldo de R$:"+saldo);
        this.saldo=saldo;
        this.valorOperacao=valorOperacao;
    }
}