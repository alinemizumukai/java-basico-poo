package edu.dio.dispositivos.musica;

public class IPod implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando música no iPod");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música no iPod");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma música no iPod");
    }
}
