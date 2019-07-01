package PA05;

import java.util.Arrays;

public class Course {
	
	private int id;
	private String description;
	private Student[] students;
	private Grade[] grades;
	int n = 0;
	
	// complete course object constructor
	public Course (int id, String description, int n){
		
		// you should initialize the students and grades arrays here
		// these array should be of size n 
		this.id = id;
		this.description = description;
		//this.n = n;
		students = new Student[n];
		grades = new Grade[n];
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription()
	{
		this.description = description;
	}
	public String getStudents()
	{
		String output = "";
		for(int i =0; i < Student.getNoOfStudents(); i++)
			output += students[i] + "\n";
		
		return output;
	}
	public String getGrades()
	{
		String output = "";
		for (int i =0; i < Student.getNoOfStudents(); i++)
			output += grades[i] + "\n";
		return output;
	}
	public boolean addStudent(Student student)
	{
		if(Student.getNoOfStudents() < n)
		{
			students[Student.getNoOfStudents()-1] = student;
			return true;
		}
		else
			return false;
	}
	public boolean addGrade(Grade grade)
	{
		if(Grade.getNoOfGrades() < n)
		{
			grades[Grade.getNoOfGrades()-1] = grade;
			return true;
		}
		else
			return false;
	}
	// Creates and adds a student object to the  students array
//	public void addStudent(int id, String name){
//		
//	}
//	// adds a grade object to the  grades array
//   public void addGrade(){
//		
//	}   
   public double getGradeAVG(){
	   double avg = 0;
	   
	   for(int i=0; i < Student.getNoOfStudents(); i++)
	   {		   
		   double total = Grade.getScore();
		   total++;
		   avg = total / Student.getNoOfStudents();
	   }
	   
	   return avg;
		
	}
   
   
  public String getHiegestStudentGrade(){
	  double max = Grade.getScore();
	  
	  for(int i=1; i<grades.length; i++)
	  {
		  if(Grade.getScore() > max)
		  {
			  max = Grade.getScore();
		  }
	  }
		String output = Double.toString(max);
		
		return output;
	}

@Override
public String toString() {
	return "Course [getStudents()=" + getStudents() + ", getGradeAVG()=" + getGradeAVG() + ", getHiegestStudentGrade()="
			+ getHiegestStudentGrade() + "]";
}

  
   
}
