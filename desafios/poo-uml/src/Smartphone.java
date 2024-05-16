import java.util.Scanner;

public class Smartphone implements MusicPlayer, Dialer, WebBrowser{
    private String phoneNumber;
    private String currentSong = "One - Metallica";

    private Scanner sc = new Scanner(System.in);

    private String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber() {
        this.phoneNumber = sc.next();
    }

    @Override
    public void call() {
        System.out.println("Digite o numero:");
        setPhoneNumber();

        System.out.println("Ligando para "+ getPhoneNumber());
    }

    @Override
    public void pickUp() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void playVoiceMail() {
        System.out.println("Caixa de mensagens vazia...");
    }

    @Override
    public void play() {
        if (currentSong.isEmpty()){
            selectSong();
        }
        System.out.println("Tocando agora "+currentSong);
    }

    @Override
    public void stop() {
        System.out.println("Reprodução encerrada");
    }

    @Override
    public void selectSong() {
        currentSong = sc.next();
    }

    @Override
    public void showPage() {
        System.out.println("Hello, World!");
    }

    @Override
    public void newTab() {
        System.out.println("Nova aba.");
    }

    @Override
    public void refresh() {
        System.out.println("atualizando.");
    }
}
