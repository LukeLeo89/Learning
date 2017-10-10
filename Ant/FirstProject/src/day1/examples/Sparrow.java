package day1.examples;

public class Sparrow extends Birds implements Flyable {

	public Sparrow(int age, String gender, int weightInLbs, String name) {
		super(age, gender, weightInLbs, name);
	}

	
	public void fly() {
		System.out.println("Sparrows flying....");
		
	}
	
	

}
