import java.util.Scanner;
/**
 * Just a silly version of the ValidDate thing
 *
 * @author Justin Quach
 * @version v1.1
 * @since 9/20/25
 */
public class ValidDateGoof
{
    public static void main(String[] args)
    {
        // Asks for date input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a date (mm/dd/yyyy): ");
        String date = input.nextLine();
        // Runs validDate to check whether date is valid or not and outputs accordingly
        if (validDate(date)) {
            System.out.println(date + " is a valid date");
        } else {
            System.out.println(date + " is not a valid date");
        }
    }
    public static boolean validDate(String date)
    {
        boolean isLeapYear = false;
        int day, month, year;
        // Parses the date for month, day, year. I'd prefer to use the .map function from JavaScript
        // but I couldn't find an equivalent of it for arrays in Java. I'd have to convert to a stream
        // first.
        String[] temp = date.split("/");
        month = Integer.parseInt(temp[0]);
        day = Integer.parseInt(temp[1]);
        year = Integer.parseInt(temp[2]);
        // Check for leap year
        if (year%400 == 0 || (year%4 == 0 && (year%100 != 0))) {isLeapYear = true;}
        // Checks if the day count is with in reason
        if (day < 1 || day > 31 || (month%2 == 0 && day > 30)) {
            System.out.println("Day is not valid");
            return false;
        }
        // Checks if month has more than 30 days for months that don't have that
        if (month < 1 || month > 12) {
            System.out.println("Month is not valid");
            return false;
        }
        // Checks the month of February
        if (month==2 && day > 28) {
            // Ternary operator to check whether the date is a leap year
            return (isLeapYear && day==29) ? true : false;
        }
        // If everything else passes, then it must be a valid date and we return true
        return true;
    }
}