package day3;

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your weight in pounds");
		
		double weightInPounds = scanner.nextDouble();
		System.out.println("Enter your height in meters");
		
		double height = scanner.nextDouble();
		
		//to convert pounds to kg = lb × 0.45359237 
		double weightInkgs = weightInPounds * 0.45359237;
		
		

		//BMI weight (kg) ÷ height² (m²)
		double bmi = weightInkgs/(height*height);
		
		System.out.println(bmi);
		
		if (bmi < 18.5)
		{
			System.out.println("You are Under Weight");
		}
		
		else if (bmi >= 18.5 && bmi< 24.9)
		{
			System.out.println("You are Normal");
		}
		
		else if (bmi >= 25 && bmi < 29.9)
		{
			System.out.println("You are Overweight");
		}
		
		else 
		{
	     System.out.println("You are Obease");
		}
		scanner.close();

	}  // Closes main method

	}  // Closes class


