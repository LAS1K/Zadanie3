package Implementations.Bosch;

import Interface.Beben;
import Interface.Factory;
import Interface.Obudowa;
import Interface.Silnik;

public class BoschFactory implements Factory {
    @Override
    public Beben installBeben() {
        return new BebenBosch();
    }

    @Override
    public Silnik installSilnik() {
        return new SilnikBosch();
    }

    @Override
    public Obudowa installObudowa() {
        return new ObudowaBosch();
    }
}
