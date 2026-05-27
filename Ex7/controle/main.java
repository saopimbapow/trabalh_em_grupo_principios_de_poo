package controle;
import Dominio.*;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Gerente g1= new Gerente("Joao", 40000, 50);
        Desenvolvedor d1= new Desenvolvedor("Paulo",30000,400);
        ArrayList<Funcionario> f=new ArrayList<>();
        f.add(g1);
        f.add(d1);
        
        for(Funcionario funcio:f)
        {
            funcio.exibir();
        }


    }
}
