package variables;

class Dog{
	String name;
	String breed;
	String color;
	
}

public class PassByRef_Exercise {

	public static void main(String[] args) {

		
		Dog dog1 = new Dog();
		dog1.name= "Naayi";
		dog1.breed = " Golden Retriever";
		dog1.color = " Brown";
		
		System.out.println(dog1.name + dog1.breed + dog1.color);
		
		Dog dog2;
		dog2 = dog1;
		dog2.name= "Browny";
		dog2.breed = " Retriever";
		dog2.color = " Browny";
		
		System.out.println(dog2.name + dog2.breed + dog2.color);
		
		System.out.println(dog1.name + dog1.breed + dog1.color);
		
		
	}

}
