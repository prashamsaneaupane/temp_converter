
import java.util.Scanner;

public class TemperatureConverter {


	static Scanner kbd = new Scanner(System.in);


	public static void main(String[] args) {

		double temp;
		double converted;
		boolean ctc;
		
		System.out.print("Enter temperature: ");
		temp = kbd.nextDouble();
		kbd.nextLine();

		System.out.print("Convert to Celsius [true/false]: ");
		ctc = kbd.nextBoolean();
		kbd.nextLine();

		System.out.println("Temperature Converter");
		System.out.println("-----------------------");

		if (ctc) {
			converted = fahrenheitToCelsius(temp);
			System.out.printf("%.2f C = %.2f F%n", temp, converted);
		} else {
			converted = celsiusToFahrenheit(temp);
			System.out.printf("%.2f C = %.2f F%n", temp, converted);
		}

	}

		public static double celsiusToFahrenheit(double celsius) {
			double fahrenheit = (celsius * 9 / 5) + 32;
			return fahrenheit;
		}

		public static double fahrenheitToCelsius(double fahrenheit) {
			double celsius = (fahrenheit - 32) * 5 / 9;
			return celsius;
		}

	}

	


