import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.System.in;

// ASCII art supplemented by ChatGPT
public class House {
    private static boolean houseCompletion = false;

    public static boolean getWinState() {
        return houseCompletion;
    }

    public void setWinState(boolean houseCompletion) {
        House.houseCompletion = houseCompletion;
    }
    private final int r1Code = (int)(Math.random()*10);
    // Starts at 1 instead because 0th month won't make sense
    private final int r2Code = 1 + (int)(Math.random()*9);
    // <= .5 code 0 else code 8
    private final double r3Code = Math.random();
    private final int r4Code = (int)(Math.random()*10);
    private final int r5Code = (int)(Math.random()*10);

    private final static String y = "\u001B[33m";
    private final static String c = "\u001B[0m";

    private String codeString;
    public void PadlockCode() {
        int tile;
        if (r3Code <= 0.5) { tile = 0; } else { tile = 8; }
        codeString = "" + r1Code + r2Code + tile + r4Code + r5Code;
    }

    private String r2Month = "";
    public void setR2Month(String r2Month) {
        this.r2Month = r2Month;
    }

    public void printR1Code() {
        out.printf("""
                Almost every single word in the book is scribbled out in dark marker. The only thing left legible
                is the on and off occurrence of the number %s%d%s. Perhaps this is of some importance?
                """, y, r1Code, c);
    }

    public void printR2Code() {

        switch (r2Code) {
            case 1 -> setR2Month("January");
            case 2 -> setR2Month("February");
            case 3 -> setR2Month("March");
            case 4 -> setR2Month("April");
            case 5 -> setR2Month("May");
            case 6 -> setR2Month("June");
            case 7 -> setR2Month("July");
            case 8 -> setR2Month("August");
            case 9 -> setR2Month("September");
        }
        out.printf("The calendar is for the year of 19%s%d%d%s. The month is flipped to %s%s%s\n"
                ,y ,r2Code, r2Code, c, y, r2Month, c);
    }

    public void printR3Code() {
        if (r3Code <= 0.5) {
            out.printf("""
                    Upon closer inspection, you see it isn't tiling at all! It is the number %s0%s written over and over in
                    a dotted pattern! Creepy... Who would have done all of that?
                      00000000000000
                      00000000000000
                      00000000000000
                      00000000000000
                      00000000000000
                      00000000000000
                      00000000000000
                    """, y, c);
        } else {
            out.printf("""
                    Upon closer inspection, you see it isn't tiling at all! It is the number %s8%s written over and over in
                    a looping pattern! Creepy... Who would have done all of that?
                      88888888888888
                      88888888888888
                      88888888888888
                      88888888888888
                      88888888888888
                      88888888888888
                      88888888888888
                      88888888888888
                    """, y, c);
        }

    }

    public void printR4Code() {
        out.printf("""
                    You see a note in the breast pocket of the jacket. 'I left the lock-box under the bed unlocked for you,
                    I know you have the spare keys so if you could put them back when you're done that would be great. Love you.'
                    You walk over to the bed and look underneath. Sure enough there lies a lock-box, unlocked. Inside
                    is a collection of wedding photos and a deck of 52 cards, or rather 52 cards that are all %s%d%s of
                    clubs. Whoever that note was for must have read it because just like the note instructed a spare
                    key has been left behind. <Key Acquired>
                    """, y, r4Code, c);
    }

    public void printR5Code() {
        out.printf("Upon closer inspection, each shoebox is unique in the shoe it contains, but each shoe is a size %s%d%s.", y, r5Code, c);
        out.println("Who is buying all of these?!");
    }

    public static void goToMessage(int rNum) {
        out.printf("Go to Room %s%d%s (Press %s%d%s)\n", y, rNum, c, y, rNum, c);
    }

