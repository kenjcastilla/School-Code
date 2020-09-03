package lab5;

public class Student {
	private String major;
	private double gpa;
	private int creditHours;
	
	public Student(String m, double g, int c) {
		this.major = m;
		this.gpa = g;
		this.creditHours = c;
		
	}
	public String getMajor() {
		return major;
	}
	public double getGpa() {
		return gpa;
	}
	public String getYear() {
		if(creditHours < 32)
			return "Freshman";
		else if((creditHours >= 32) && (creditHours < 64))
			return "Sophomore";
		else if((creditHours >= 64) && (creditHours < 96))
			return "Junior";
		else 
			return "Senior";
	}

}
