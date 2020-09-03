package lab5;

public class Graduate extends Student {
	private String degree; // "masters" or "PhD"
	private String concentration;
	private int years; // number of years spent in grad school
	
	public Graduate(String major, double g, int c, String deg, String con, int y) {
		super(major, g, c);
		this.degree = deg;
		this.concentration = con;
		this.years = y;
	}
	public int getYears() {
		return years;
	}
	public String getConcentration() {
		return concentration;
	}
	
	

}
