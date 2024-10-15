import java.util.Scanner;

public class Volumeoftriangel{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter length of the sides");
double length = input.nextDouble();

double result1 = Math.sqrt(3);
double result2 = result1 / 4;
double area = result2 * (length * length);
double volume = area * length;

System.out.println(area);
System.out.print(volume);

}
}
