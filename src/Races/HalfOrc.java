package Races;

public class HalfOrc extends baseRace {
    public HalfOrc(String Name, int Str, int Dex, int Con, int Int, int Wis, int Cha) {
        super(Name, Str + 2, Dex, Con + 1, Int, Wis, Cha);
        this.setRace("Half Orc");
        this.setLanguages("Common, Aarakocra, Avian");
        setSpeed(30);
        setRacialTraits("Darkvision, Savage Attacks, Relentless Endurance, Menacing");
    }
}
