package lt.swedbank.gyk2019.tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double[] studentGrade = new double[3];
        Scanner grade = new Scanner(System.in);
        System.out.println("Enter first grade:");
        studentGrade[0] = grade.nextDouble();
        System.out.println("Enter second grade:");
        studentGrade[1] = grade.nextDouble();
        System.out.println("Enter third grade:");
        studentGrade[2] = grade.nextDouble();

        System.out.println("Average of student grades : "+ ((studentGrade[0]+studentGrade[1]+studentGrade[2])/studentGrade.length));

        //double sum = 0;
        //for(int i=0;i<studentGrade.length;i++) sum += studentGrade[i];
        //double average = sum/studentGrade.length;
        //System.out.println("Average of student grades : "+ average);

    }
}
