package Races;

public class Tiefling extends baseRace {
    public Tiefling(String Name, int Str, int Dex, int Con, int Int, int Wis, int Cha) {
        super(Name, Str, Dex, Con, Int + 1, Wis, Cha + 2);
        this.setRace("Tiefling");
        this.setLanguages("Common, Infernal");
        setSpeed(25);
        setRacialTraits("Darkvision, Hellish Resistance, Infernal Legacy");
    }
}
