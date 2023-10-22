package edu.dio.dispositivos.telefone;

public class Blackberry implements AparelhoTelefonico{
    @Override
    public void ligar() {
        System.out.println("Ligando pelo Blackberry");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo com o Blackberry");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz do Blackberry");
    }
}
