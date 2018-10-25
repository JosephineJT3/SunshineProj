package Entity;

public class Students {
	
	private int studentId;
	private String studentName;
	
	//constructors
	public Students(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	//setters
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	//getters
	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}

}