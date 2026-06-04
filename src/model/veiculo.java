package model;

public abstract class veiculo  {

    private String placa;
    private double custoFixo;



    public veiculo(String placa, double custoFixo) throws validacao {

        validaPlaca(placa);
        this.placa = placa;
        this.custoFixo = custoFixo;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCustoFixo() {
        return custoFixo;
    }

    public void setCustoFixo(double custoFixo) {
        this.custoFixo = custoFixo;
    }
    public static boolean validaPlaca(String placa) throws validacao {
        if (placa.length() != 7 ) {
            throw new validacao(placa);

        }
        else{
            return true;
        }
    }
    @Override
    public String toString()
    {
        return  "Placa: "+placa+"\t Custo Fixo: "+ custoFixo;
    }
    public abstract double calcularValor();
}
