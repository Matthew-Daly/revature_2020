package Music1;

public class MusicianMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Musician m1=new Musician("Dave", "Red Hat", "Drums");
		System.out.println("Printing musician...");
		m1.printMusician();
		
		Band b1=new Band("Snail Snot From Hell", 10);
		
		Musician m2=new Musician("Mary", "DeathSpiller", "Screaming");
		m2.setBand(b1);
		System.out.println("Printing musician...");
		m2.printMusician();

	}

}
