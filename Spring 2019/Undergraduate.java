package lab5;

public class Undergraduate extends Student {
	private boolean honors;
	
	public Undergraduate(String major, double g, int c, boolean h) {
		super(major, g, c);
		this.honors = h;
	}
	public boolean isHonors() {
		return honors;
	}

}
