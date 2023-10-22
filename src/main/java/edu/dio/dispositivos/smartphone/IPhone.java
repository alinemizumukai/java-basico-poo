package edu.dio.dispositivos.smartphone;

import edu.dio.dispositivos.internet.NavegadorInternet;
import edu.dio.dispositivos.musica.ReprodutorMusical;
import edu.dio.dispositivos.telefone.AparelhoTelefonico;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando música no iPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música no iPhone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma música no iPhone");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando pelo iPhone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo com o iPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz do iPhone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página no iPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página no iPhone");
    }
}
