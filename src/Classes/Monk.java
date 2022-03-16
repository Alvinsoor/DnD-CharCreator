package Classes;

import Races.baseRace;

public class Monk implements baseClass {
    String ClassGame = "Monk";
    String Weapons = "Shortsword, or any simple melee weapon";
    String Items = "(a) a Dungeoneer's Pack or (b) an Explorer's Pack, Darts (10)";
    String Armor = "None";
    String SkillProf = "Choose two from Acrobatics, Athletics, History, Insight, Religion, and Stealth";
    String Features = "Unarmored Defense, Martial Arts";
    String HitDice = "1d8";
    int ProfBonus = 2;
    int hitPoints = 8;


    public Monk() {

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
        return 0;
    }

    public int getNumSpells() {
        return 0;
    }

    public int getNumSlots() {
        return 0;
    }

    public int getStrSave() {
        return getProfBonus();
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
        return 0;
    }


    public int getAC(baseRace Race) {
        return 10 + Race.getWisMod() + Race.getDexMod();
    }

    public int getProfBonus() {
        return ProfBonus;
    }
}
