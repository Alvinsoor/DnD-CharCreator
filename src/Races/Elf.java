package Races;

public class Elf extends baseRace {
    public Elf(String Name, int Str, int Dex, int Con, int Int, int Wis, int Cha) {
        super(Name, Str, Dex + 2, Con, Int, Wis, Cha);
        this.setRace("Elf");
        this.setLanguages("Common, Elvish");
        setSpeed(30);
        setRacialTraits("Darkvision, Keen Senses, Fey Ancestry, Trance");

    }

    public String toString() {
        return super.toString();
    }
}
