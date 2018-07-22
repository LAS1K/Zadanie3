import Implementations.Bosch.BoschFactory;
import Implementations.Samsung.SamsungFactory;

public class Main {
    public static void main(String[] args){
        Pralka pralka;
        pralka = new Pralka(new BoschFactory());
        pralka = new Pralka(new SamsungFactory());
    }

}