    public void cardArt() {
        switch (r4Code) {
            case 1 -> out.println("""
                      .------------.
                      | A          |
                      |            |
                      |     ♣      |
                      |            |
                      |          A |
                      '------------'
                    """);
            case 2 -> out.println("""
                      .------------.
                      | 2          |
                      |            |
                      |  ♣      ♣  |
                      |            |
                      |          2 |
                      '------------'
                    """);
            case 3 -> out.println("""
                      .------------.
                      | 3          |
                      |    ♣       |
                      |     ♣      |
                      |      ♣     |
                      |          3 |
                      '------------'
                    """);
            case 4 -> out.println("""
                      .------------.
                      | 4          |
                      |  ♣      ♣  |
                      |            |
                      |  ♣      ♣  |
                      |          4 |
                      '------------'
                    """);
            case 5 -> out.println("""
                      .------------.
                      | 5          |
                      |  ♣      ♣  |
                      |     ♣      |
                      |  ♣      ♣  |
                      |          5 |
                      '------------'
                    """);
            case 6 -> out.println("""
                      .------------.
                      | 6          |
                      |  ♣      ♣  |
                      |  ♣      ♣  |
                      |  ♣      ♣  |
                      |          6 |
                      '------------'
                    """);
            case 7 -> out.println("""
                      .------------.
                      | 7          |
                      |  ♣      ♣  |
                      |  ♣  ♣   ♣  |
                      |  ♣      ♣  |
                      |          7 |
                      '------------'
                    """);
            case 8 -> out.println("""
                      .------------.
                      | 8          |
                      |  ♣      ♣  |
                      |  ♣      ♣  |
                      |  ♣      ♣  |
                      |  ♣      ♣  |
                      |          8 |
                      '------------'
                    """);
            case 9 -> out.println("""
                      .------------.
                      | 9          |
                      |  ♣  ♣   ♣  |
                      |  ♣      ♣  |
                      |  ♣   ♣  ♣  |
                      |          9 |
                      '------------'
                    """);
        }
    }
    public void r1() {
        Scanner scan = new Scanner(in);
        out.printf("""
                  You enter room one. It looks like it used to be a study. It is dusty and there are a number of books
                  arranged on the shelves. Each book is meticulously placed, however there is one particular book
                  protruding from the dusty old bookshelf. Do you pick it up? %s(y/n)%s\t""", y, c);
        String choice = scan.nextLine().toLowerCase();
        switch (choice) {
            case "y" -> printR1Code();
            case "n" -> out.println("You leave the book be, but something tells you that you should revisit it later.");
            default -> Main.deathMessage();
        }

        out.println("There are two connecting rooms to room one.");
        out.println("Room two appears to be an old kitchen, while room three is a bathroom.");
        goToMessage(2);
        goToMessage(3);

        choice = scan.nextLine();
        switch (choice) {
            case "2" -> r2();
            case "3" -> r3();
//            default -> Main.deathMessage();
        }
    }

    public void r2() {
        Scanner scan = new Scanner(in);
        out.printf("""
                You enter room two. It looks like it used to be a kitchen. Grime coats the stove and the air is filled
                with dust. The window above the sink has wooden boards nailed on which lets in rays of light that pierce
                through the dusty old air and land on the decrepit floor. A calendar is stuck on the fridge, do you investigate? %s(y/n)%s\t""", y, c);
        String choice = scan.nextLine().toLowerCase();

        switch (choice) {
            case "y" -> printR2Code();
            case "n" -> out.println("""
                    What good is a calendar going to do you? Besides it's not like you can go anywhere and neither can that calendar.
                    You can always look at it later if you decide to come back.""");
            default -> Main.deathMessage();
        }

        out.println("There are two connecting rooms to room two. Room one appears to be an old library, while room four is a bedroom.");
        goToMessage(1);
        goToMessage(4);
        choice = scan.nextLine();
        switch (choice) {
            case "1" -> r1();
            case "4" -> r4();
            default -> Main.deathMessage();
        }
    }

