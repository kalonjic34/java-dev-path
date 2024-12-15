import java.util.Scanner;

public class TemperatureConversion {
    // Coding Exercise 2: Temperature Conversion
    // Write two overloaded methods named convertTemperature:

    // One method converts Celsius to Fahrenheit.
    // The other method converts Fahrenheit to Celsius.
    // Steps:

    // The method convertTemperature(double celsius) converts Celsius to Fahrenheit using the formula:
    // F = (C * 9/5) + 32.
    // The method convertTemperature(double fahrenheit, boolean isFahrenheit) converts Fahrenheit to Celsius using the formula:
    // C = (F - 32) * 5/9.  

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scan.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scan.nextDouble();
            double fahrenheit = convertTemperature(celsius);
            System.out.printf("Temperature in Fahrenheit: %.2f°F\n", fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scan.nextDouble();
            double celsius = convertTemperature(fahrenheit, true);
            System.out.printf("Temperature in Celsius: %.2f°C\n", celsius);
        } else {
            System.out.println("Invalid choice.");
        }

        scan.close();
    }

    static double convertTemperature(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double convertTemperature(double fahrenheit, boolean isFahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}