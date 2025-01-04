
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Student_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        
        System.out.println("Enter student grades (enter -1 to stop):");
        
        while (true) {
            System.out.print("Enter grade: ");
            int grade = sc.nextInt();
            if (grade == -1) {
                break;
            }
            if (grade < 0 || grade > 100) {
                System.out.println("Please enter a valid grade between 0 and 100.");
                continue;
            }
            grades.add(grade);
        }
        
        if (grades.isEmpty()) {
            System.out.println("No grades entered. Exiting...");
        } else {
            // Calculate Average
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            double average = (double) sum / grades.size();
            
            // Find Highest and Lowest Grade
            int highest = Collections.max(grades);
            int lowest = Collections.min(grades);
            
            // Display Results
            System.out.println("\n--- Grade Summary ---");
            System.out.println("Total Students: " + grades.size());
            System.out.printf("Average Grade: %.2f%n", average);
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
        }
        
        
    }
}