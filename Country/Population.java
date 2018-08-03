import java.util.*;
public class Population {

	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter total number of countries");
		int numberOfCountries=scanner.nextInt();
		
		Country country[]=new Country[numberOfCountries];
		for(int i=0;i<numberOfCountries;i++)
		{
			country[i]=new Country();
		}
		
		for(int i=0;i<numberOfCountries;i++)
		{
			System.out.println("Enter the name of "+(i+1)+" country");
			country[i].setName(scanner.next());
			
			System.out.println("Enter the area of "+(i+1)+" country");
			country[i].setArea(scanner.nextDouble());
			
			System.out.println("Enter the population of "+(i+1)+" country");
			country[i].setPopulation(scanner.nextDouble());
			
		}
		
		
		double max=country[0].getArea();
		String maxArea="0";
		for(int i=0;i<numberOfCountries;i++)
		{
			if(max<country[i].getArea())
			{
				max=country[i].getArea();
				maxArea=country[i].getName();
			}
		}
		
		System.out.println( maxArea +" is the country with maximum area");
		
		double maxPop=country[0].getArea();
		String maxPopulation="0";
		for(int i=0;i<numberOfCountries;i++)
		{
			if(maxPop<country[i].getPopulation())
			{
				maxPop=country[i].getPopulation();
				maxPopulation=country[i].getName();
			}
		}
		
		System.out.println( maxPopulation +" is the country with maximum population");
		
		double populationDensity[]=new double[numberOfCountries];
		for(int i=0;i<numberOfCountries;i++)
		{
			populationDensity[i]=country[i].getArea()/country[i].getPopulation();
			
		}
		double maxPopDen=populationDensity[0];
		String maxPopulationDen="0";
		for(int i=0;i<numberOfCountries;i++)
		{
			if(maxPopDen<populationDensity[i])
			{
				maxPopDen=populationDensity[i];
				maxPopulationDen=country[i].getName();
			}
		}
		
		System.out.println( maxPopulationDen +" is the country with maximum population Density");
		
	}
}
