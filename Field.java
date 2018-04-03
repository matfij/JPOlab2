package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Field 
{
	public static void main(String args[])
	{
		//stworzenie obiektow klas pochodnych za pomoca konstruktorow z parametrami
		Roller roller1 = new Roller(4, 3, 10);
		Ball ball1 = new Ball(4, 3);
		Rod rod1 = new Rod(4, 3);
		
		//Wyœwietlenie na konsoli informacji dla wszystkich obiektow
		double tempInertia;
		
		tempInertia = roller1.centerInertia();
		roller1.centerInertia(tempInertia);
		
		tempInertia = ball1.centerInertia();
		ball1.centerInertia(tempInertia);
		
		tempInertia = rod1.centerInertia();
		rod1.centerInertia(tempInertia);
		
		//stworzenie tablicy obiektow
		ArrayList<Point> figureList = new ArrayList<Point>();
		
		Point figure1 = new Roller();
		Point figure2 = new Ball();
		Point figure3 = new Rod();
		
		figureList.add(figure1);
		figureList.add(figure2);
		figureList.add(figure3);
		
		//wyswietlenie informacji o obeiktach z tablicy w petli
		System.out.println("\nObiekty z tablicy:\n");
		int i = 0;
		while(figureList.size() > i)
		{
			tempInertia = figureList.get(i).centerInertia();
			figureList.get(i).centerInertia(tempInertia);
			i++;
		}
		
		//wyswietlenie momenotow oddalonych o x wzgledem osi centralnej
		double x = 3;
		System.out.println();
		figure1.Stainer(figure1.getInertia(), x);
		figure2.Stainer(figure2.getInertia(), x);
		figure3.Stainer(figure3.getInertia(), x);
		
		
		//zadanie na ocene bdb
		Scanner input = new Scanner(System.in);
		int choice = 1;
		
		while(choice !=0 )
		{
			System.out.println();
			System.out.println("0 - wyjdz");
			System.out.println("1 - stworz walec");
			System.out.println("2 - stworz kule");
			System.out.println("3 - stworz pret");
			
			choice = input.nextInt();
			
			switch(choice)
			{
				case 0:
				{
					break;
				}
			
				case 1:
				{
					Roller tempRoller = new Roller();
					
					System.out.println("Podaj mase walca: ");
					double tempDouble = input.nextDouble();
					tempRoller.setMass(tempDouble);
					
					System.out.println("Podaj wysokosc walca: ");
					tempDouble = input.nextDouble();
					tempRoller.setHeight(tempDouble);
					
					System.out.println("Podaj promien walca: ");
					tempDouble = input.nextDouble();
					tempRoller.setRadius(tempDouble);
					
					tempDouble = tempRoller.centerInertia();
					tempRoller.centerInertia(tempDouble);
					
					System.out.println("Podaj odleglosc do nowej osi: ");
					tempDouble = input.nextDouble();
					tempRoller.Stainer(tempRoller.getInertia(), tempDouble);
					
					break;
				}
				
				case 2:
				{
					Ball tempBall = new Ball();
					
					System.out.println("Podaj mase kuli: ");
					double tempDouble = input.nextDouble();
					tempBall.setMass(tempDouble);
					
					System.out.println("Podaj promien kuli: ");
					tempDouble = input.nextDouble();
					tempBall.setRadius(tempDouble);
					
					tempDouble = tempBall.centerInertia();
					tempBall.centerInertia(tempDouble);
					
					System.out.println("Podaj odleglosc do nowej osi: ");
					tempDouble = input.nextDouble();
					tempBall.Stainer(tempBall.getInertia(), tempDouble);
					
					break;
				}
				
				case 3:
				{
					Rod tempRod = new Rod();
					
					System.out.println("Podaj dlugosc preta: ");
					double tempDouble = input.nextDouble();
					tempRod.setMass(tempDouble);
					
					System.out.println("Podaj promien preta: ");
					tempDouble = input.nextDouble();
					tempRod.setLenght(tempDouble);
					
					tempDouble = tempRod.centerInertia();
					tempRod.centerInertia(tempDouble);
					
					System.out.println("Podaj odleglosc do nowej osi: ");
					tempDouble = input.nextDouble();
					tempRod.Stainer(tempRod.getInertia(), tempDouble);

					break;
				}
				
				default:
				{
					System.out.println("niepoprawny wybor, sprobuj ponownie...");
				}
			}
		}
		
		input.close();
		
	}
	
}
