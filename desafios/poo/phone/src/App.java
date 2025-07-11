public class App {
    public static void main(String[] args) {
        // Create an instance of iPhone
        iPhone myiPhone = new iPhone();

        // Test ReprodutorMusical methods
        System.out.println("Testing Music Player:");
        myiPhone.selecionarMusica("Imagine - John Lennon");
        myiPhone.tocar();
        myiPhone.pausar();

        // Test AparelhoTelefonico methods
        System.out.println("\nTesting Phone:");
        myiPhone.ligar("123-456-7890");
        myiPhone.atender();
        myiPhone.iniciarCorreioVoz();

        // Test NavegadorInternet methods
        System.out.println("\nTesting Internet Browser:");
        myiPhone.exibirPagina("https://www.example.com");
        myiPhone.adicionarNovaAba();
        myiPhone.atualizarPagina();
    }
}