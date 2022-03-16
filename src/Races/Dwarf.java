package Races;


public class Dwarf extends baseRace {

    public Dwarf(String Name, int Str, int Dex, int Con, int Int, int Wis, int Cha) {
        super(Name, Str, Dex, Con + 2, Int, Wis, Cha);
        setRace("Dwarf");
        setLanguages("Common, Dwarven");
        setSpeed(25);
        setRacialTraits("Dwarven Resilience, Dwarven Combat Training, Tool Proficiency, Stonecunning");
    }

    public String toString() {
        return super.toString();
    }
}
