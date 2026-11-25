
import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		Scanner object =new Scanner(System.in);
		System.out.println("Enter the first number:");
		double num1=object.nextDouble();
		System.out.println("Enter the operator:");
		char op=object.next().charAt(0);
		System.out.println("Enter the second number:");
		double num2=object.nextDouble();
		if (op==('+')) {
			double d=num1+num2;
			System.out.println("Result="+d);}
		else if (op==('-')) {
			double d=num1-num2;
			System.out.println("Result="+d);}
		else if (op==('*')) {
			double d=num1*num2;
			System.out.println("Result="+d);}
		else if (op==('/')) {
			if (num2!=0) {
				double d=num1/num2;
				System.out.println("Result="+d);}
			else {
				System.out.println("Cannot divide by zero");}}	
		}
}


