package projectOne;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmMain {
    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "Bagulu Odayum Dagulu Maari (The Return of Maari).wav";

        while(alarmTime == null){
            try{
                System.out.print("Enter the Alarm Time (HH:mm:ss): ");
                String inputTime = in.nextLine();

                alarmTime = LocalTime.parse(inputTime,formatter);
                System.out.println("Alarm set for: " + alarmTime);
            }
            catch (DateTimeParseException e){

                System.out.println("Invalid Format, Please Use HH:mm:ss");
            }

        }

        AlarmClock alarmClock = new AlarmClock(alarmTime,filePath,in);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();


    }
}
