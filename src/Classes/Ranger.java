package Classes;

import Races.baseRace;

public class Ranger implements baseClass {
    String ClassGame = "Ranger";
    String Weapons = "(a) two shortswords or (b) two simple Melee Weapons and a Longbow";
    String Items = "(a) a Dungeoneer's Pack or (b) an Explorer's Pack and a Quiver of 20 Arrows";
    String Armor = "Leather Armor";
    String SkillProf = "Choose three from Animal Handling, Athletics, Insight, Investigation, Nature, Perception, Stealth, and Survival";
    String Features = "Favored Enemy, Natural Explorer";
    String HitDice = "1d10";
    int ProfBonus = 2;
    int hitPoints = 10;


    public Ranger() {

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
        return 11 + Race.getDexMod();
    }

    public int getProfBonus() {
        return ProfBonus;
    }
}
