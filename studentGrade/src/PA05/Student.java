package PA05;

public class Student {
	
	private int id;
	private String name;
	private static int noOfStudents = 0;

	// complete student object constructor
	public Student (int id, String name){
		// increment noOfStudents by one for each new instantiated Student object
		this.id = id;
		this.name = name;
		noOfStudents++;		
	}
	// compete public getter and setter methods
	public int getId()
	{
		return id; 
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public static int getNoOfStudents()
	{
		return noOfStudents;
	}
	public static void setNoOfStudents(int noOfStudents)
	{
		Student.noOfStudents = noOfStudents;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
