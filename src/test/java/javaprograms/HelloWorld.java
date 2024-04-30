package javaprograms;

import org.testng.annotations.Test;

public class HelloWorld {
	@Test
	public void helloWorldMethod() {
		System.out.println("Hello World ...!");
	}

	@Test
	public void findStringLength() {
		String str = "Hello";
		System.out.println(str.length());
	}
	
	public void newTestMethod() {
		System.out.println("This is the test method")
	}
}
