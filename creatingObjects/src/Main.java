import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Date anotherDate = new Date();

        Scanner myScanner = new Scanner(System.in);

        String anotherDateString = anotherDate.toString();
        anotherDate.setTime(123478);
        boolean isBefore = currentDate.before(anotherDate);
        System.out.println(isBefore);
        String resString = myScanner.nextLine();
        System.out.println(resString);
        resString = myScanner.next();
        System.out.println(resString);

    }

}
