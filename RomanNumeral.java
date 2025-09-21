import java.util.Scanner;
/**
* Roman Numeral asks...
* 1) For an integer between 1 and 3
* 2) Receives an input
* 3) Checks it through a switch statement, if outside 1-3 returns num
* 4) Converts 1-3 to roman numeral and outputs to console
*
* @author Justin
* @version v1.0
* @since date
*/
public class RomanNumeral {
    public static void main (String[] args)
    {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("What's a number between 1 and 3?");
        num = input.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("1 is I in roman numerals");
                break;
            //Repeat for cases 2&3
            //What can you use as a catch all if the user does not enter a number
            case 2:
                System.out.println("2 is II in roman numerals");
                break;
            case 3:
                System.out.println("3 is III in roman numerals");
                break;
            default:
                System.out.println(num + " is not a valid input\n" + 
                                    "Please input a number between 1 and 3");
                break;
        }
    }
}
