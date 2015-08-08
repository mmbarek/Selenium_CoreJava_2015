package useSuperKeyword;

public class StudentGpa extends Student {
	double gpa;
	public StudentGpa(String name,String grade, double gpa) {
		super(name,grade);
		this.gpa = gpa;
		System.out.println("is"+ " " + name);
		System.out.println("His gpa is: "+ gpa);
		
		
	}



	
}

