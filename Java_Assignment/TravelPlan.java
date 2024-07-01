/* Q5. Define a class travelplan with following descriptions:
Private members(plancode long, place char array, number_of_travellers integer, number_of_buses integer)
Public members
i) A constructor to assign initial values of plancoder as 1001, place as Agra, numberoftravellers as 5,
number_of_buses as 1. ii) A function newplant() which allows user to enter the plancode, plan and
number_of_travellers. Also assign the value of number_of_buses as per the following conditions
(number_of_travellers <20, >=20 and <40, >=40 numberofbuses 1,2,3 simultaneously). iii) A function
showplan() to display the content of all data members on the screen) */

import java.util.Scanner;

public class TravelPlan {
    private long planCode;
    private char[] place;
    private int numberOfTravellers;
    private int numberOfBuses;

    public TravelPlan() {
        this.planCode = 1001;
        this.place = "Agra".toCharArray();
        this.numberOfTravellers = 5;
        this.numberOfBuses = 1;
    }

    public void newPlan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter plan code: ");
        planCode = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter place: ");
        String placeInput = scanner.nextLine();
        place = placeInput.toCharArray();
        System.out.println("Enter number of travellers: ");
        numberOfTravellers = scanner.nextInt();
        if (numberOfTravellers < 20) {
            numberOfBuses = 1;
        } else if (numberOfTravellers >= 20 && numberOfTravellers < 40) {
            numberOfBuses = 2;
        } else if (numberOfTravellers >= 40) {
            numberOfBuses = 3;
        }
    }

    public void showPlan() {
        System.out.println("Plan Code: " + planCode);
        System.out.println("Place: " + new String(place));
        System.out.println("Number of Travellers: " + numberOfTravellers);
        System.out.println("Number of Buses: " + numberOfBuses);
    }

    public static void main(String[] args) {
        TravelPlan travelPlan = new TravelPlan();
        travelPlan.showPlan();
        System.out.println();
        travelPlan.newPlan();
        travelPlan.showPlan();
    }
}
