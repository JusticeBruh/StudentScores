import java.util.Scanner;

public class MainMethod {
    public static void main(String[]args) {
        Scanner scnr = new Scanner(System.in);
        String name;
        int no1, no2, no3, no4, no5, no6;
        int avgScore;
        String grade;
        int endPrgm;
        
        ScoreCalculation studentsInfo = new  ScoreCalculation();

        boolean running = true;
        
        while (running) {
        System.out.println("Please enter your first name: ");
        name =  scnr.next();

        System.out.println("Please enter the first test score: ");
        no1 =  scnr.nextInt();

        System.out.println("Please enter the second test score: ");
        no2 =  scnr.nextInt();

        System.out.println("Please enter the third test score: ");
        no3 =  scnr.nextInt();

        System.out.println("Please enter the fourth test score: ");
        no4 =  scnr.nextInt();

        System.out.println("Please enter the fifth test score: ");
        no5 =  scnr.nextInt();

        System.out.println("Please enter the sixth test score: ");
        no6 =  scnr.nextInt();

        studentsInfo.calcAvg(no1,no2,no3,no4,no5,no6);
        avgScore = studentsInfo.getCalcAvg();

    
        studentsInfo.DetermineResults(avgScore);
        grade =  studentsInfo.getGrade();

        System.out.println(name + ": ");
        System.out.println("Average score: " + avgScore);
        System.out.println("Grade: " + grade);
        
        System.out.println("Continue entry for next student? 1 for 'yes', 2 for 'no' ");
        endPrgm = scnr.nextInt();
            if (endPrgm == 2) {
                running = false;
            }

        }
    }
}