package wissen;

public class Parent {
	void walk() {
		System.out.println("Parent Walk");
	}
	
	void run() {
		System.out.println("Parent run");
		walk();
	}
}
