import java.util.Scanner;
public class Inp2 {
// calculate area of circle 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius ");
		float r = sc.nextFloat();
		
		System.out.println("Area of Circle is : " + (3.14f*r*r));
	}
}
