
package WileyProject;

import java.util.Scanner;
public class DiscountPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] values = new double[4];

        System.out.println("Enter four values: ");

        for (int i = 0; i < values.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            values[i] = input.nextDouble();
        }

        double sum = calculateSum(values);

        System.out.println("Sum: " + sum);
           if (sum > 10000) {
            double discount = applyDiscount(sum);
            System.out.println("Discount: " + discount);
            System.out.println("Total: " + (sum - discount));
        } else {
            System.out.println("Total: " + sum);
        }
    }

    public static double calculateSum(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum;
    }

    public static double applyDiscount(double sum) {
        return sum * 0.1;
    }
}





