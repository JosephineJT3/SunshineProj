package Controller;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		int choice;
		Scanner sc = new Scanner(System.in);
		
		StudentManager studentManager = new StudentManager();
		FacultyMemberManager facultyManager = new FacultyMemberManager();
		CourseManager courseManager = new CourseManager();
		String fileName = "Student.txt";
		
		System.out.println("1.  Add student");
		System.out.println("2.  Add course");
		System.out.println("3.  Register student into a course");
		System.out.println("4.  Check vacancy of class");
		System.out.println("5.  Print student list");
		System.out.println("6.  Enter couse assessment components weightage");
		System.out.println("7.  Enter courswork mark - inclusive of its components");
		System.out.println("8.  Enter exam mark");
		System.out.println("9.  Print course statistics");
		System.out.println("10. Print student transcript");
		choice = sc.nextInt();
		
		do {
			switch (choice) {
				case 1:
					
					System.out.println("What is the name of the new student you are registering?");
					System.out.println("We will randomly generate an ID for him!");
					sc.nextLine();
					String newStudentName = sc.nextLine();
					studentManager.RegisterStudent(fileName, newStudentName);
					System.out.println("The person is now a student in our school");
					
					choice = sc.nextInt();
					break;
				case 2:
					choice = sc.nextInt();
					break;
				case 3:
					choice = sc.nextInt();
					break;
				case 4:
					choice = sc.nextInt();
					break;
				case 5:
					choice = sc.nextInt();
					break;
				case 6:
					choice = sc.nextInt();
					break;
				case 7:
					choice = sc.nextInt();
					break;
				case 8:
					choice = sc.nextInt();
					break;
				case 9:
					choice = sc.nextInt();
					break;
				case 10:
					choice = sc.nextInt();
					break;
				default:
					break;
			}
		} while (choice<10);
	}
}