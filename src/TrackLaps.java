import java.util.Scanner;

/**
 * 6.25 LAB: Track laps to miles
 * This section has been set as optional by your instructor.
 * One lap around a standard high-school running track is exactly 0.25 miles.
 * Define a method named lapsToMiles that takes a double as a parameter,
 * representing the number of laps, and returns a double that represents the number of miles. Then,
 * write a main program that takes a number of laps as an input, calls method lapsToMiles()
 * to calculate the number of miles, and outputs the number of miles.
 * <p>
 * Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
 * System.out.printf("%.2f\n", yourValue);
 * <p>
 * Ex: If the input is:
 * <p>
 * 7.6
 * the output is:
 * <p>
 * 1.90
 * Ex: If the input is:
 * <p>
 * 2.2
 * the output is:
 * <p>
 * 0.55
 * The program must define and call a method:
 * public static double lapsToMiles(double userLaps)
 */
public class TrackLaps {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double userLaps = s.nextDouble();

        System.out.printf("%.2f", lapsToMiles(userLaps));

    }
    public static double lapsToMiles(double userLaps) {
        double numMile = userLaps * 0.25;
        return numMile;

    }
}

