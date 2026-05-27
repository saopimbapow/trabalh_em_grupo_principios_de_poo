package Dominio;

public class Gerente extends Funcionario
{
    private double bonus;
    
    public Gerente(String nome, double salario,double bonus)
    {
        super(nome,salario);
        this.bonus=bonus;
    }
    public double getBonus(){
        return bonus;
    }
    @Override
    public double calcSalario()
    {
        
        return getSalario()*(1+(bonus/100));

    }
    @Override
    public void exibir(){
        System.out.println("Nome:"+getNome()+"Salario base:"+getSalario()+"Bonus:"+getBonus()+"Salario total:"+calcSalario());
    }
}