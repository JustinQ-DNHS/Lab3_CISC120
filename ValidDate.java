import java.util.Scanner;
/**
* Program Description
* 1) Fill in steps
*
* @author Name, optional email
* @version v1.0
* @since date
*/
public class ValidDate { //Remove _Starter.
    public static void main (String[] args){
    int month, day, year;
    String temp, output;
    Scanner input = new Scanner(System.in);
    input.useDelimiter("/");
    output = "";
    System.out.print("Enter a date (mm/dd/yyyy): ");
    month = input.nextInt();
    day = input.nextInt();
    temp = input.nextLine().substring(1); //ie, assigns "2022" to temp, if /2022 is in the buffer!
    year = Integer.parseInt(temp);
    boolean isValid = false;
    ////Create if-else if to look for when:
    ////Section 1, day is less than 1
    if (day < 1)
    {
        System.out.println("Days can not be less than 1");
    }
    ////Section 2, day is larger than 31
    else if (day > 31)
    {
        System.out.println("Days can not be greater than 31");
    }
    //// Section 3, btw 1 and 31 days, can use a switch that evaluates months
    //// with intentional bleed through
    else
    {
    switch(month){
        ////Cases for all 31 day months
        case 1:
        case 3:
        case 5:
        case 7:
        case 9:
        case 11:
            isValid = true;
            break;
        ////Cases for all 30 day months
        case 4:
        case 6:
        case 8:
        case 10:
        case 12:
            if(day <= 30) //replace X
            {
                isValid = true;
            } else
            {
                System.out.println("Days can not be greater than 30 for this month");
            }
            break;
        ////This is February
        case 2:
            boolean isLeapYear = false;
            ////Carefully look at || and && combo
            if( year%400 == 0 || (year%4 == 0 && !(year%100==0)) )
            {
                isLeapYear = true;
            }
            if (isLeapYear){ ////use isLeapYear flag
                if(day <= 29) //Update X
                {
                    isValid = true;
                } else
                {
                    System.out.println("Cannot have more than 29 days for this month");
                }
                
            } else
            { ////non-leap year
                if(day <= 28) //Update X
                {
                    isValid = true;
                } else 
                {
                    System.out.println("Cannot have more than 28 days for this month");
                }
            }
            break;
        ////end case 2:
        default:
            System.out.println("Month must be between 1 and 12");
            break;
        }////End of switch
    }////End of else section for multibranch if-else if
    //// Output section using isValid flag
    if (isValid) ////if isValid is true statement below will run
    {
        System.out.printf("%s/%s/%s is a valid date\n", month, day, year);
    } else 
    {
        System.out.printf("%s/%s/%s is not a valid date\n", month, day, year);
    }
    }////end main
}////end class