package Controller;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* Methods in the class so far
 * readStudent(), Read textDB for student particulars
 * read(String filename), to read the textDB
 */

public class Student implements Serializable {
	public static final String SEPARATOR = ",";
	private int studentID;
	private String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public void setStudentID(int id) {
		studentID = id;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	
	// Read student particulars and add them into an ArrayList
	public static ArrayList readStudent(/* String filename */) throws IOException {
		// read String from text file
		String fileName = "Student.txt";
		ArrayList studentArray = (ArrayList)Student.read(fileName);
		ArrayList alr = new ArrayList() ;// to store Student data

        for (int i = 0 ; i < studentArray.size() ; i++) {
				String st = (String)studentArray.get(i);
				// get individual 'fields' of the string separated by SEPARATOR
				StringTokenizer star = new StringTokenizer(st , SEPARATOR);	// pass in the string to the string tokenizer using delimiter ","

				int studentID = Integer.parseInt(star.nextToken().trim());	// first token
				String studentName = star.nextToken().trim();	// second token
				// create Student object from file data
				Student student = new Student(studentID, studentName);
				// add to Student list
				alr.add(student) ;
			}
			return alr ;
	}
	
	// Read contents of a given file
	public static List read(String fileName) throws IOException {
		List data = new ArrayList<Student>() ;
	    Scanner scanner = new Scanner(new FileInputStream(fileName));
	    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
	    String line = null;
	    try {
	    	while ((line = br.readLine()) != null) {
	    		if (line.isEmpty()) {
	    			continue;
	    		}
	    		else {
	    			data.add(line);
	    		}
	    	}
	    }
	    finally{
	    	br.close();
	    }
	    return data;
	  }
}