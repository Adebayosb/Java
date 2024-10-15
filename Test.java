import java.util.Scanner;


public class Test{
 public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);

	
	System.out.println("enter point for (x1,y1): ");
	Double side1 = scanner.nextDouble();
	

	System.out.println("enter point for (x2,y2): ");
	Double side2 = scanner.nextDouble();

	System.out.println("enter point for (x3,y3): ");
	Double side3 = scanner.nextDouble();

	
	Double s = (side1 + side2 + side3) / 2;

	
	Double result1 = s - side1;
	Double result2 = s - side2;
	Double result3 = s - side3;
	Double result = s * (result1 * result2 * result3);

		

	Double area = Math.sqrt(result);

	 
	System.out.print("the area of the triangle is "+ area);

	}


}