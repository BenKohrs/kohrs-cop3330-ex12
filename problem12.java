import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        int principal = x.nextInt();
        System.out.print("Enter the rate of interest: ");
        double rateOfInterest = x.nextDouble();
        rateOfInterest = rateOfInterest / 100.0;
        System.out.print("Enter the number of years: ");
        int y = x.nextInt();
        double finalAmount = principal * (1 + (rateOfInterest * y));
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.0f.\n", y, rateOfInterest * 100.0, finalAmount);
    }
}
