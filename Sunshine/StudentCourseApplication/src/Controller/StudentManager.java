package Controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/* Methods in the class so far
 * RegisterStudent(String fileName, String newStudentName), Add student into textDB
 * DisplayStudent(), to print out the particulars of ALL student
 * DislayUniqueStudents(), to print the particulars of ONE student based on NAME, more will be added next time
 * DeregistStudent(String fileName, int studentID), Delete students from textDB, not done yet
 * 
 */

public class StudentManager {
	public static final String SEPARATOR = ",";
	private static ArrayList<Student> students;
	private static ArrayList<Student> removeStudents;
	
	public StudentManager() {
		
	}
	
	// Register students ino the ArrayList
	public static ArrayList RegisterStudent(String fileName, String newStudentName) throws IOException {
		int i=0, x=1;
		ArrayList<Student> al = Student.readStudent();
		// Change the way the id is generated
		while (i < al.size()) {
			i++;
			x++;
			System.out.println(al.get(i).getStudentID());
			System.out.println(x);
			if (al.get(i).getStudentID() != x) {
				break;
			}
		}
		String y = String.valueOf(x);
		
		/*int x = ((int)al.size())+1;
		String y = String.valueOf(x);*/
		
		// Add new students
		students = new ArrayList<Student>();
		students.add(new Student(x, newStudentName));
		al.addAll(al.size(), students);
		try {
			FileWriter fw = new FileWriter(fileName, true);
			fw.append(System.getProperty("line.separator"));
			fw.write(y);
			fw.write(",");
			fw.write(newStudentName);
			fw.close();
		} catch (IOException e) {
			System.out.println("IOException > " + e.getMessage());
		}
		return al;		
	}
	
	// Remove students from DB
	public static ArrayList DeregisterStudent(String fileName, String studentID) throws IOException {
		ArrayList<Student> al = Student.readStudent();
		Student s;	
		
		for (int i=0; i<al.size(); i++) {
			s = (Student)al.get(i);
			int id = Integer.parseInt(studentID);
			
			if (s.getStudentID() == id) {
				al.remove(s);
			}
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter("Student.txt"));
		for(int i=0;i<al.size();i++) {
			System.out.println(i);
			String id_ = Integer.toString(al.get(i).getStudentID());
			String studentName_ = al.get(i).getStudentName();
			try {
				bw.write(id_);
				bw.write(',');
				bw.write(studentName_);
				bw.write("\r\n");
				System.out.println("Done");

			} catch (IOException e) {

				e.printStackTrace();

			} //finally {

				//;
			//}
			
		}
		bw.close();
		return al;
	}
	
	// Prints out all students inside the ArrayList
	public static void DisplayStudent() {
		try {
			// read file containing Student records
			ArrayList<Student> al = Student.readStudent();
			for (int i=0; i<al.size(); i++) {
				Student s = (Student)al.get(i);
				System.out.println("Student ID: " + s.getStudentID());
				System.out.println("Student Name: " + s.getStudentName());
			}
		} catch (IOException e) {
			System.out.println("IOException > " + e.getMessage());
		}
	}
	
	public static void DisplayUniqueStudent(String name) {
		try {
			int count=0;
			ArrayList<Student> al = Student.readStudent();
			for (int i=0; i<al.size(); i++) {
				Student s = (Student)al.get(i);
				if (s.getStudentName().equals(name)) {
					count++;
					System.out.println("Student ID: " + s.getStudentID());
					System.out.println("Student Name: " + s.getStudentName());
					break;
				}
			}
			if (count==0) {
				System.out.println("Student not found in our records!!!");
			}
		} catch (IOException e) {
			System.out.println("IOException > " + e.getMessage());
		}
	}
}