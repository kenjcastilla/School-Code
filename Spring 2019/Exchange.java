package lab5;

public class Exchange extends Undergraduate {
	private String country;
	private String year; //start year and season of exchange program e.g. Fall 2017
	
	public Exchange(String major, double g, int c, boolean h, String country, String year) {
		super(major, g, c, h);
		this.country = country;
		this.year = year;
	}
	public String getYear() {
		return year;
	}
	public String getCountry() {
		return country;
	}
	

}
