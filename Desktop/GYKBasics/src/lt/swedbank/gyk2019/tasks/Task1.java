package lt.swedbank.gyk2019.tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("What’s your name?");
        String firstName = text.nextLine();
        System.out.println("What’s your surname?");
        String lastName = text.nextLine();
        System.out.println("What’s your work area?");
        String jobRole = text.nextLine();
        System.out.println("How many years you been working in it? ");
        double yearsWorking = text.nextDouble();

        System.out.println("Hello, I’m " + firstName + " " + lastName + " and I work in " + jobRole + " for " + yearsWorking +" years.");
    }
}
