package wissen;

public class A {
	public synchronized void m1(String s) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println(s);
	}
}
