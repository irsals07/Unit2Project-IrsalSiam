import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");

// Asking user for coordinate 1
        System.out.print("Please type the first coordinate: ");
        String coord1 = s.nextLine();
        String firstCoordinate =coord1;

        System.out.print("Please type the first coordinate: ");
        String coord2 = s.nextLine();
        String secondCoordinate = coord2;

        LinearEquation data = new LinearEquation(firstCoordinate, secondCoordinate);
        System.out.print(data.toString());
    }

}
