package day1.examples;

public class Chicken extends Birds {

	public Chicken(int age, String gender, int weightInLbs, String name) {
		super(age, gender, weightInLbs, name);
	}
	
	
	public void fly(){
		System.out.println("Chickens don't fly...."+super.name);
	}
	

}
