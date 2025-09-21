import java.util.Scanner;
/**
* ProbChall_4 asks the user to input...
* 1) List the steps
*
* @author Justin Quach
* @version v1.0
* @since 9/19/25
*/
public class TestScoresAndGrades
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int exam0, exam1, exam2;
        double avg;
        char grade;
        System.out.print("Enter Exam 1 score: ");
        exam0 = input.nextInt();
        System.out.print("Enter Exam 2 score: ");
        exam1 = input.nextInt();
        System.out.print("Enter Exam 3 score: ");
        exam2 = input.nextInt();
        avg = (double)(exam0 + exam1 + exam2) / 3;
        if (avg >= 90) 
        {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        //console output
        System.out.printf("With an average score of %.1f\nYour grade is %c\n", avg, grade);
    }
}
