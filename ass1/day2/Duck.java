package ass1.day2;

public class Duck extends Bird{
	public Duck(String name) {
		super(name);
	}

	@Override
	public void fly()
	{
		System.out.println("Duck name "+getName());
	}

}
