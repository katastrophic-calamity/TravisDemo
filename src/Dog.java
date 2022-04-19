/**
 * 
 */

/**
 * @author khanr
 *
 */
public class Dog extends Animal {
	public void getInfo() {
	    System.out.println("My name is " + name);
	  }	
	// overriding the eat() method
	  @Override
	  public void eat() {

	    // call method of superclass
	    super.eat();
	    System.out.println("I eat dog food");
	  }

	  // new method in subclass
	  public void bark() {
	    System.out.println("I can bark");
	  }
}
