import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = scanner.nextInt();

        double bill = 0;
        if (units <= 50)
            bill = units * 0.5;
        else if (units <= 150)
            bill = 25 + (units - 50) * 0.75;
        else if (units <= 250)
            bill = 100 + (units - 150) * 1.2;
        else
            bill = 220 + (units - 250) * 1.5;

        bill *= 1.2; // Add 20% surcharge

        System.out.printf("Total bill: Rs. %.2f", bill);
        scanner.close();
    }
}
