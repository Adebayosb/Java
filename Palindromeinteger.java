import java.util.Scanner; //bring classes from java library
   public class Palindromeinteger { //declare a public class name
      public static void main(String[] args){ //the main method begins excution of java application
 Scanner input = new Scanner(System.in); //creating scanner input
System.out.print("enter three digit number:  "); //prompt user to enter three digit number

      int digit = input.nextInt(); //collect the integer input

      int digit1 = digit / 100; //isolate the first number
      
      int digit2 = digit % 10; //isolate the first number
      
        if (digit1 == digit2) { //determin if is a palindrome
System.out.print(digit + "its a palindrome"); 
}
else {
   System.out.print(digit + " is not a palindrome");
}



}


}