package PA05;

import javax.swing.JOptionPane;

public class School {
	
	private static Course course;

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		// 1 - prompt the user to provide the number of students, integer n value
		int n  = Integer.parseInt(JOptionPane.showInputDialog(null, "Please input the number of students"));		
		// 2 - Instantiates the course object
		Course course = new Course(0, null, n);
		// 3 - Prompt the user to input the student data, and calls addStudentGrade() to add the student to course, for n students
		JOptionPane.showInputDialog(null, "Please add student data e.g. id #, name:");
		for (int i = 0; i < n; i++)
		{
			addStudentToCourse(null, 0, null);
		}		
		// 4 - Prompt the user to input the grade data, and calls aaddStudentGradeToCourse() to add the grade to course, for n grades
		JOptionPane.showInputDialog(null, "Please enter student's grade");
		for (int i = 0; i < n; i++)
		{
			addStudentGradeToCourse(0, null, null, 0);
		}
		// 5 - Displays the course statistics by calling displayCourseStat()
	}
	
	// it uses the course object to add a new student to the course
	public static void addStudentToCourse(Student student, int id, String name){
		if(course.addStudent(student))
		{
			JOptionPane.showMessageDialog(null, "Student added to course");
		}
		else
		{
			JOptionPane.showMessageDialog(null,  "Student not added");
		}
	}
	
	// it uses the course object to add a new grade object to the course
	public static void addStudentGradeToCourse(int id, String assignment, Grade grade, double score){
			if(course.addGrade(grade))
			{
				JOptionPane.showMessageDialog(null,  "Grade added to student");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Grade not added.");
			}
	}
	
	// it should display the grade average and the highest student grade, student name 
	public void displayCourseStat(){
		JOptionPane.showMessageDialog(null,  course.toString());
	}

}
