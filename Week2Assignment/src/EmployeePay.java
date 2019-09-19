
import java.util.Scanner;

public class EmployeePay {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double HOURLY = 15.00, OVERTIME = 22.50;
        double total = 0, regular = 0, over = 0;
        int hours;
        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Enter hours worked for Employee " + (i + 1) + " > ");
                hours = s.nextInt();

                while (hours <= 0 || hours > 70) {
                    System.out.println("Invalid hours entered. Try again.");
                    System.out.print("Enter hours worked for Employee " + (i + 1) + " > ");
                    hours = s.nextInt();
                    if (hours > 0 && hours <= 70) {
                        break;
                    }
                }
                if (hours <= 40) {
                    regular = hours * HOURLY;
                    System.out.format("Regular Pay:$%.2f\n", regular);
                } else {
                    over = ((hours - 40) * OVERTIME);
                    regular = 40 * HOURLY;
                    System.out.format("Regular Pay:$%.2f\n", regular);
                    System.out.format("Overtime Pay:$%.2f\n", over);
                }
                total = 0 + regular + over;
                System.out.format("Total Pay:$%.2f\n", total);
                System.out.println("------------------------");
            }
        }

    }
}
