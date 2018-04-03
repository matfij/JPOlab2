package lab2;

public class Ball extends Point
{
	private double radius;
	
	
	Ball()  // konstruktor domyslny
	{
		super(2);
		this.radius = 2;
	}

	Ball(double mass, double radius)  // konstruktor z parametrami
	{
		super(mass);
		this.radius = radius;
	}
	
	
	double centerInertia()  // metoda obliczajaca centralny moment bezwladnosci
	{
		return this.inertia = 2*this.mass*Math.pow(this.radius, 2)/5;
	}
	
	void centerInertia(double inertia)  // metoda przeciazna, wyswietlajaca informacje o bryle
	{
		System.out.println("Kula, masa = " + this.mass + ", promien = " + this.radius + ", centralny moment bezwladnosci = " + inertia);
	}
	
	void Stainer(double centerInertia, double x)  // metoda obliczajaca moment wzgledem osi rownoleglej
	{
		double newInertia = centerInertia + this.mass*Math.pow(x, 2);
		System.out.println("Moment bezwladnosci kuli wzgledem nowej osi oddalonej o " + x + ", wynosi " + newInertia);
	}
	
	
	// gettery i settery
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
		
}
