package model;

public class carro extends veiculo implements Tributavel  {

    private int quilometragem;

    public carro(int quilometragem, String placa, double custoFixo) {
        super(placa, custoFixo);
        this.quilometragem = quilometragem;

    }
    @Override
    public String toString()
    {
        return "Tipo do veiculo: "+getClass().getSimpleName() +
                "\tPlaca: "+getPlaca()+
                "\tCusto Fixo: "+ getCustoFixo() +
                "\tCusto total:"+calcularValor()+
                "\tQuilometragem: "+quilometragem;
    }


    @Override
    public double calcularValor(){
        double custototal = getCustoFixo() + (quilometragem * 0.15);
        return custototal;
    }

    @Override
    public double calcularIPVA() {
       double IPVA = 0.04 * getCustoFixo() / 100;
       return IPVA;


    }
}
