package ass2.day2;

public class Triangle extends Figure {
	public Triangle(int dimension1, int dimension2) {
		super(dimension1, dimension2);
	}
	@Override
	public void Area()
	{
		System.out.println("Area Of Triangle is "+""+(dimension1*dimension2)/2);
	}


}
