package lt.swedbank.gyk2019.tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter rectangle length:");
        double rectangleLength = input.nextDouble();
        System.out.println("Enter rectangle width:");
        double rectangleWidth = input.nextDouble();

        System.out.println("Rectangle length and width are: " + rectangleLength+ ", " + rectangleWidth);
        double perimeter = rectangleLength*2+rectangleWidth*2;
        System.out.println("Rectangle perimeter is: " + perimeter);
        double area = rectangleLength* rectangleWidth;
        System.out.println("Rectangle area is: "+ (int) area);

    }
}
