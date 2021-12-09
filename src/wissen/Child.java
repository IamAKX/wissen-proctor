package wissen;

public class Child extends Parent{
	void walk() {
		
		System.out.println("Child Walk");
		super.walk();
	}
	
	void run() {
		System.out.println("Child run");
		super.run();
	}
}
