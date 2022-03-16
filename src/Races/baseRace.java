package Races;



public class baseRace {
    private String Name;
    private String Race;
    private String Languages;
    private String RacialTraits;
    private int Speed;
    private int PassivePerception;
    private int Str;
    private int Dex;
    private int Con;
    private int Int;
    private int Wis;
    private int Cha;






    public baseRace(String Name, int Str, int Dex, int Con, int Int, int Wis, int Cha){
        setName(Name);
        setStr(Str);
        setDex(Dex);
        setCon(Con);
        setInt(Int);
        setWis(Wis);
        setCha(Cha);
        setPassivePerception();
    }

    public void setLanguages(String languages) {
        Languages = languages;
    }

    public void setRace(String race) {
        Race = race;
    }

    public void setPassivePerception() {
        PassivePerception = 10+getWisMod();
    }

    public void setName(String name) {
        Name = name;
    }

    public void setWis(int wis) {
        Wis = wis;
    }

    public void setStr(int str) {
        Str = str;
    }

    public void setInt(int anInt) {
        Int = anInt;
    }

    public void setDex(int dex) {
        Dex = dex;
    }

    public void setCha(int cha) {
        Cha = cha;
    }

    public void setCon(int con) {
        Con = con;
    }

    public void setRacialTraits(String racialTraits) {
        RacialTraits = racialTraits;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getPassivePerception() {
        return PassivePerception;
    }

    public int getWis() {
        return Wis;
    }

    public int getStr() {
        return Str;
    }

    public int getInt() {
        return Int;
    }

    public int getDex() {
        return Dex;
    }

    public int getCha() {
        return Cha;
    }

    public int getCon() {
        return Con;
    }

    public String getName() {
        return Name;
    }

    public String getLanguages() {
        return Languages;
    }

    public int getSpeed() {
        return Speed;
    }

    public String getRace() {
        return Race;
    }

    public String getRacialTraits() {
        return RacialTraits;
    }

    public int getStrMod(){
        return (Str-10)/2;
    }
    public int getDexMod(){
        return (Dex-10)/2;
    }
    public int getConMod(){
        return (Con-10)/2;
    }
    public int getIntMod(){
        return (Int-10)/2;
    }
    public int getWisMod(){
        return (Wis-10)/2;
    }
    public int getChaMod(){
        return (Cha-10)/2;
    }

    public String toString() {
        return "CHARACTER NAME: "+getName()+
                "\n--------------BASE STATS--------------"+
                "\nSTRENGTH: "+getStr()+"\tDEXTERITY: "+getDex()+"\tCONSTITUTION: "+getCon()+"\tINTELLIGENCE: "+getInt()+"\tWISDOM: "+getWis()+"\tCHARISMA: "+getCha()+
                "\n--------------ABILITY MODIFIERS--------------"+
                "\nSTRENGTH: "+getStrMod()+"\t\tDEXTERITY: "+getDexMod()+"\t\tCONSTITUTION: "+getConMod()+"\t\tINTELLIGENCE: "+getIntMod()+"\t\tWISDOM: "+getWisMod()+"\t\tCHARISMA: "+getChaMod();
    }
}
