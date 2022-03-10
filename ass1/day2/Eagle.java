package ass1.day2;

public class Eagle extends Bird {
	public Eagle(String name) {
		super(name);
		
	}

	@Override 
	public void fly()
	{
		System.out.println("Eagle name "+getName());
	}

}
