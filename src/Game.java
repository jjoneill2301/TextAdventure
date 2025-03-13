import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.System.in;

// ASCII art supplemented by ChatGPT
public class Game {

    private final int r1Code = (int)(Math.random()*10);
    // Starts at 1 instead because 0th month won't make sense
    private final int r2Code = 1 + (int)(Math.random()*9);
    // .33 and below 0, .66 and below 4 else 8 for tiling
    private final double r3Code = Math.random();
    private final int r4Code = (int)(Math.random()*10);
    private final int r5Code = (int)(Math.random()*10);

    private String codeString;
    public void PadlockCode() {
        codeString = String.valueOf(r1Code + r2Code + r3Code + r4Code + r5Code);
    }

    private String r2Month = "";
    public void setR2Month(String r2Month) {
        this.r2Month = r2Month;
    }

    public void printR1Code() {
        out.printf("""
                Almost every single word in the book is scribbled out in dark marker. The only thing left legible
                is the on and off occurrence of the number %d. Perhaps this is of some importance?
                """, r1Code);
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
        out.printf("""
                The calendar is for the year of 19%d%d. The month is flipped to %s and each date has been crossed off
                except for any dates that happen to include the number %d.
                """, r2Code, r2Code, r2Month, r2Code);
    }


    public void printR3Code() {
        if (r3Code <= 0.33) {
            out.println("""
                    Upon closer inspection, you see it isn't tiling at all! It is the number 0 written over and over in
                    a dotted pattern! Creepy... Who would have done all of that?""");
        } else if (r3Code <= 0.66) {
            out.println("""
                    Upon closer inspection, you see it isn't tiling at all! It is the number 4 written over and over in
                    a grid-like pattern! Creepy... Who would have done all of that?""");
        } else {
            out.println("""
                    Upon closer inspection, you see it isn't tiling at all! It is the number 8 written over and over in
                    a looping pattern! Creepy... Who would have done all of that?""");
        }

    }

    public void printR4Code() {
        out.printf("""
                    You see a note in the breast pocket of the jacket. 'I left the lock-box under the bed unlocked for you,
                    I know you have the spare keys so if you could put them back when you're done that would be great. Love you.'
                    You walk over to the bed and look underneath. Sure enough there lies a lock-box, unlocked. Inside
                    is a collection of wedding photos and a deck of 52 cards, or rather 52 cards that are all %d of
                    clubs. Whoever that note was for must have read it because just like the note instructed a spare
                    key has been left behind. <Key Acquired>
                    """, r4Code);
    }

    public void printR5Code() {
        out.printf("Upon closer inspection, each shoebox is unique in the shoe it contains, but each shoe is a size %d. Who is buying all of these?!", r5Code);
    }

    public static void deathMessage() {
        out.print("""
                  _____                         ____                \s
                 / ____|                       / __ \\               \s
                | |  __  __ _ _ __ ___   ___  | |  | |_   _____ _ __\s
                | | |_ |/ _` | '_ ` _ \\ / _ \\ | |  | \\ \\ / / _ \\ '__|
                | |__| | (_| | | | | | |  __/ | |__| |\\ V /  __/ |  \s
                 \\_____|\\__,_|_| |_| |_|\\___|  \\____/  \\_/ \\___|_|  \s
                """);
        out.println("Your inability to pick one of the options has caused you to die of boredom!");
        out.println("Start over to try again!");
        exit(0);
    }
    public static void startMessage(int roomNumber) {
        out.println("Start in room " + roomNumber + " (Press " + roomNumber + ")");
    }
    public static void goToMessage(int roomNumber) {
        out.println("Start in room " + roomNumber + " (Press " + roomNumber + ")");
    }

