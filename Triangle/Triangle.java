
public class Triangle {
	private double side1;
	private double side2;
	private double side3;
	
	
	
	public double getSide1() {
		return side1;
	}
	
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	
	public double getSide2() {
		return side2;
	}
	
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	
	public boolean isRight(double side1,double side2,double side3)
	{
		if(side1*side1==(side2*side2+side3*side3))
		{
			return true;
		}
		else if(side2*side2==(side1*side1+side3*side3))
		{
			return true;
		}
		else if(side3*side3==(side1*side1+side2*side2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isScalene(double side1,double side2,double side3)
	{
		if(side1==side2)
		{
			return false;
		}
		else if(side2==side3)
		{
			return false;
		}
		else if(side1==side3)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public boolean isIsosceles(double side1,double side2,double side3)
	{
		if(side1==side2 && side2==side3)
		{
			return false;
		}
		else if(side2==side3)
		{
			return true;
		}
		else if(side1==side3)
		{
			return true;
		}
		else if(side1==side2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEquilateral(double side1,double side2,double side3)
	{
		if(side1==side2 && side2==side3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
