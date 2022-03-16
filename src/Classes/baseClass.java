package Classes;

import Races.baseRace;

public interface baseClass {

    String getWeapons();
    String getSkillProf();
    String getFeatures();
    String getHitDice();
    String getClassGame();
    String getItems();
    String getArmor();
    int getHitPoints();
    int getNumCantrips();
    int getNumSpells();
    int getNumSlots();
    int getStrSave();
    int getDexSave();
    int getConSave();
    int getIntSave();
    int getWisSave();
    int getChaSave();
    int getAC(baseRace Race);
    int getProfBonus();


}
