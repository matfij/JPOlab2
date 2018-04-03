package lab2;

public class Point 
{
	protected double mass;  
	protected double inertia; 
	
	Point()  // konstruktor domyslny
	{
		this.mass = 10;
	}
	
	Point(double mass)  // konstruktor z parametrem
	{
		this.mass = mass;
	}

	
	double centerInertia()  // obicza moment bezwladnosci od osi oddalonej o 1
	{
		return this.inertia = this.mass * Math.pow(1, 2);		
	}	
	
	void centerInertia(double inertia)  // obicza centralny moment bezwladnosci
	{
		System.out.println("...some info...inertia..." + inertia);	
	}
	
	void Stainer(double centerInertia, double x)  // metoda obliczajaca moment wzgledem osi rownoleglej
	{
		double newInertia = centerInertia + this.mass*Math.pow(x, 2);
		System.out.println("Moment bezwladnosci wzgledem nowej osi oddalonej o " + x + ", wynosi " + newInertia);
	}
	
	
	//gettery i settery
	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getInertia() {
		return inertia;
	}

}
