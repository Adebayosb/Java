import java.util.Scanner; //bring classes from java library
public class Feettometers { //declare a public class name
   public static void main(String[] args){ //the main method begins excution of java application
     
     Scanner input = new Scanner(System.in); //creating scanner input
     System.out.print("Enter length in feet: "); //display length in feet
        
	 double feet = input.nextDouble(); //read the measurement 
         double result = feet * 0.305; // calculate the resut in meter
       System.out.println("converted to meter is: " + result); //display the result in meter
}
}