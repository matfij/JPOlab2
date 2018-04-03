package lab2;

public class Roller extends Point
{
	private double radius;
	private double height;
	
	
	Roller()  // konstruktor domyslny
	{
		super(2);
		this.radius = 4;
		this.height = 1;
	}
	
	Roller(double mass, double radius, double height)  // konstruktor z parametrami
	{
		super(mass);
		this.radius = radius;
		this.height = height;
	}
	
	
	double centerInertia()  // metoda obliczajaca centralny moment bezwladnosci
	{
		return this.inertia = this.mass*Math.pow(this.radius, 2)/2;
	}
	
	void centerInertia(double inertia)  // metoda przeciazna, wyswietlajaca informacje o bryle
	{
		System.out.println("Walec, masa = " + this.mass + ", promien = " + this.radius + ", wysokosc = " + this.height);
		System.out.println("Centralny moment bezwladnosci = " + inertia);
	}
	
	void Stainer(double centerInertia, double x)  // metoda obliczajaca moment wzgledem osi rownoleglej
	{
		double newInertia = centerInertia + this.mass*Math.pow(x, 2);
		System.out.println("Moment bezwladnosci walca wzgledem nowej osi oddalonej o " + x + ", wynosi " + newInertia);
	}

	
	// gettery i settery
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
