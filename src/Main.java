import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        Game g = new Game(); // This prevents the clue randomizers from changing when you re-enter a room!
        out.println("You woke up in a house with seemingly no exits!\nUse your wits to escape from this place!");
        for (int i = 1; i <= 6; i++) {
            Game.startMessage(i);
        }
        out.println("When asked a question, entering an option not provided by the game will cause a mysterious ghost to make you die of boredom!");

        String choice = scan.nextLine();
        out.println("""
                      .------------.
                      | A          |
                      |            |
                      |     ♣      |  <-- Ace of Clubs
                      |            |
                      |          A |
                      '------------'
                    """);
        out.println("""
                      .------------.
                      | 2          |
                      |            |
                      |  ♣      ♣  |  <-- 2 of Clubs
                      |            |
                      |          2 |
                      '------------'
                    """);
        out.println("""
                      .------------.
                      | 3          |
                      |    ♣       |
                      |     ♣      |  <-- 3 of Clubs
                      |      ♣     |
                      |          3 |
                      '------------'
                   """);
        out.println("""
                      .------------.
                      | 4          |
                      |  ♣      ♣  |
                      |            |  <-- 4 of Clubs
                      |  ♣      ♣  |
                      |          4 |
                      '------------'
                    """);
        out.println("""
                      .------------.
                      | 5          |
                      |  ♣      ♣  |
                      |     ♣      |  <-- 5 of Clubs
                      |  ♣      ♣  |
                      |          5 |
                      '------------'
                    """);
        out.println("""
                      .------------.
                      | 6          |
                      |  ♣      ♣  |
                      |  ♣      ♣  |  <-- 6 of Clubs
                      |  ♣      ♣  |
                      |          6 |
                      '------------'
                    """);
        out.println("""
                      .------------.
                      | 7          |
                      |  ♣      ♣  |
                      |  ♣  ♣   ♣  |  <-- 7 of Clubs
                      |  ♣      ♣  |
                      |          7 |
                      '------------'
                    """);
        out.println("""
                      .------------.
                      | 8          |
                      |  ♣      ♣  |
                      |  ♣      ♣  |  <-- 8 of Clubs
                      |  ♣      ♣  |
                      |  ♣      ♣  |
                      |          8 |
                      '------------'
                    """);
        out.println("""
                      .------------.
                      | 9          |
                      |  ♣  ♣   ♣  |
                      |  ♣      ♣  |  <-- 9 of Clubs
                      |  ♣   ♣  ♣  |
                      |          9 |
                      '------------'
                    """);
        switch (choice) {
            case "1" -> g.r1();
            case "2" -> g.r2();
            case "3" -> g.r3();
            case "4" -> g.r4();
            case "5" -> g.r5();
            case "6" ->
                    out.println("This room is locked. The exit must be this way. You will have to start with one of the other doors for now.");
            default -> out.println("Enter a number on your keyboard to enter the corresponding room.");
        }
    }

