import java.io.*;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
	Scanner XReader=new Scanner(System.in);
	System.out.println("Choose one of the following");
	System.out.println("'A' or 'a' for addition");
	System.out.println("'S' or 's' for subtraction");
	System.out.println("'M' or 'm' for multiplication");
	System.out.println("'D' or 'd' for division");
	System.out.println("'P' or 'p' for mystery");
	Scanner YReader=new Scanner(System.in);
	String choice=XReader.nextLine();
	char chr=choice.charAt(0);
	System.out.println("Choose your two numbers"
			+ " to calculate.");
	
	double a=XReader.nextDouble();
	double b=XReader.nextDouble();
	
	
	
	switch (chr)
	{
	case 'A':
	case 'a':
		System.out.println(a+b);
		break;
		
	case 'S':
	case 's':
		System.out.println(a-b);
		break;
		
	case 'M':
	case 'm':
		System.out.println(a-b);
		break;
		
	case 'D':
	case 'd':
		System.out.println(a/b);
		break;
		
	case 'P':
	case 'p':
		System.out.println(a%b);
		break;
		
	default:
		System.out.println("Sorry I did not understand that...");
	
		
		
		
		
		
		
		
	}
	}
}
