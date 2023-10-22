package edu.dio.dispositivos.internet;

public class MozillaFirefox implements NavegadorInternet{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página no Mozilla Firefox");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Mozilla Firefox");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página no Mozilla Firefox");
    }
}
