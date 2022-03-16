package Races;

public class Human extends baseRace {

    public Human(String Name, int Str, int Dex, int Con, int Int, int Wis, int Cha) {
        super(Name, Str + 1, Dex + 1, Con + 1, Int + 1, Wis + 1, Cha + 1);
        this.setRace("Human");
        this.setLanguages("Common, one language of your choice");
        setSpeed(30);
        setRacialTraits("None");
    }
}
