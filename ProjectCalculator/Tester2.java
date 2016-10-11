import java.io.*;
import java.util.*;

public class Tester2 {

	public static void main(String[] args) {
	Scanner AdrianIsAnIdiot=new Scanner(System.in);
	System.out.println("Choose a math operation");
	System.out.println("\"Addition\"");
	System.out.println("\"Subtraction\"");
	System.out.println("\"Multiplication\"");
	System.out.println("\"Division\"");
	String choice=AdrianIsAnIdiot.nextLine();
	
	Scanner AdrianHasNoTesticles=new Scanner(System.in);
	System.out.println("Please enter a number, "
			+ "then press enter, then enter"
			+ " another number.");
	double a=AdrianHasNoTesticles.nextDouble();
	double b=AdrianHasNoTesticles.nextDouble();
	switch(choice)
	{
	case "Addition":
		System.out.println(a+b);
		break;
	case "Subtraction":
		System.out.println(a-b);
		break;
	case "Multiplication":
		System.out.println(a*b);
		break;
	case "Division":
		System.out.println(a/b);
		break;
	default:
		System.out.println("Sorry, I am not smart"
				+ " enough to understand that.");
	}
	
	
	}

}
