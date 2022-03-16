package Classes;

import Races.baseRace;

public class Barbarian implements baseClass {
    String ClassGame = "Barbarian";
    String Weapons = "(a) a martial weapon and a Shield or (b) two Martial Weapons, (a) a Light Crossbow and 20 bolts or (b) two handaxes, and a Longbow";
    String Items = "(a) a Dungeoneer's Pack or (b) an Explorer's Pack and Arrows (20)";
    String Armor = "Chain Mail";
    String SkillProf = "Choose two Skills from Acrobatics, Animal Handling, Athletics, History, Insight, Intimidation, Perception, and Survival";
    String Features = "Fighting Style, Second Wind";
    String HitDice = "1d10";
    int ProfBonus = 2;
    int hitPoints = 12;


    public Barbarian() {

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
        return 0;
    }

    public int getConSave() {
        return getProfBonus();
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
        return 10 + Race.getDexMod() + Race.getConMod();
    }

    public int getProfBonus() {
        return ProfBonus;
    }
}
