package day1.examples;

public class Fish extends Animals{
	
	public Fish(int age, String gender, int weightInLbs, String name) {
		super(age, gender, weightInLbs, name);
	}

	public void swim(){
		System.out.println("Swimming...");
	}

	
	public void move() {
		System.out.println("Fish is swimming.....");
		
	}
}
