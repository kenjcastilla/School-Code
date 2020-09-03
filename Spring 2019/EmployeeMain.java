/*Kendall Castilla
 * 7 March 2019
 * Homework 2
 */
package homework2;


public class EmployeeMain {
	public static void printEmployee(Employee obj) {
		System.out.println("Salary: $" + obj.getSalary());
		System.out.println("Hours: " + obj.getHours());
		System.out.println("Vacation Days: " + obj.getVacationDays());
		System.out.println("Vacation Form: " + obj.getVacationForm());
		if(obj instanceof Lawyer) 
			((Lawyer) obj).sue();
		else if(obj instanceof Janitor)
			((Janitor) obj).clean();
	}
	public static void main(String[] args) {
		Lawyer John = new Lawyer();
		Janitor Gus = new Janitor();
		HarvardLawyer Dwayne = new HarvardLawyer();
		
		
	}

}
