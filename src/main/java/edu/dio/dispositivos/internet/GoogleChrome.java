package edu.dio.dispositivos.internet;

public class GoogleChrome implements NavegadorInternet{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página no Google Chrome");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Google Chrome");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página no Google Chrome");
    }
}
