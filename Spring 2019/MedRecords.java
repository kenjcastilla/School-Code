/*Kendall Castilla
 * 26 April 2019
 * CompSci 1302 Lab Final
 */
package labFinal;

public class MedRecords {
	
	private String name;
	private int age;
	private String bloodType;
	
	public MedRecords(String n, int a, String bT) {
		this.name = n;
		this.age = a;
		this.bloodType = bT;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	public void setAge(int a) {
		this.age = a;
	}
	public void setBloodType(String bT) {
		this.bloodType = bT;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getBloodType() {
		return bloodType;
	}
	
	public boolean compareTo(MedRecords o) {
		if(o instanceof MedRecords) {
			if(name == o.name && age == o.age && bloodType == o.bloodType)
				return true;
			else 
				return false;
		}
		else
			return false;
	}
	
	public String toString() {
		return "(" + name + ": " + age + " yrs, Type " + bloodType + ")";
	}

}
