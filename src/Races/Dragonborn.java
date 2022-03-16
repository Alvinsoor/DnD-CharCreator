package Races;

public class Dragonborn extends baseRace {
    public Dragonborn(String Name, int Str, int Dex, int Con, int Int, int Wis, int Cha) {
        super(Name, Str+2, Dex, Con, Int, Wis, Cha+1);
        setRace("Dragonborn");
        setLanguages("Common, Draconic");
        setSpeed(30);
        setRacialTraits("Dragon Ancestry, Breath Weapon, Damage Resistance");
    }

    public String toString() {
        return super.toString();
    }
}
