package arrays;

class Dog{
	String breed;
	int price;
}

public class ObjectInArrays {

	public static void main(String[] args) {

		Dog maxy = new Dog();
		Dog kia = new Dog();
		Dog simba = new Dog();
		
		//Now we have to store these dog objects in Array?
		//Can we store object in array? Yes
		
		Dog [] dogs = new Dog[3];
		dogs[0] = maxy; //now maxy objects address will be refered or stored in dogs[0] , now dog[0] has address of maxy object
		dogs[1] = kia;
		dogs[2] = simba;
		
		kia.breed="lab";
		//or
		dogs[1].breed = "labr";
		dogs[0].breed = "gold";
		dogs[2].breed = "goldador";
		
		System.out.println(dogs[1].breed);
		//or
		for(int i=0; i<dogs.length; i++) {
			System.out.println(dogs[i].breed);
		}
	}

}
