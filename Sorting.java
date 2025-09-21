import java.util.Scanner;
/**
* Program Description
* 1) Fill in steps
*
* @author Justin Quach
* @version v1.0
* @since 9/19/25
*/
public class Sorting
{
    public static void main (String[] args){
    int n1, n2, n3, low, medium, high;
    Scanner input = new Scanner(System.in);
    System.out.println("Provide 3 numbers:");
    n1 = input.nextInt();
    n2 = input.nextInt();
    n3 = input.nextInt();
    //Look for when n1 is smallest section
    if ((n1<=n2) && (n1<=n3)){
        low = n1;
        if (n2 <= n3) {
            medium = n2;
            high = n3;
        } else {
            medium = n3;
            high = n3;
        }
    }
    //Above n1 is smallest, now we need to figure out when n2 is smallest section
    else if (n2<=n3) { //n2 is smallest
        low = n2;
        if (n1 <= n3) {
            medium = n2;
            high = n3;
        } else {
            medium = n3;
            high = n2;
        }
    }
    //Above are n1 and n2 smallest sections.
    //Therefore, by default (else) only n3 is left to be the smallest
    else { //n3 is smallest
        low = n3;
        if (n1 <= n2) {
            medium = n1;
            high = n2;
        } else {
            medium = n2;
            high = n1;
        }
    }
    System.out.printf("The inputs sorted smallest to largest are: %d, %d, %d\n", 
                      low, medium, high);
    }////end main
}////end class
