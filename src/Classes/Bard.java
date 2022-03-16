package Classes;

import Races.baseRace;

public class Bard implements baseClass {
    String ClassGame = "Bard";
    String Weapons = "(a) a Rapier, (b) a Longsword, or (c) any simple weapon and a dagger";
    String Items = "(a) a Diplomat's Pack or (b) an Entertainer's Pack and (a) a lute or (b) any other musical instrument";
    String Armor = "Leather Armor";
    String SkillProf = "Choose any three.";
    String Features = "Spellcasting, Bardic Inspiration";
    String HitDice = "1d8";
    int numCantrips = 2;
    int numSpells = 4;
    int numSlots = 2;
    int ProfBonus = 2;
    int hitPoints = 8;


    public Bard() {

    }

    public String getWeapons() {
        return Weapons;
    }

    public String getSkillProf() {
        return SkillProf;
    }

    public String getFeatures() {
        return Features;
    }

    public String getHitDice() {
        return HitDice;
    }

    public String getClassGame() {
        return ClassGame;
    }

    public String getItems() {
        return Items;
    }

    public String getArmor() {
        return Armor;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getNumCantrips() {
        return numCantrips;
    }

    public int getNumSpells() {
        return numSpells;
    }

    public int getNumSlots() {
        return numSlots;
    }

    public int getStrSave() {
        return 0;
    }

    public int getDexSave() {
        return getProfBonus();
    }

    public int getConSave() {
        return 0;
    }

    public int getIntSave() {
        return 0;
    }

    public int getWisSave() {
        return 0;
    }

    public int getChaSave() {
        return getProfBonus();
    }


    public int getAC(baseRace Race) {
        return 11 + Race.getDexMod();
    }

    public int getProfBonus() {
        return ProfBonus;
    }
}