//    public static void r1() {
//        Scanner scan = new Scanner(in);
//        out.println("You enter room one. It looks like it used to be a study. It is dusty and there are a number of books arranged in the shelves. One pokes out. Do you pick it up? (y/n)");
//        String choice = scan.nextLine().toLowerCase();
//        switch (choice) {
//            case "y" ->
//                    out.println("Every single word in the book is scribbled out in dark marker. Strangely, every occurrence of the number 7 is left in. Perhaps this is of some importance?");
//            case "n" ->
//                    out.println("You leave the book be, but something tells you it may be important! Maybe you should come back for it later?");
//            default -> deathMessage();
//        }
//
//        out.println("There are two connecting rooms to room one. Room two appears to be an old kitchen, while room three is a bathroom.");
//        out.println("Go to room 2 (Press 2)");
//        out.println("Go to room 3 (Press 3)");
//        choice = scan.nextLine();
//        switch (choice) {
//            case "2" -> r2();
//            case "3" -> r3();
//            default -> deathMessage();
//        }
//    }
//
//    public static void r2() {
//        Scanner scan = new Scanner(in);
//        out.println("You enter room two. It looks like it used to be a kitchen. Grime coats the stove and the air is filled with dust. The window above the sink has boards nailed on and casts rays of light across the old and decrepit floor. A calendar is stuck on the fridge, do you investigate? (y/n)");
//        String choice = scan.nextLine().toLowerCase();
//        if (choice.equals("y")) {
//            out.println("The calendar is for the year of 1944. The month it is flipped to is april and each date is scribbled out except for the fourth of April: 4/4/44");
//        } else if (choice.equals("n")) {
//            out.println("What good is a calendar going to do you? Besides it's not like you can go anywhere and neither can that calendar. You can always look at it later if you decide to come back.");
//        } else {
//            deathMessage();
//        }
//        out.println("Maybe you will have luck with the boards on the window. They seem nailed on pretty tight but judging by how untouched everything seems you may have some luck. Do you want to try pulling the boards off the window? (y/n)");
//        choice = scan.nextLine().toLowerCase();
//        if (choice.equals("y")) {
//            out.println("You climb on the sink and get to work. The boards don't even buckle. It seems like you are going to have to find another solution.");
//        } else if (choice.equals("n")) {
//            out.println("You save yourself the splinters and continue onward.");
//        } else {
//            deathMessage();
//        }
//
//        out.println("There are two connecting rooms to room two. Room one appears to be an old library, while room four is a bedroom.");
//        out.println("Go to room 1 (Press 1)");
//        out.println("Go to room 4 (Press 4)");
//        choice = scan.nextLine();
//        if (choice.equals("1")) {
//            r1();
//        } else if (choice.equals("4")) {
//            r4();
//        } else {
//            deathMessage();
//        }
//    }
//
//    public static void r3() {
//        Scanner scan = new Scanner(in);
//        out.println("You enter room three. It is by far the strangest bathroom you have been in, considering it has three doors. You really don't want to be in here any longer than required. The mirror is cracked as well as the floor tiling. The bath tiling however is not cracked. Do you choose to investigate? (y/n)");
//        String choice = scan.nextLine().toLowerCase();
//        if (choice.equals("y")) {
//            out.println("Upon closer inspection, you see it isn't tiling at all! It is the number 4 written over and over in a grid-like pattern! Creepy... Who would have done all of that?");
//        } else if (choice.equals("n")) {
//            out.println("No way are you climbing into that! You have to admit though the wall looked strange. It was the only thing that stands out in this room besides the three door mystery. You don't know why you would, but you can always come back if you are out of ideas.");
//        } else {
//            deathMessage();
//        }
//        out.println("There are three rooms connected to room three. Room one seems to be an old library. Room four looks like an old bedroom, and room five is a mudroom/coatroom.");
//        out.println("Go to room 1 (Press 1)");
//        out.println("Go to room 4 (Press 4)");
//        out.println("Go to room 5 (Press 5)");
//        choice = scan.nextLine();
//        switch (choice) {
//            case "1" -> r1();
//            case "4" -> r4();
//            case "5" -> r5();
//            default -> deathMessage();
//        }
//
//
//    }
//
//    public static void r4() {
//        Scanner scan = new Scanner(in);
//        out.println("You enter the bedroom at room four. The blinds are drawn and the once white walls now are stained a mildewy yellow. Two things immediately stick out to you. The closet is completely empty spare for a single leather coat. The second thing you notice is the way the floorboards creak with each step you take. Do you want to check out the coat in the closet? (y/n)");
//        String choice = scan.nextLine().toLowerCase();
//        if (choice.equals("y")) {
//            out.println("Upon further inspection you see a note in the breast pocket of the jacket. 'I left the lock-box under the bed unlocked for you, I know you have the spare keys so if you could put them back when you're done that would be great. Love you.'");
//            out.println("You walk over to the bed and look underneath. Sure enough there lies a lock-box, unlocked. Inside is a collection of wedding photos and a deck of 52 cards, or rather 52 cards that are all 7 of clubs. Whoever that note was for surely got the message. <Key Acquired>");
//        } else if (choice.equals("n")) {
//            out.println("You aren't gonna touch that dusty old coat! But something at the back of your mind tells you it may have led to secrets. Maybe you will have to revisit this room later.");
//        }
//
//
//        out.println("There are two connecting rooms to room four. Room two appears to be the kitchen, while room three is the bathroom.");
//        out.println("Go to room 2 (Press 2)");
//        out.println("Go to room 3 (Press 3)");
//        choice = scan.nextLine();
//        switch (choice) {
//            case "2" -> r2();
//            case "3" -> r3();
//            default -> deathMessage();
//        }
//    }
//
//    public static void r5() {
//        Scanner scan = new Scanner(in);
//        out.println("You enter room five. Considering its purpose as a mudroom, a large amount of shoes would not typically surprise you. What is surprising is that every shoe here has been kept in its shoebox, unopened. Do you want to look closer? (y/n)");
//        String choice = scan.nextLine().toLowerCase();
//        if (choice.equals("y")) {
//            out.println("Upon closer inspection, each shoebox is unique in the shoe it contains, but each shoe is a size 1. Who can even wear these?!");
//        } else if (choice.equals("n")) {
//            out.println("Maybe if there was anywhere to run the shoes would be useful, but this house is full of dead ends. The shoe boxes aren't going anywhere, so you can always check back later.");
//        } else {
//            deathMessage();
//        }
//
//        out.println("There are two connecting rooms to room five. Room three appears to be the bathroom, while the other door is padlocked.");
//        out.println("Go to room 3 (Press 3)");
//        out.println("Look at padlock (Press 6)");
//        choice = scan.nextLine();
//        if (choice.equals("3")) {
//            r3();
//        } else if (choice.equals("6")) {
//            out.println("Room six has a locked door, it has to be the exit! Using all of the clues found in each room, you should be able to figure out the right code! Now that you think about it, there were 5 clues in total, each of which in rooms numbered 1-5 on the door. Try using the number found in room one's clue in the first spot of the code, the second clue in the second spot, etc.");
//            out.println("Enter code:");
//            choice = scan.nextLine();
//            if (choice.contains("74471")) {
//                r6();
//            } else {
//                out.println("Hmm, that didn't work. You should retrace your steps and try again.");
//                r3();
//            }
//        } else {
//            deathMessage();
//        }
//
//    }
//
//    public static void r6() {
//        out.println("Holy crap, it worked! You got out of that crazy place. You are now in room six, which is a garage. There is an old truck with a jerry can in the back. You don't know where you are or where you are going, but you're just happy to get out of that place!");
//        out.println("You win!!!");
//        exit(0);
//    }
}
