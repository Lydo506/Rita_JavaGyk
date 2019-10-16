package lt.swedbank.gyk2019.tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        System.out.println("Enter circle radius:");
        Double radius = variable.nextDouble();
        Double diameter = radius*2;
        System.out.println("Circle diameter: " + diameter);
        System.out.println("Circle perimeter is: " + diameter*Math.PI);
        System.out.println("Circle area is: " +Math.PI*Math.pow(radius,2));
    }
}
