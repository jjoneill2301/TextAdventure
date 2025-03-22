import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class GasStation {
    private static boolean gasStationCompletion = false;
    public static boolean getWinState() {
        return gasStationCompletion;
    }
    public void setWinState(boolean gasCompletion) {
        gasStationCompletion = gasCompletion;
    }

    public void g1note() {

    }

    public void g1() {
        Scanner scan = new Scanner(in);
        out.println("""
                  The truck's brakes squeak as it comes to a halt. You leave the vehicle running, not knowing whether
                  or not the gas station is going to be safe. From the looks of it the station has not seen any foot-
                  traffic in quite some time. You enter the station with your eyes peeled for anything useful.
                  
                  A note is taped to the employee side of the cash register. Do you read it? (y/n)
                  """);
        String choice = scan.nextLine().toLowerCase();
        switch (choice) {
            case "y" -> g1note();
            case "n" -> out.println("You leave the note taped to the register and move on.");
            default ->   Main.deathMessage();
        }
    }

    private void g2() {

    }
    private void g3() {

    }
    private void g4() {

    }
    private void g5() {

    }
}
