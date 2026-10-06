import java.util.Scanner;

public class Gradebook {
	public static void main(String[] args) {
		
		java.util.Scanner input = new Scanner(System.in);
		
		int grade;
		int count = 0;
		double total = 0;
		double highest = 0;
		double lowest = 100;
		
		System.out.println("Welcome to the grade book!");
		System.out.println("Enter grades (1-100). Enter -1 to stop.");
		
		while (true) {
			
			System.out.print("Enter Grade:");
			grade = input.nextInt();
			
			if (grade == -1) {
				break;
			}
			
			if (grade < 1 || grade > 100) {
				System.out.println("Not Valid");
			} else {
				count++;
				total = total + grade;
				
				if (grade > highest ) {
					highest = grade;
				}
					if (grade < lowest ) {
						lowest = grade;
				}
			}
		}
		
		System.out.println("All done!");
		
		if (count > 0) {
			double average = total / count;
			
			System.out.println("Total Grades Entered: " + count);
			System.out.println("Highest Grade: " + highest);
			System.out.println("Lowest Grade: " + lowest);
			System.out.println("Average: " + average);
		} else {
			System.out.println("No grades were entered.");
		}
		
		input.close();
				}
			}
