package edu.dio.loja;

import edu.dio.dispositivos.internet.NavegadorInternet;
import edu.dio.dispositivos.musica.ReprodutorMusical;
import edu.dio.dispositivos.smartphone.IPhone;
import edu.dio.dispositivos.telefone.AparelhoTelefonico;

public class Loja
{
    public static void main( String[] args )
    {
        // Inicializando o componente IPhone
        IPhone iPhone = new IPhone();

        ReprodutorMusical reprodutorMusical = iPhone;
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        AparelhoTelefonico aparelhoTelefonico = iPhone;
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        NavegadorInternet navegadorInternet = iPhone;
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.exibirPagina();
        navegadorInternet.atualizarPagina();
    }
}
