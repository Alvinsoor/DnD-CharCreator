package Classes;

import Races.baseRace;

public class Paladin implements baseClass {
    String ClassGame = "Paladin";
    String Weapons = "(a) a martial weapon and a Shield or (b) two Martial Weapons and (a) five javelins or (b) any simple melee weapon";
    String Items = "(a) a Priest's Pack or (b) an Explorer's Pack and a holy Symbol";
    String Armor = "Chain Mail";
    String SkillProf = "Choose two from Athletics, Insight, Intimidation, Medicine, Persuasion, and Religion";
    String Features = "Divine Sense, Lay on Hands";
    String HitDice = "1d10";
    int ProfBonus = 2;
    int hitPoints = 10;


    public Paladin() {

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
        return 0;
    }

    public int getDexSave() {
        return 0;
    }

    public int getConSave() {
        return 0;
    }

    public int getIntSave() {
        return 0;
    }

    public int getWisSave() {
        return getProfBonus();
    }

    public int getChaSave() {
        return getProfBonus();
    }


    public int getAC(baseRace Race) {
        return 16;
    }

    public int getProfBonus() {
        return ProfBonus;
    }
}
