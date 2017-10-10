package day1.examples;

public abstract class Animals {
	
	int age;
	String gender;
	int weightInLbs;
	String name;
	
	public Animals(int age, String gender, int weightInLbs, String name) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
		this.name = name;
	}

	public void eat(){
		System.out.println("Eating...");
	}
	
	public void sleep(){
		System.out.println("Sleeping...");
	}
	
	public void animalDetails(){
		
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Gender: "+this.gender);
		System.out.println("Weight in LBS: "+this.weightInLbs);
		
	}
	
	public abstract void move();
	
}
