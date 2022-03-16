package Classes;

import Races.baseRace;

public class Wizard implements baseClass{
    String ClassGame = "Wizard";
    String Weapons = "(a) a Quarterstaff or (b) a Dagger";
    String Items = "(a) a Component pouch or (b) an arcane focus, (a) a Scholar's Pack or (b) an Explorer's Pack and a Spellbook";
    String Armor = "None";
    String SkillProf = "Choose two from Arcana, History, Insight, Investigation, Medicine, and Religion";
    String Features = "Spellcasting, Arcane Recovery";
    String HitDice = "1d6";
    int numCantrips = 3;
    int numSpells = 0;
    int numSlots = 2;
    int ProfBonus = 2;
    int hitPoints = 8;


    public Wizard() {

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
        return 0;
    }

    public int getConSave() {
        return 0;
    }

    public int getIntSave() {
        return getProfBonus();
    }

    public int getWisSave() {
        return getProfBonus();
    }

    public int getChaSave() {
        return 0;
    }


    public int getAC(baseRace Race) {
        return 10 + Race.getDexMod();
    }

    public int getProfBonus() {
        return ProfBonus;
    }
}