    public void cardArt() {
        switch (r4Code) {
            case 1 -> out.println("""
                      .------------.
                      | A          |
                      |            |
                      |     ♣      |  <-- Ace of Clubs
                      |            |
                      |          A |
                      '------------'
                    """);
            case 2 -> out.println("""
                      .------------.
                      | 2          |
                      |            |
                      |  ♣      ♣  |  <-- 2 of Clubs
                      |            |
                      |          2 |
                      '------------'
                    """);
            case 3 -> out.println("""
                      .------------.
                      | A          |
                      |    ♣       |
                      |     ♣      |  <-- Three of Clubs
                      |      ♣     |
                      |          A |
                      '------------'
                      """);
            case 4 -> out.println("""
                      .------------.
                      | 4          |
                      |  ♣      ♣  |
                      |            |  <-- 4 of Clubs
                      |  ♣      ♣  |
                      |          4 |
                      '------------'
                    """);
            case 5 -> out.println("""
                      .------------.
                      | 5          |
                      |  ♣      ♣  |
                      |     ♣      |  <-- 5 of Clubs
                      |  ♣      ♣  |
                      |          5 |
                      '------------'
                    """);
            case 6 -> out.println("""
                      .------------.
                      | 6          |
                      |  ♣      ♣  |
                      |  ♣      ♣  |  <-- 6 of Clubs
                      |  ♣      ♣  |
                      |          6 |
                      '------------'
                    """);
            case 7 -> out.println("""
                      .------------.
                      | 7          |
                      |  ♣      ♣  |
                      |  ♣  ♣   ♣  |  <-- 7 of Clubs
                      |  ♣      ♣  |
                      |          7 |
                      '------------'
                    """);
            case 8 -> out.println("""
                      .------------.
                      | 8          |
                      |  ♣      ♣  |
                      |  ♣      ♣  |  <-- 8 of Clubs
                      |  ♣      ♣  |
                      |  ♣      ♣  |
                      |          8 |
                      '------------'
                    """);
            case 9 -> out.println("""
                      .------------.
                      | 9          |
                      |  ♣  ♣   ♣   |
                      |  ♣      ♣  |  <-- 9 of Clubs
                      |  ♣   ♣  ♣   |
                      |          9 |
                      '------------'
                    """);
        }
    }
    public void r1() {
        Scanner scan = new Scanner(in);
        out.println("""
                  You enter room one. It looks like it used to be a study. It is dusty and there are a number of books
                  arranged on the shelves. Each book is meticulously placed, however there is one particular book
                  protruding from the dusty old bookshelf. Do you pick it up? (y/n)""");
        String choice = scan.nextLine().toLowerCase();
        switch (choice) {
            case "y" ->
                    printR1Code();
            case "n" ->
                    out.println("You leave the book be, but something tells you it may be important! Maybe you should revisit here?");
            default -> deathMessage();
        }

        out.println("There are two connecting rooms to room one.");
        out.println("Room two appears to be an old kitchen, while room three is a bathroom.");
        goToMessage(2);
        goToMessage(3);

        choice = scan.nextLine();
        switch (choice) {
            case "2" -> r2();
            case "3" -> r3();
            default -> deathMessage();
        }
    }

    public void r2() {
        Scanner scan = new Scanner(in);
        out.println("""
                You enter room two. It looks like it used to be a kitchen. Grime coats the stove and the air is filled
                with dust. The window above the sink has wooden boards nailed on which lets in rays of light that pierce
                through the dusty old air and land on the decrepit floor. A calendar is stuck on the fridge, do you investigate? (y/n)""");
        String choice = scan.nextLine().toLowerCase();

        switch (choice) {
            case "y" -> printR2Code();
            case "n" -> out.println("""
                    What good is a calendar going to do you? Besides it's not like you can go anywhere and neither can that calendar.
                    You can always look at it later if you decide to come back.""");
            default -> deathMessage();
        }

        out.println("There are two connecting rooms to room two. Room one appears to be an old library, while room four is a bedroom.");
        out.println("Go to room 1 (Press 1)");
        out.println("Go to room 4 (Press 4)");
        choice = scan.nextLine();
        switch (choice) {
            case "1" -> r1();
            case "4" -> r4();
            default -> deathMessage();
        }
    }

