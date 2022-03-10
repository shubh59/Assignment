package ass1.day2;

public class BirdMain {

	public static void main(String[] args) {
		Bird b = new Parrot("Parrot1");
		b.fly();
		b = new Eagle("Eagle1");
		b.fly();
		b = new Duck("Duck1");
		b.fly();
		b = new Parrot("Parrot2");
		b.fly();
	}

}
