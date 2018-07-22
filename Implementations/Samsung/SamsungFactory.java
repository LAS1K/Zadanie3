package Implementations.Samsung;

import Interface.Beben;
import Interface.Factory;
import Interface.Obudowa;
import Interface.Silnik;

public class SamsungFactory implements Factory {
    @Override
    public Beben installBeben() {
        return new BebenSamsung();
    }

    @Override
    public Silnik installSilnik() {
        return new SilnikSamsung();
    }

    @Override
    public Obudowa installObudowa() {
        return new ObudowaSamsung();
    }
}
