import java.util.Scanner;
public class Sumofinteger{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter a number");
int number1 = input.nextInt();

int result1 = number1 / 100;
int reminder = number1 % 100;
int result2 = reminder / 10;
int result3 = reminder % 10;
int sum = result1 + result2 + result3;
System.out.printf("The sum of the digit is %d", sum);

}
}