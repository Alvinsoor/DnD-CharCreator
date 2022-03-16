package player;

import Races.baseRace;
import Classes.baseClass;
import com.sun.source.util.Trees;

import java.util.*;

public class Player {
    private static final int MAX = 6, MIN = 1;
    private baseRace Race;
    private baseClass Class;
    private int AC;
    int Athletics, Acrobatics, SleightOfHand, Stealth, Arcana, History, Investigation, Nature, Religion, AnimalHandling, Insight, Medicine, Perception, Survival, Deception, Intimidation, Performance, Persuasion;
    int Initiative;

    public Player(baseRace race) {
        this.Race = race;
    }


    public Player(baseClass Class) {
        this.Class = Class;
    }

    public Player(baseRace Race, baseClass Class) {
        this.Race = Race;
        this.Class = Class;
        AC = Class.getAC(Race);
        setSkillSTR();
        setSkillDEX();
        setSkillINT();
        setSkillWIS();
        setSkillCHA();
        setInitiative();
    }

    public void setSkillSTR() {
        this.Athletics = Race.getStrMod();
    }

    public void setSkillDEX() {
        this.Acrobatics = this.SleightOfHand = this.Stealth = Race.getDexMod();
    }

    public void setSkillINT() {
        this.Arcana = this.History = this.Investigation = this.Nature = this.Religion = Race.getIntMod();
    }

    public void setSkillWIS() {
        this.AnimalHandling = this.Insight = this.Medicine = this.Perception = this.Survival = Race.getWisMod();
    }

    public void setSkillCHA() {
        this.Deception = this.Intimidation = this.Performance = this.Persuasion = Race.getChaMod();
    }

    public void setInitiative() {
        Initiative = Race.getDexMod();
    }

    public int getAC() {
        return AC;
    }

    public int getStrSave() {
        return Race.getStrMod() + Class.getStrSave();
    }

    public int getDexSave() {
        return Race.getDexMod() + Class.getDexSave();
    }

    public int getConSave() {
        return Race.getConMod() + Class.getConSave();
    }

    public int getIntSave() {
        return Race.getIntMod() + Class.getIntSave();
    }

    public int getWisSave() {
        return Race.getWisMod() + Class.getWisSave();
    }

    public int getChaSave() {
        return Race.getChaMod() + Class.getChaSave();
    }

    public int getInitiative() {
        return Initiative;
    }

    public String SpellTime() {
        if (Class.getNumCantrips() == 0)
            return "";
        else
            return "\n\n---------------SPELLS---------------" +
                    "\nCANTRIPS: " + Class.getNumCantrips() + "\t\tSPELLS: " + Class.getNumSpells() + "\t\tSPELL SLOTS LV1: " + Class.getNumSlots();
    }

    public int getHitPoints() {
        return Race.getConMod() + Class.getHitPoints();
    }

    public String toString() {
        return "\n\n------------------------------CHARACTER SHEET AT LEVEL 1------------------------------" +
                "\nNAME: " + Race.getName() + "\t\tRACE: " + Race.getRace() + "\t\tCLASS: " + Class.getClassGame() + "\t\tHP: " + getHitPoints() +
                "\nRACIAL TRAITS: " + Race.getRacialTraits() + "\t\tCLASS FEATURES: " + Class.getFeatures() +
                "\nLANGUAGES: " + Race.getLanguages() +
                "\n\n---------------GENERAL STATS---------------" +
                "\nARMOR CLASS: " + Class.getAC(Race) + "\t\tINITIATIVE: " + getInitiative() + "\t\tSPEED: " + Race.getSpeed() +
                "\nPASSIVE PERCEPTION: " + Race.getPassivePerception() + "\t\tPROFICIENCY BONUS: " + Class.getProfBonus() + "\t\tHIT DICE: " + Class.getHitDice() +
                "\n\n---------------RAW BASE STATS---------------" +
                "\nSTR: " + Race.getStr() + "\t\tDEX: " + Race.getDex() + "\t\tCON: " + Race.getCon() + "\t\tINT: " + Race.getInt() + "\t\tWIS: " + Race.getWis() + "\t\tCHA: " + Race.getCha() +
                "\n\n---------------ABILITY MODIFIERS---------------" +
                "\nSTR: " + Race.getStrMod() + "\t\tDEX: " + Race.getDexMod() + "\t\tCON: " + Race.getConMod() + "\t\tINT: " + Race.getIntMod() + "\t\tWIS: " + Race.getWisMod() + "\t\tCHA: " + Race.getChaMod() +
                "\n\n---------------SAVING THROWS---------------" +
                "\nSTR: " + getStrSave() + "\t\tDEX: " + getDexSave() + "\t\tCON: " + getConSave() + "\t\tINT: " + getIntSave() + "\t\tWIS: " + getWisSave() + "\t\tCHA: " + getChaSave() +
                "\n\n---------------SKILLS---------------" +
                "\nAcrobatics: " + this.Acrobatics + "\t\t\tMedicine: " + this.Medicine +
                "\nAnimal Handling: " + this.AnimalHandling + "\t\tNature: " + this.Nature +
                "\nArcana: " + this.Arcana + "\t\t\t\tPerception: " + this.Perception +
                "\nAthletics: " + this.Athletics + "\t\t\tPerformance: " + this.Performance +
                "\nDeception: " + this.Deception + "\t\t\tPersuasion: " + this.Persuasion +
                "\nHistory: " + this.History + "\t\t\t\tReligion: " + this.Religion +
                "\nInsight: " + this.Insight + "\t\t\t\tSleight Of Hand: " + this.SleightOfHand +
                "\nIntimidation: " + this.Intimidation + "\t\t\tStealth: " + this.Stealth +
                "\nInvestigation: " + this.Investigation + "\t\tSurvival: " + this.Survival +
                "\nSKILL PROFICIENCIES FROM CLASS: " + Class.getSkillProf() +
                "\n\n---------------INVENTORY---------------" +
                "\nWEAPON(S): " + Class.getWeapons() +
                "\nARMOR: " + Class.getArmor() +
                "\nITEM(S): " + Class.getItems()
                + SpellTime();
    }
}

