package Dominio;

public abstract class Funcionario
{
    private String nome;
    private double salarioBase;
    
    public Funcionario(String nome,double salario){
        this.nome=nome;
        this.salarioBase=salario;
    }
    
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome=nome;}
    
    public Double getSalario(){return salarioBase;}
    public void setSalario(double salario){this.salarioBase=salario;}
    
    
    public abstract double calcSalario();
    public abstract void exibir();
}