
public abstract class Person {
	private String name;
	private String vorname;
	
	
	Person(String n, String v){
		this.name = n;
		this.vorname = v;
	}
	
	public String getName() {
		return this.name;
	}
	public String getVorname() {
		return this.vorname;
	}
	
	public String toString() {
		return this.getName() + ", " + this.getVorname();
	}
}