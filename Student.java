
public class Student extends Person {
	private int matnummer;
	
	Student(String n, String v, int m){
		super(n, v);
		this.matnummer = m;
	}
	public int getMatrikel() {
		return this.matnummer;
	}
	public String toString() {
		return super.toString() + " " + this.getMatrikel();
	}
	
	
	public static void main (String [] args) {
		Student a = new Student("Kleber", "Klaus", 12345);
		System.out.println(a);
	}
}
