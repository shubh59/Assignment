package ass1.day2;

public class Parrot extends Bird {
	public Parrot(String name) {
		super(name);
	}

	@Override 
	public void fly()
	{
		System.out.println("Parrot name "+getName());
	}

}
