package Inheritance;

public class Dog extends Animal{
	private String breed;
	
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("wooooooof");
	}

	@Override
	public void anAbstractMethod() {
		// TODO Auto-generated method stub
		System.out.println(" and abstract method of a dog class");
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + "]";
	}
	
	
}
