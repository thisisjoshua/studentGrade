package PA05;

public class Grade {
	private int id;
	private String assignment;
	private Student student;
	private static double score;
	private static int noOfGrades = 0;
	
	// complete grade object constructor
	public Grade (int id, String assignment, Student student, double score){
		// increment noOfGrades by one for each new instantiated Grade object 
		this.id = id;
		this.assignment = assignment;
		this.student = student;
		Grade.score = score;
		noOfGrades++;
		
	}	
	// compete public getter and setter methods

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAssignment() {
		return assignment;
	}

	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public static double getScore() {
		return score;
	}

	public void setScore(double score) {
		Grade.score = score;
	}

	public static int getNoOfGrades() {
		return noOfGrades;
	}

	public static void setNoOfGrades(int noOfGrades) {
		Grade.noOfGrades = noOfGrades;
	}
	

}
