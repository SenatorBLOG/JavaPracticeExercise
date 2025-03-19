package Inheritance;

public class AnimaalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal animal = new Animal(); cannot create an object of abstract class
		BankAccount ba1 = new BankAccount(132,3323);
		BankAccount ba2 = new BankAccount(111,2222);
		
		if(ba1.equals(ba2))
			System.out.println("same account");
		else
			System.out.println(" different account");
		
		WorkingDog wd = new WorkingDog();
		wd.setTraningHours(220);
		wd.setName("aa");
		wd.setBreed("bb");
		wd.work();
		
		
		Animal animal;
		animal = new Dog();
		animal.setName("Barbos");
		animal.speak();
		
		animal = new Cat();
		animal.setName("Oreo");
		animal.speak();
		
		Animal[] animalArray = new Animal[4];
		animalArray[0] = new Dog();
		animalArray[1] = new Cat();
		animalArray[2] = new Cat();
		animalArray[3] = new Dog();
		
		for(int i = 0; i<animalArray.length;i++) {
			animalArray[i].speak();
		}
		
		
		/*Dog d = new Dog();
		d.setName("Tom");
		d.setBreed("122");
		d.speak();
		
		Cat c = new Cat();
		c.setColor("orange");
		c.setName("Kitkat");
		c.speak();*/
		
		
	}

}
