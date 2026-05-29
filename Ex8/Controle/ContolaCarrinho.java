package Ex8.Controle;


import Ex8.Dominio.*;

public class ContolaCarrinho {
    public static void main(String[] args) {
        Carrinho c= new Carrinho();
        Produto p1= new Produto("Detergente",2 );
        Produto p2= new Produto("Panela",25.99 );

        c.adicionarProduto(p2);
        c.adicionarProduto(p1);
        System.out.println(c.calcTotal());
        c.aplicarDescontoGeral(15);
        System.out.printf("%.2f\n",c.calcTotal());
    }
}
