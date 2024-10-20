import java.util.Scanner;
public class Sumdisplayed {
public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
	char choice;
	do {
	System.out.print("Enter firstNumber: ");
	int firstNumber = input.nextInt();
	System.out.print("Enter secondNumber: ");
	int secondNumber = input.nextInt();
	int sum = firstNumber + secondNumber;
	System.out.println("Sum: " + sum);

	System.out.print("Do you want to perform the operation again (Yes/No): ");
	choice = input.next().charAt(0);
	} while (choice == 'y');




}
}