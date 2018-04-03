package lab2;

public class Rod extends Point
{
	private double lenght;
	
	
	Rod()  // konstruktor domyslny
	{
		super(2);
		this.lenght = 6;
	}
	
	Rod(double mass, double lenght)  // konstruktor z parametrami
	{
		super(mass);
		this.lenght = lenght;
	}
	
	
	double centerInertia()  // metoda obliczajaca centralny moment bezwladnosci
	{
		return this.inertia = this.mass*Math.pow(this.lenght, 2)/12;
	}
	
	void centerInertia(double inertia)  // metoda przeciazna, wyswietlajaca informacje o bryle
	{
		System.out.println("Pret, masa = " + this.mass + ", dlugosc = " + this.lenght + ", centralny moment bezwladnosci = " + inertia);
	}
	
	void Stainer(double centerInertia, double x)  // metoda obliczajaca moment wzgledem osi rownoleglej
	{
		double newInertia = centerInertia + this.mass*Math.pow(x, 2);
		System.out.println("Moment bezwladnosci preta wzgledem nowej osi oddalonej o " + x + ", wynosi " + newInertia);
	}
	

	// gettery i settery
	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	
}
