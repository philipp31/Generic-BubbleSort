
public class Rechteck implements Comparable<Rechteck> {	// Implementierung des Comparable Interface für die Sortierung des eigenen Datentyps
	private double length;
	private double width;
	public double area;
	
	public Rechteck(double length, double width) {
		this.length = length;
		this.width = width;
		this.area = length*width;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	@Override
	public int compareTo(Rechteck o) {
		if( this.area > o.area ) {
			return 1;
		}
		else if( this.area < o.area ) {
			return -1;
		}
		else {
			return 0;
		}
	}	//ist das objekt kleiner -> -1, ist es größer -> 1, gleich -> 0

}