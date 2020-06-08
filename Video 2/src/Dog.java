
public class Dog extends Animal {
	
	
	public void rubDog() {
		System.out.println("The dog wags its tail.");
		super.sleep();
	}
	
	@Override
	public void sleep() {
		System.out.println("The dog goes to sleep.");
	}
}
