package Ex8.Dominio;

public class Produto implements AplicarDesconto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco)
    {
        this.nome=nome;
        this.preco=preco;
    }

    public double getPreco(){return preco;}
    public void setPreco(double preco){this.preco=preco;}

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome=nome;}


    public void aplicarDesconto(double percentual)
    {
        setPreco(preco-preco*(percentual/100));
    }
}
