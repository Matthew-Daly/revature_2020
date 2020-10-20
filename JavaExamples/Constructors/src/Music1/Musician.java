package Music1;

public class Musician {

	private String name;
	private String stageName;
	private String instrument;
	private Band band;
	
	public Musician() {
	
	}
	
	public Musician(String name, String stageName, String insrument) {
		this.name = name;
		this.stageName = stageName;
		this.instrument = insrument;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	
	
	public void printMusician() {
		System.out.println("name : "+name);
		System.out.println("stage name : "+stageName);
		if(band!=null) {
			System.out.println("Band Details");
			System.out.println("Band : "+band.getBandName());
			System.out.println("Coolness Factore : "+band.getCoolnessFactor());
		}else {
			System.out.println("Rocker doesn't have any band");
		}
		
	}
	
	public Band getBand() {
		return band;
		
	}
	
	public void setBand(Band band) {
		this.band = band;
	}
	
	

}
