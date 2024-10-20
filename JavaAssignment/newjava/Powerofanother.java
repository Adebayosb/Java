import java.util.Scanner;
public class Powerofanother {
public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  System.out.print("Enter firstNumber: ");
	int firstNumber = input.nextInt();
	System.out.print("Enter secondNumber: ");
	int secondNumber = input.nextInt();

	int result = 1;
	for (int i = 0; i < secondNumber; i++) {
	result *= firstNumber;

}

System.out.println(firstNumber + "raised to the power of" + secondNumber + result);


}
}