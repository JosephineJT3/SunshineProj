
package Entity;

public class FacultyMembers {
	private int facultyId;
	private String facultyName;
	
	//constructors
	public FacultyMembers(int facultyId, String facultyName) {
		this.facultyId = facultyId;
		this.facultyName = facultyName;
	}
	
	//setters
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	
	//getters
	public int getFacultyId() {
		return facultyId;
	}
	
	public String getFacultyName() {
		return facultyName;
	}
	
}