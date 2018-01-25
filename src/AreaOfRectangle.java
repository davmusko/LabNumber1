import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double length;
		double width;
		double area;
		double peri;
		double height;
		double volume;
		String a;

		System.out.println("Welcome to Grand Circus' Room Detail Generator\n");

		do {
			System.out.print("Enter Length: ");
			length = input.nextDouble();

			System.out.print("Enter Width: ");
			width = input.nextDouble();

			System.out.print("Enter Height: ");
			height = input.nextDouble();

			area = length * width;
			peri = (2 * length) + (2 * width);
			volume = length * width * height;

			System.out.println("\nArea: " + area);
			System.out.println("Perimeter: " + peri);
			System.out.println("Volume: " + volume);

			System.out.println("\nContinue? (y/n)");
			a = input.next();
		} while (a.equals("Y") || a.equals("y"));
		
	}

}
