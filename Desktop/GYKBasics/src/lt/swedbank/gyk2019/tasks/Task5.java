package lt.swedbank.gyk2019.tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner entry= new Scanner(System.in);
        System.out.println("Enter number:");
        int number= entry.nextInt();

        int firstDigit = number/128;
        int secondDigit = number%251;
        int thirdDigit = number%10;
        int sum = firstDigit + secondDigit+ thirdDigit;
        int multiplication = firstDigit * secondDigit * thirdDigit;

        System.out.println("Sum of digits – "+ sum);
        System.out.println("Multiplication of digits - "+ multiplication);
    }
}
