package pillar_of_oops;

class Animal {
	void eat() {
		System.out.println("it eats");
	}
}
class Dog extends Animal {
	void bark() {
		System.out.println("it barks");
	}
}
class Puppy extends Dog {
	void puppy_dog() {
		System.out.println(" puppy is too small");
	}
}
public class inheritance {
   public static void main(String [] args) {
	   Puppy d = new Puppy();
	   d.puppy_dog();
	   d.bark();
	   d.eat();
	   
   }
}
