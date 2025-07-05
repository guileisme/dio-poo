public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Can't Stop - Red Hot Chili Peppers");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("81999999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}

