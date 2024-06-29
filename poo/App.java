public class App {

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Teste dos métodos de ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Cuide bem do seu amor - Paralamas do Sucesso");

        // Teste dos métodos de AparelhoTelefonico
        meuIphone.ligar("11111111111111");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Teste dos métodos de NavegadorInternet
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }

}


