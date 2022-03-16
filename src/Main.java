import Dice.Dice;
import Races.*;
import Classes.*;
import player.Player;

import javax.swing.*;

public class Main {

    private static baseRace Char;
    private static baseClass JobSign;

    public static void main(String[] args) {
        // write your code here
        Dice dice = new Dice();

        JOptionPane.showMessageDialog(null
                , "Hello, and welcome to the exciting world of Dungeons and Dragons (DnD)!" +
                        "\nIt's time for you to create your character and delve into this magical adventure.");
        int Race = Integer.parseInt(JOptionPane.showInputDialog("Please, first select the race you would like to play as" +
                "\n1. Human" +
                "\n2. Elf" +
                "\n3. Dwarf" +
                "\n4. Aarakocra" +
                "\n5. Dragonborn" +
                "\n6. Tiefling" +
                "\n7. Half Orc"));

        if (Race < 1 || Race > 7)
            throw new IllegalStateException("Unexpected value: " + Race);

        int RanChoice = Integer.parseInt(JOptionPane.showInputDialog("Great choice! Second, would you like to input your" +
                " prerolled character stats yourself, or would you like us to roll them for you?"
                + "\n1. Enter them myself!" +
                "\n2. Roll them for me!"));


        int Str = 0, Dex = 0, Con = 0, Int = 0, Wis = 0, Cha = 0;

        switch (RanChoice) {
            case 1:
                Str = Integer.parseInt(JOptionPane.showInputDialog("Enter value for Strength (between 1 and 16)"));
                if (Str < 1 || Str > 16)
                    throw new IllegalStateException("Unexpected value: " + Str);
                Dex = Integer.parseInt(JOptionPane.showInputDialog("Enter value for Dexterity (between 1 and 16)"));
                if (Dex < 1 || Dex > 16)
                    throw new IllegalStateException("Unexpected value: " + Dex);
                Con = Integer.parseInt(JOptionPane.showInputDialog("Enter value for Constitution (between 1 and 16)"));
                if (Con < 1 || Con > 16)
                    throw new IllegalStateException("Unexpected value: " + Con);
                Int = Integer.parseInt(JOptionPane.showInputDialog("Enter value for Intelligence (between 1 and 16)"));
                if (Int < 1 || Int > 16)
                    throw new IllegalStateException("Unexpected value: " + Int);
                Wis = Integer.parseInt(JOptionPane.showInputDialog("Enter value for Wisdom (be" +
                        "tween 1 and 16)"));
                if (Wis < 1 || Wis > 16)
                    throw new IllegalStateException("Unexpected value: " + Wis);
                Cha = Integer.parseInt(JOptionPane.showInputDialog("Enter value for Charisma (between 1 and 16)"));
                if (Cha < 1 || Cha > 16)
                    throw new IllegalStateException("Unexpected value: " + Cha);
                break;
            case 2:
                int Satisfied = 2;
                while (Satisfied > 1) {
                    Str = dice.Roll4d6DropLowest();
                    Dex = dice.Roll4d6DropLowest();
                    Con = dice.Roll4d6DropLowest();
                    Int = dice.Roll4d6DropLowest();
                    Wis = dice.Roll4d6DropLowest();
                    Cha = dice.Roll4d6DropLowest();
                    JOptionPane.showMessageDialog(null, "Hmmmm... Of course... Well, just so you dont regret it later, press OK to see your base stats.");
                    JOptionPane.showMessageDialog(null, "STR: " + Str +
                            "\nDEX: " + Dex +
                            "\nCON: " + Con +
                            "\nINT: " + Int +
                            "\nWIS: " + Wis +
                            "\nCHA: " + Cha);
                    Satisfied = Integer.parseInt(JOptionPane.showInputDialog("Are you " +
                            "satisfied with these values?" +
                            "\n1. Yes, that looks good!" +
                            "\n2. Yuck! Reroll please!"));
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + RanChoice);
        }

        String Name = JOptionPane.showInputDialog("Well, you seem to be quite the strong fellow, aren't you! Now, let's see what's next..." +
                "\nWhat is your name, brave adventurer?");

        switch (Race) {
            case 1:
                Char = new Human(Name, Str, Dex, Con, Int, Wis, Cha);
                break;
            case 2:
                Char = new Elf(Name, Str, Dex, Con, Int, Wis, Cha);
                break;
            case 3:
                Char = new Dwarf(Name, Str, Dex, Con, Int, Wis, Cha);
                break;
            case 4:
                Char = new Aarakocra(Name, Str, Dex, Con, Int, Wis, Cha);
                break;
            case 5:
                Char = new Dragonborn(Name, Str, Dex, Con, Int, Wis, Cha);
                break;
            case 6:
                Char = new Tiefling(Name, Str, Dex, Con, Int, Wis, Cha);
                break;
            case 7:
                Char = new HalfOrc(Name, Str, Dex, Con, Int, Wis, Cha);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + Race);
        }

        int Class = Integer.parseInt(JOptionPane.showInputDialog("Excellent! Well, brave adventurer, I've but one last question for you." +
                "\nWhat is it exactly that you do?" +
                "\n1. Barbarian" +
                "\n2. Bard" +
                "\n3. Fighter" +
                "\n4. Monk" +
                "\n5. Paladin" +
                "\n6. Ranger" +
                "\n7. Wizard"));

        if (Class < 1 || Class > 7)
            throw new IllegalStateException("Unexpected value: " + Class);

        switch (Class) {
            case 1:
                JobSign = new Barbarian();
                break;
            case 2:
                JobSign = new Bard();
                break;
            case 3:
                JobSign = new Fighter();
                break;
            case 4:
                JobSign = new Monk();
                break;
            case 5:
                JobSign = new Paladin();
                break;
            case 6:
                JobSign = new Ranger();
                break;
            case 7:
                JobSign = new Wizard();
                break;
        }


        Player player = new Player(Char, JobSign);

        JOptionPane.showMessageDialog(null, "Great! I think that's all the information we need." +
                "\nHere's your adventurer card. Take it, and safe travels out there!");

        System.out.println(player);


    }

}
