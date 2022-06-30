
public class Boxer extends Person {
	private int gewicht;
	
	Boxer(String n, String v, int g){
		super(n, v);
		this.gewicht = g;
	}
	public int getGewicht() {
		return this.gewicht;
	}
	public String toString() {
		return super.toString() + " " + this.getGewicht();
	}
}
