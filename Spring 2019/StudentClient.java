package lab5;

public class StudentClient {
	public static void main(String[] args) {
		Undergraduate Alex = new Undergraduate("CS", 3.9, 54, true);
		Graduate Mary = new Graduate("Computer Science", 4.10, 0, "Masters", "Cybersecurity", 1);
		
		System.out.println("Alex: " + Alex.getMajor() +", GPA: "+ Alex.getGpa() +", Year "+ Alex.getYear() +", "+ "Honor Student? " + Alex.isHonors());
		System.out.println("Mary: " + Mary.getConcentration() +", Year "+ Mary.getYear() +", "+ Mary.getMajor());
	}
	

}
