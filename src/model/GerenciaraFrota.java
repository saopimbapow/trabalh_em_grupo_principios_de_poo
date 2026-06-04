package model;

import java.util.ArrayList;

import model.veiculo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;


public class GerenciaraFrota {

    private ArrayList<veiculo> frota = new ArrayList<>();

    public void adicionarVeiculo(veiculo v)
    {
        frota.add(v);
    }

    public void salvarDadosEmArquivo(String nomeArq)
    {
        File arq= new File(nomeArq);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(arq)))
        {
            for(veiculo v: frota)
            {
                writer.write(v.toString());
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
        try(BufferedReader reader = new BufferedReader(new FileReader(arq)))
        {
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
