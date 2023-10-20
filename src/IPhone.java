public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando outra música...");
    }

    public void ligar() {
        System.out.println("Chamando...");
    }

    public void atender() {
        System.out.println("Ligação atendida");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Ouvindo correio de voz...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página web...");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) {
        IPhone x = new IPhone();
        x.ligar();
        x.atender();
        x.iniciarCorreioDeVoz();
        x.exibirPagina();
        x.atualizarPagina();
        x.adicionarNovaAba();
        x.tocarMusica();
        x.pausarMusica();
        x.selecionarMusica();
    }
}

