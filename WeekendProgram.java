package weekendprogram;

import java.util.Scanner;

public class WeekendProgram {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {

            Scanner input = new Scanner(System.in);
            System.out.print("Tell me your name: ");
            String name = input.next();
            System.out.print("Tell me your age: ");
            int age = input.nextInt();
            System.out.print("Tell me your favorite day: ");
            String day = input.next();
            printDayPreference(day);

            //if (day.equalsIgnoreCase("Monday")){
            //}
        }
    }

    public static void printDayPreference(String day) {

        switch (day.trim().toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("You like casual days!");
                break;
            case "saturday":
            case "sunday":
                System.out.println("You like weekends!");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}