    public void r3() {
        Scanner scan = new Scanner(in);
        out.println("""
                You enter room three. It is by far the strangest bathroom you have been in, considering it has three doors.
                You really don't want to be in here any longer than required. The mirror is cracked as well as the floor tiling.
                The bath tiling however is not cracked. Do you choose to investigate? (y/n)""");
        String choice = scan.nextLine().toLowerCase();
        switch (choice) {
            case "y" -> printR3Code();
            case "n" ->
                    out.println("No way are you climbing into that! You have to admit though the wall looked strange. It was the only thing that stands out in this room besides the three door mystery. You don't know why you would, but you can always come back if you are out of ideas.");
            default -> deathMessage();
        }
        out.println("There are three rooms connected to room three. Room one seems to be an old library. Room four looks like an old bedroom, and room five is a mudroom/coatroom.");
        out.println("Go to room 1 (Press 1)");
        out.println("Go to room 4 (Press 4)");
        out.println("Go to room 5 (Press 5)");
        choice = scan.nextLine();
        switch (choice) {
            case "1" -> r1();
            case "4" -> r4();
            case "5" -> r5();
            default -> deathMessage();
        }


    }

    public void r4() {
        Scanner scan = new Scanner(in);
        out.println("""
                You enter the bedroom at room four. The blinds are drawn and the once white walls now are stained a mildewy yellow.
                Two things immediately stick out to you. The closet is completely empty spare for a single leather coat.
                The second thing you notice is the way the floorboards creak with each step you take.
                Do you want to check out the coat in the closet? (y/n)""");
        String choice = scan.nextLine().toLowerCase();
        switch (choice) {
            case "y" -> {
                printR4Code();
                cardArt();
            }
            case "n" -> out.println("""
                    You aren't gonna touch that dusty old coat! But something at the back of your mind tells you it may
                    have led to secrets. Maybe you will have to revisit this room later.""");
            default -> deathMessage();
        }


        out.println("There are two connecting rooms to room four. Room two appears to be the kitchen, while room three is the bathroom.");
        out.println("Go to room 2 (Press 2)");
        out.println("Go to room 3 (Press 3)");
        choice = scan.nextLine();
        switch (choice) {
            case "2" -> r2();
            case "3" -> r3();
            default -> deathMessage();
        }
    }

    public void r5() {
        Scanner scan = new Scanner(in);
        out.println("""
                You enter room five. Considering its purpose as a mudroom, a large amount of shoes would not typically surprise you.
                What is surprising is that every shoe here has been kept in its shoebox, unopened. Do you want to look closer? (y/n)""");
        String choice = scan.nextLine().toLowerCase();
        switch (choice) {
            case "y" -> printR5Code();
            case "n" -> out.println("""
                    Maybe if there was anywhere to run these shoes would be useful, but this house is full of dead ends.
                    The shoe boxes aren't going anywhere, so you can always check back later.""");
            default -> deathMessage();
        }

        out.println("There are two connecting rooms to room five. Room three appears to be the bathroom, while the other door is padlocked.");
        out.println("Go to room 3 (Press 3)");
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
                    
                    Enter code:""");
            choice = scan.nextLine();
            PadlockCode();
            if (choice.equals(codeString)) {
                r6();
            } else {
                out.println("Hmm, that didn't work. You should retrace your steps and try again.");
                r3();
            }
        } else {
            deathMessage();
        }

    }

    public static void r6() {
        out.println("Holy crap, it worked! You got out of that crazy place. You are now in room six, which is a garage. There is an old truck with a jerry can in the back. You don't know where you are or where you are going, but you're just happy to get out of that place!");
        out.println("You win!!!");
        exit(0);
    }
}
