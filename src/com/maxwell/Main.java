package com.maxwell;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Scanner
        Scanner input = new Scanner(System.in);

    // Weight in pounds
        System.out.print("Weight in Freedom Units?");
        double weight = input.nextDouble();

    // Height in inches
        System.out.print("Height?");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

    // compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms /
                (heightInMeters * heightInMeters);


    //Display

        System.out.println("BMI IS" + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("OBESE");

    }
}
