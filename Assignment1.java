/* Assignment 1
* By William Armswoerhy
*/
package assignment1;
import java.util.Scanner;
public class Assignment1 
{    public static void main(String[] args) 
    {
       double grade1, grade2, grade3, grade4, grade5;
       
       grade1 = grades();
       lettergrade(grade1);
       grade2 = grades();
       lettergrade(grade2);
       grade3 = grades();
       lettergrade(grade3);
       grade4 = grades();
       lettergrade(grade4);
       grade5 = grades();
       lettergrade(grade5);
            System.out.printf("Your average grade is %%%.1f", (grade1+grade2+grade3+grade4+grade5)/5 );
    }
       public static double grades()
            {
        System.out.print("What is your grade in a persentage?: ");
        Scanner keyboard = new Scanner (System.in);
        return keyboard.nextDouble(); 
            }
    
    public static void lettergrade (double grade)
        {
        if (grade >= 80)
            {
            System.out.printf("If you have a %.1f then your grade is an A\n", grade);
            }
       else if (grade >= 70)
            {
            System.out.printf("If you have a %.1f then your grade is an B\n", grade);
            }
       else if (grade >= 60)
            {
            System.out.printf("If you have a %.1f then your grade is an C\n", grade);
            }
       else if (grade >= 50)
            {
            System.out.printf("If you have a %.1f then your grade is an D\n", grade);
            }
        else
       {
           System.out.printf("If you have a %.1f then you failed the class\n" ,grade);
           
       }
        }    
}
