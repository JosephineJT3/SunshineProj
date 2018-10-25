package Entity;

public class Courses {
	private int courseId;
	private String courseName;
	private int vacancyNumber;
	//ISSUE: Is there a need for faculty name?
	private String facultyName;
	private boolean lecture;
	private boolean tutorial;
	private boolean laboratory;
	//ISSUE: Is there a need to have getter/setter for courseCoordinator in this class
	private FacultyMembers courseCoordinator;

	//constructors
	public Courses(int courseId, String courseName, int vacancyNumber, String facultyName, boolean lecture, boolean tutorial, boolean laboratory, FacultyMembers courseCoordinator)
	{
		this.courseId = courseId;
		this.courseName = courseName;
		this.vacancyNumber = vacancyNumber;
		this.facultyName = facultyName;
		this.lecture = lecture;
		this.tutorial = tutorial;
		this.laboratory = laboratory;
		this.courseCoordinator = courseCoordinator;
	}
	//setters
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	
	}
	
	public void setVacancyNumber(int vacancyNumber) {
		this.vacancyNumber = vacancyNumber;
	
	}
	
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	
	}
	
	public void setLecture(boolean lecture) {
		this.lecture = lecture;
	
	}
	
	public void setTutorial(boolean tutorial) {
		this.tutorial = tutorial;
	
	}
	
	public void setLaboratory(boolean laboratory) {
		this.laboratory = laboratory;
	
	}
	
	public void setCourseCoordinator(FacultyMembers courseCoordinator) {
		this.courseCoordinator = courseCoordinator;
	}
	
	//getters
	public int getCourseId() {
		return courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getVacancyNumber() {
		return vacancyNumber;
	}
	
	public String getFacultyName() {
		return facultyName;
	}
	
	public boolean getLecture() {
		return lecture;
	}
	
	public boolean getTutorial() {
		return tutorial;
	}
	
	public boolean getLaboratory() {
		return laboratory;
	}
	
	public FacultyMembers getCourseCoordinator() {
		return courseCoordinator;
	}

}