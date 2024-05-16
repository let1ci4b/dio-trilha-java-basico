//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina web.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina web.");
    }

    @Override
    public void ligar() {
        System.out.println("Realizando ligaçao telefonica.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligacao telefonica.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica.");
    }
}