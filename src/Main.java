import model.*;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        caminhao caminhao2 = null;
        carro carrao = null;
        boolean continuar = true;


        while (continuar){
            System.out.println("\n0)placa de carro \n1)adcionar carro \n2)adcionar caminhão \n3)calcular custo total \n4)calcularIPVA \n5)mostrar frota \n6)sair ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 0:
                    System.out.println("A placa do carro não pode conter menos ou mais de 7 caracteres.");

                    try {
                        carro Carro = new carro(400, "123badf3", 500.70);
                        carro Carro2 = new carro(400, "123bad5", 500.70);
                    } catch (validacao ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 1:
                    System.out.println("quilometragem do carro:");
                    int quilometragem = scanner.nextInt();
                    System.out.println("placa do carro:");
                    String placa = scanner.next();
                    System.out.println("custo fixo do carro:");
                    double custoFixo = scanner.nextDouble();
                    carrao = new carro(quilometragem, placa, custoFixo);
                    break;

                case 2:
                    System.out.println("toneladas do caminhão:");
                    int tonecargas2 = scanner.nextInt();
                    System.out.println("placa do caminhão:");
                    String placa2 = scanner.next();
                    System.out.println("custo fixo do caminhão:");
                    double custoFixo2 = scanner.nextDouble();
                    caminhao2 = new caminhao(tonecargas2, placa2, custoFixo2);
                    break;

                case 3:
                    System.out.println("custo total do:");
                    System.out.println("\n0)caminhão \n1)carro");
                    int escolha2 = scanner.nextInt();
                    switch (escolha2) {
                        case 0:
                            caminhao2.calcularValor();
                            break;
                        case 1:
                            carrao.calcularValor();
                            break;
                        default:

                       break;
                    }

                case 4:
                    System.out.println("custo total do:");
                    System.out.println("\n0)caminhão \n1)carro");
                    int escolha3 = scanner.nextInt();
                    switch (escolha3) {
                        case 0:
                            caminhao2.calcularIPVA();
                            break;
                        case 1:
                            carrao.calcularIPVA();
                            break;
                            default:

                        break;

                    }

                case 6:
                    System.out.println("fechando.");
                    continuar = false;


            }
        }


    }
}