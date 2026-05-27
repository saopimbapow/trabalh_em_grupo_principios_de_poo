package Ex3.Dominio;
public class ContaC extends Conta{
    protected double limite;
    
    public ContaC(String nome,double saldo,double limite)
    {
        super(nome,saldo);
        this.limite=limite;
    }
    
    public double chequeEspecial(int valor)
    {
        if(valor>saldo && saldo>0)
        {
            saldo-=valor;
            System.out.println("Saldo:"+saldo+"\n Cheque especial");
            return saldo*(1.08); 
        }
        System.out.println("Saldo:"+saldo) ;
        return saldo-valor;
    }
}