//Grade Calculator Project
import java.util.Scanner;

public class GradeCalculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------Grade Calculator---------------");

        System.out.print("Enter the number of subjects: ");
        int num = sc.nextInt();
        

        int[] marks = new int[num];
        int totalMarks = 0;
        

        for (int i = 0; i < num; i++)
	{

            int mark;
            while (true) 
	    {
	
                System.out.print("Enter marks obtained in subject " + (i + 1) + " (0-100): ");
                mark = sc.nextInt();
                

                if (mark >= 0 && mark <= 100) 
                    break; 
                 else 
                    System.out.println("Invalid input! Marks must be between 0 and 100.");
                
            }
            marks[i] = mark;
            totalMarks =totalMarks+ mark; 
        }
        

        double averagePercentage = (double) totalMarks / num;
        

        char grade;
        if (averagePercentage >= 90) 
            grade = 'A';
         else if (averagePercentage >= 80) 
            grade = 'B';
         else if (averagePercentage >= 70) 
            grade = 'C';
         else if (averagePercentage >= 60) 
            grade = 'D';
         else 
            grade = 'F';
        
        
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
    }
}