    public void r3() {
        Scanner scan = new Scanner(in);
        out.printf("""
                You enter room three. It is by far the strangest bathroom you have been in, considering it has three doors.
                You really don't want to be in here any longer than required. The mirror is cracked as well as the floor tiling.
                The bath tiling however is not cracked. Do you choose to investigate? %s(y/n)%s\t""", y, c);
        String choice = scan.nextLine().toLowerCase();
        switch (choice) {
            case "y" -> printR3Code();
            case "n" ->
                    out.println("No way are you climbing into that! You have to admit though the wall looked strange. It was the only thing that stands out in this room besides the three door mystery. You don't know why you would, but you can always come back if you are out of ideas.");
            default -> Main.deathMessage();
        }
        out.println("There are three rooms connected to room three. Room one seems to be an old library. Room four looks like an old bedroom, and room five is a mudroom/coatroom.");
        goToMessage(1);
        goToMessage(4);
        goToMessage(5);
        choice = scan.nextLine();
        switch (choice) {
            case "1" -> r1();
            case "4" -> r4();
            case "5" -> r5();
            default -> Main.deathMessage();
        }


    }

    public void r4() {
        Scanner scan = new Scanner(in);
        out.printf("""
                You enter the bedroom at room four. The blinds are drawn and the once white walls now are stained a mildewy yellow.
                Two things immediately stick out to you. The closet is completely empty spare for a single leather coat.
                The second thing you notice is the way the floorboards creak with each step you take.
                Do you want to check out the coat in the closet? %s(y/n)%s\t""", y, c);
        String choice = scan.nextLine().toLowerCase();
        switch (choice) {
            case "y" -> {
                printR4Code();
                cardArt();
            }
            case "n" -> out.println("""
                    You aren't gonna touch that dusty old coat! But something at the back of your mind tells you it may
                    have led to secrets. Maybe you will have to revisit this room later.""");
            default -> Main.deathMessage();
        }


        out.println("There are two connecting rooms to room four. Room two appears to be the kitchen, while room three is the bathroom.");
        goToMessage(2);
        goToMessage(3);
        choice = scan.nextLine();
        switch (choice) {
            case "2" -> r2();
            case "3" -> r3();
            default -> Main.deathMessage();
        }
    }

    public void r5() {
        Scanner scan = new Scanner(in);
        out.printf("""
                You enter room five. Considering its purpose as a mudroom, a large amount of shoes would not typically surprise you.
                What is surprising is that every shoe here has been kept in its shoebox, unopened. Do you want to look closer? %s(y/n)%s\t""", y, c);
        String choice = scan.nextLine().toLowerCase();
        switch (choice) {
            case "y" -> printR5Code();
            case "n" -> out.println("""
                    Maybe if there was anywhere to run these shoes would be useful, but this house is full of dead ends.
                    The shoe boxes aren't going anywhere, so you can always check back later.""");
            default -> Main.deathMessage();
        }

        out.println("There are two connecting rooms to room five. Room three appears to be the bathroom, while the other door is padlocked.");
        goToMessage(3);
        out.println("Look at padlock (Press 6)");
        choice = scan.nextLine();
        if (choice.equals("3")) {
            r3();
        } else if (choice.equals("6")) {
            out.println("""
                    Room six has a locked door, it has to be the exit!
                    Using all of the clues found in each room, you should be able to figure out the right code!
                    Now that you think about it, there were 5 clues in total, each of which can be found in rooms numbered 1-5 on the door.
                    Try using the number found in room one's clue in the first digit of the code, the second clue in the second digit, etc.
                    
                    Enter code:\t""");
            choice = scan.nextLine();
            PadlockCode();
            if (choice.equals(codeString)) {
                r6();
            } else {
                out.println("Hmm, that didn't work. You should retrace your steps and try again.");
                r3();
            }
        } else { Main.deathMessage(); }
    }

    private void r6() {
        setWinState(true);
        out.println("""
                It worked! You are one step closer to getting out of this dilapidated house. You are now in room six, which is a garage.
                There's an old truck with a jerry can in the back. The can is empty but the truck started and hopefully has enough gas
                to take you somewhere other than here.
                """);
    }
}
