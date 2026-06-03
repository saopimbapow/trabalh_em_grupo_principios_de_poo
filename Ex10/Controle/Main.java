package Ex10.Controle;
import Ex10.Dominio.*;

public class Main {
    public static void main(String[] args) {
      
        GerenciarFrota gerenciador = new GerenciarFrota();

        try {
           
            Carro carroInvalido = new Carro("ABC12", 200.0, 50000)  ;
           
            System.out.println("ALERTA: O veículo foi criado com placa inválida! (O erro não funcionou)\n");
            
        } catch (PlacaException e) {
            
            System.out.println("O sistema bloqueou a criação! Motivo: " + e.getMessage()+"\n");
        }

        
        Carro meuCarro = new Carro("ABC1234", 150.50, 25000);
        Caminhao meuCaminhao = new Caminhao("DEF5678", 850.00, 15);
        
        gerenciador.adicionarVeiculo(meuCarro);
        gerenciador.adicionarVeiculo(meuCaminhao);
        System.out.println("Objetos Carro e Caminhão instanciados e adicionados com sucesso.\n");

        gerenciador.salvarDadosEmArquivo("frota.txt");
        
        System.out.println("Arquivo 'frota.txt' gerado/atualizado com sucesso.\n");
        
        gerenciador.lerDadosEmArquivo("frota.txt");
        
       
    }
}
    

