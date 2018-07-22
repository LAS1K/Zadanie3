import Interface.*;

public class Pralka {
    private Beben beben;
    private Silnik silnik;
    private Obudowa obudowa;

    public Pralka(Factory factory) {
        beben = factory.installBeben();
        silnik = factory.installSilnik();
        obudowa = factory.installObudowa();
        build();
    }

    public void build(){
        beben.install();
        silnik.install();
        obudowa.install();
    }

}
