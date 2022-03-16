package Races;

public class Aarakocra extends baseRace {
    public Aarakocra(String Name, int Str, int Dex, int Con, int Int, int Wis, int Cha) {
        super(Name, Str, Dex + 2, Con, Int, Wis + 1, Cha);
        this.setRace("Aarakocra");
        this.setLanguages("Common, Aarakocra, Avian");
        setSpeed(25);
        setRacialTraits("Flight, Talons");
    }

}
