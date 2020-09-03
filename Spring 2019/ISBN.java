/*Kendall Castilla
 * HW1
 */
package homework1;

public class ISBN {
	private String digits;
	private String checkSymbol;
	
	public ISBN(String d,String cs) {
		this.digits = d;
		this.checkSymbol = cs;
	}
	public String getDigits() {
		return digits;
	}
	public String getCheckSymbol() {
		return checkSymbol;
	}
	
	public boolean isValid() {
		int i=0, x=1;
		int sum=0;
		while(i<digits.length()) {
			sum+= (x*(int)(digits.charAt(i)));
			i++;
			x++;
		}
		int checkSum = sum/11;
		if(checkSum < 10) {
			return true;
		}
		else {
			this.checkSymbol = "X";
			return false;
		}
		
	}
	public String toString() {
		return digits.substring(0, 1) + "-"+digits.substring(1, 4) + "-" + digits.substring(4) +"-"+ checkSymbol;
	}

}
