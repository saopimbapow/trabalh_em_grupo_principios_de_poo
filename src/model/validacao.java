package model;

public class validacao extends RuntimeException {
    public validacao(String placa) {
        super("erro ao validar(possui quantidade de caracteres insuficiente).");
    }

}
