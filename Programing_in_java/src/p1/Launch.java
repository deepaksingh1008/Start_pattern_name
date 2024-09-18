package p1;

class Dog {
	String name;
	String color;
	int age;
	int cost;
	String breed;
   void run() {
	   System.out.println(name+" run");
   }
   void eat() {
	   System.out.println(name+" eat");
   }
  
	
}

public class Launch {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		System.out.println(d1.name);
		System.out.println(d1.color);
		System.out.println(d1.age);
		System.out.println(d1.cost);
		System.out.println(d1.breed);
		System.out.println("===================");
		
		d1.name="Rockey";
		d1.color="brown";
		d1.age=4;
		d1.cost=6000;
		d1.breed="RD";
		
		
		System.out.println(d1.name);
		System.out.println(d1.color);
		System.out.println(d1.age);
		System.out.println(d1.cost);
		System.out.println(d1.breed);
		System.out.println("===================");
		d1.run();
		d1.eat();
		 

	}

}
