package Dominio;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> c = new ArrayList<>();

    public void adicionarProduto (Produto p)
    {
        c.add(p);
    }
    public double calcTotal()
    {
        double total=0;
        for(Produto p : c)
        {
            total+=p.getPreco();
        }
        return total;

   }
   public void aplicarDescontoGeral(double percentual)
   {
    for(Produto p : c)
        {
           p.aplicarDesconto(percentual);
        }
        
   }
 
}
