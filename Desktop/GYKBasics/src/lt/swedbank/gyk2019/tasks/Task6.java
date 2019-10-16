package lt.swedbank.gyk2019.tasks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int input = scanner.nextInt();
        //143233

        int seconds = input%60;
        int minutes = (input-seconds)/60%60;
        int hours = ((input-seconds)/60-minutes)/60%24;
        int days = ((input-seconds)/60-minutes)/60/24;

        System.out.println("Days - "+ days);
        System.out.println("Hours - "+ hours);
        System.out.println("Minutes - "+ minutes);
        System.out.println("Seconds - "+ seconds);

    }


}
