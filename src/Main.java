import java.util.Scanner;
import static java.lang.System.*;

public class Main {

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
    public static void main(String[] args) {

        Scanner scan = new Scanner(in);
        House house = new House();
        GasStation gas = new GasStation();

        out.println("You woke up in a house with seemingly no exits!\nUse your wits to escape from this place!");
        for (int i = 1; i <= 6; i++) {
            House.goToMessage(i);
        }
        out.println("When asked a question, entering an option not provided by the game will cause a mysterious ghost to make you die of boredom!");

        String choice = scan.nextLine();

        switch (choice) {
            case "1" -> house.r1();
            case "2" -> house.r2();
            case "3" -> house.r3();
            case "4" -> house.r4();
            case "5" -> house.r5();
            case "6" ->
                    out.println("This room is locked. The exit must be this way. You will have to start with one of the other doors for now.");
            default -> out.println("Enter a number on your keyboard to enter the corresponding room.");
        }
        if (House.getWinState()) {
            gas.g1();
        }
    }
}
