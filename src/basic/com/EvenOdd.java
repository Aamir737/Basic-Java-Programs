package basic.com;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
	int n=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Number:");
	n =sc.nextInt();
	sc.close();
	if(n%2==0) {
		System.out.println("The number is Even");
	}
	else {
		System.out.println("The number is Odd");
	}
	
	
	
}
}
