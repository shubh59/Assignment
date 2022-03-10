package ass2.day2;

public class Rectangle extends Figure {
	public Rectangle(int dimension1, int dimension2)
	{
		super(dimension1, dimension2);
	}
	@Override
	public void Area()
	{
		System.out.println("Area Of Rectangle is "+""+dimension1*dimension2);
	}

}
