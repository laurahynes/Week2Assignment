
import java.util.Scanner;

public class PowersChart {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int expo, answer;
        System.out.print("Enter the value of the exponent from 0-10 > ");
        expo = s.nextInt();
        while (expo > 10 || expo < 0) {
            System.out.println("Error. Exponent must be from 0-10");
            System.out.print("Enter the value of the exponent from 0-10 > ");
            expo = s.nextInt();

        }
        System.out.println("X \t\t    2^X");
        System.out.println("- \t\t    ---");
        for (int i = 0; i < expo; i++) {
            answer = (int) Math.pow(2, i);
            System.out.format("%d%20d^%d = %d\n", i, 2,i, answer);
            
        }
    }

}
