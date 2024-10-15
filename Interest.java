import java.util.Scanner;// we import class scanner from util package and util from java package
public class Interest { // Class name start with capital letter
public static void main(String[] args) {// main method, entry point

Scanner input = new Scanner(System.in);// creating object of class scanner naming it input

System.out.println("Enter Balance: ");// display on terminal 
double balance = input.nextDouble();// collecting input and storing it inside a variable named balance with datatype double

System.out.println("Enter Annual Interest: ");
double annualinterest = input.nextDouble();

double interest = balance * (annualinterest/1200); 
System.out.print("The interest for the next month " + interest);
	
	}
}