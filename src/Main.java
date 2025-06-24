public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone("Lançamento iPhone 2017", 123456);

        iphone.tocarMusica();
        iphone.selecionarMusica("Mamonas Assassinas - 1406");
        iphone.ligar("1167295835");
        iphone.exibirPagina("https://www.apple.com");
    }
}