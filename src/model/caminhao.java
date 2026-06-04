package model;

public class caminhao extends veiculo implements Tributavel {


    private double  toneladasCarga;

    public caminhao(double toneladasCarga, String placa, double custoFixo) {
        super(placa, custoFixo);
        this.toneladasCarga = toneladasCarga;

    }

    @Override
    public double calcularValor(){
        double custototal = getCustoFixo() + (toneladasCarga * 50.0);
        return custototal;

    }

    @Override
    public double calcularIPVA() {
        double IPVA = 1.05 * getCustoFixo() / 100;
        return IPVA;


    }
    @Override
    public String toString()
    {
        return "Tipo do veiculo: "+getClass().getSimpleName() +
                "\tPlaca: "+getPlaca()+
                "\tCusto Fixo: "+ getCustoFixo()+
                "\tCusto Total: "+ calcularValor() +
                "\tCarga: "+toneladasCarga+" toneladas";
    }
}
