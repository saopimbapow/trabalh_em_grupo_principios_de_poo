package Ex10.Dominio;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
public class GerenciarFrota {
    private ArrayList<Veiculo> frota=new ArrayList<>();

    public void adicionarVeiculo(Veiculo v)
    {
        frota.add(v);
    }

    public void salvarDadosEmArquivo(String nomeArq)
    {
        File arq= new File(nomeArq);
        
        
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(arq))) {
                for(Veiculo f : frota )
                {
                    writer.write(f.toString());
                    writer.newLine();
                }
                
            } catch (IOException e) {
                System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
            }
        
    }
    public void lerDadosEmArquivo(String nomeArq)
    {
        File arq= new File(nomeArq);
        if(arq.exists())
        {
            try(BufferedReader reader= new BufferedReader(new FileReader(arq))) {
               String linha;
               while ( (linha= reader.readLine())!= null)
               {
                System.out.println(linha+"\n");
               }
                
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        }
    }


}
