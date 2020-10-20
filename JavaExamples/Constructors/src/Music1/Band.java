package Music1;

public class Band {
	
	private String bandName;
	private int coolnessFactor;
	
	public Band() {
		// TODO Auto-generated constructor stub
	}
	
	public Band(String bandName, int coolessFactor ) {
		this.bandName = bandName;
		this.coolnessFactor = coolessFactor;
	}

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public int getCoolnessFactor() {
		return coolnessFactor;
	}

	public void setCoolnessFactor(int coolnessFactor) {
		this.coolnessFactor = coolnessFactor;
	}
	
}
