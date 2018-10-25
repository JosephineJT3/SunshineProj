package Entity;

public class Grades {
	private double exam;
	private double coursework;
	private double classParticipation;
	private double assignment;
	
	//ISSUE: Should we have an overall grade attribute
	
	//constructors
	public Grades() {
		this.exam = 0;
		this.coursework = 0;
		this.classParticipation = 0;
		this.assignment = 0;
	}
	
	public Grades(double exam, double coursework, double classParticipation, double assignment) {
		this.exam = exam;
		this.coursework = coursework;
		this.classParticipation = classParticipation;
		this.assignment = assignment;
	}
	
	//setters
	public void setExam(double exam) {
		this.exam = exam;
	}
	
	public void setCoursework() {
		this.coursework = (0.3*classParticipation + 0.7*assignment);
	}
	
	public void setClassParticipation(double classParticipation) {
		this.classParticipation = classParticipation;
		this.setCoursework();
	}
	
	public void setAssignment(double assignment) {
		this.assignment = assignment;
		this.setCoursework();
	}
	
	//getters
	public double getExam() {
		return exam;
	}
	
	public double getCoursework() {
		return coursework;
	}
	
	public double getClassParticipation() {
		return classParticipation;
	}
	
	public double getAssignment() {
		return assignment;
	}
	
	public double computeOverallGrade() {
		return (0.6*exam + 0.4*coursework);
	}
	
}