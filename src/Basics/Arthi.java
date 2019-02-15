package Basics;

import java.util.Scanner;

public class Arthi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1:");
		double num1=sc.nextDouble();
		System.out.println("Enter number 2:");
		double num2=sc.nextDouble();
		System.out.println("Enter operator");
		String operate=sc.next();
		switch(operate) {
		case "+":System.out.println("Addition="+(num1+num2));
			break;
		case "-":System.out.println("Substraction="+(num1=num2));
		break;
		case "*":System.out.println("Mutiplication="+(num1*num2));
		break;
		case "/":System.out.println("Division="+(num1/num2));
		break;
		default:System.out.println("Enter valid operator");
		break;
		}
	}

}
