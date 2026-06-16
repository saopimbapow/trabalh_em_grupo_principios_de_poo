
import Controller.*; 
import Repository.GerenciarFrota;
import View.ConsoleView;

public class Main {
    public static void main(String[] args) {
        
        GerenciarFrota repository = new GerenciarFrota();
        
        ConsoleView view = new ConsoleView();
        
        FrotaController controller = new FrotaController(view, repository);
        
        controller.iniciar();
    }
}


