package Dominio;

public class Desenvolvedor extends Funcionario
{
    private int horasExtras;
    private int valorHora=50;
    
    public Desenvolvedor(String nome, double salario,int horasExtras)
    {
        super(nome, salario);
        this.horasExtras=horasExtras;
    }

    public int getHorasExtras(){
        return horasExtras;
    }
    public void setHorasExtras(int horasExtras){this.horasExtras=horasExtras;}
    
    public double calcSalario()
    {
        return getSalario()+(horasExtras*valorHora);
    }
    @Override
    public void exibir(){
        System.out.println("Nome:"+getNome()+"Salario base:"+getSalario()+"Horas extras:"+getHorasExtras()+"Salario total:"+calcSalario());
    }
    
}