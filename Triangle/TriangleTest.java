import java.util.*;
class TriangleTest {
	public static void main(String args[])
	{
		Triangle triangle=new Triangle();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the 3 sides of the triangle");
		triangle.setSide1(scanner.nextDouble());
		triangle.setSide2(scanner.nextDouble());
		triangle.setSide3(scanner.nextDouble());

		boolean isRightTriangle=triangle.isRight(triangle.getSide1(), triangle.getSide2(), triangle.getSide3());
		if(isRightTriangle==true)
		{
			System.out.println("The triangle is Right Angled Triangle ");
			System.exit(0);
		}
		boolean isScaleneTriangle=triangle.isScalene(triangle.getSide1(), triangle.getSide2(), triangle.getSide3());
		if(isScaleneTriangle==true)
		{
			System.out.println("The triangle is Scalene Triangle ");
			System.exit(0);
		}
		boolean isIsoscelesTriangle=triangle.isIsosceles(triangle.getSide1(), triangle.getSide2(), triangle.getSide3());
		if(isIsoscelesTriangle==true)
		{
			System.out.println("The triangle is Isosceles Triangle ");
			System.exit(0);
		}
		boolean isEquilateralTriangle=triangle.isEquilateral(triangle.getSide1(), triangle.getSide2(), triangle.getSide3());
		if(isEquilateralTriangle==true)
		{
			System.out.println("The triangle is Equilateral Triangle ");
			System.exit(0);
		}
		
		
	}

}
