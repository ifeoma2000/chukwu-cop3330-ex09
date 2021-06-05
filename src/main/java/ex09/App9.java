package ex09;
/*
Exercise 9 - Paint Calculator
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.

Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.

Challenges
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Implement support for a round room.
Implement support for an L-shaped room.
Implement a mobile version of this app so it can be used at the hardware store.
 */
//UCF COP3330 Summer 2021 Assignment 1 Solution Copyright 2021 Ifeoma Chukwu
import java.util.Scanner;
public class App9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the room: ");
        int length = input.nextInt();
        System.out.print("Please enter the width of the room: \n");
        int width = input.nextInt();
        double wallArea = width * length;
        final int num = 350;
        double paintQuantity = wallArea / num;
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", Math.ceil(paintQuantity), wallArea);

    }
}
