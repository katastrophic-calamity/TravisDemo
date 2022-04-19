/**
 * 
 */

/**
 * @author khanr
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create an object of the subclass
		Dog labrador = new Dog();
	    // access protected field and method
	    // using the object of subclass
	    labrador.name = "Rocky";
	    labrador.display();
	    labrador.getInfo();
	 // call the eat() method
	    labrador.eat();
	    labrador.bark();
	}

}
