import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        char grade = determineGrade(score);
        System.out.println("The student's grade is: " + grade);

        scanner.close();
    }

    public static char determineGrade(int score) {
        char grade;
        
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else  (score >= 60) {
            grade = 'F';
        }

        return grade;
    }
}(hello)
