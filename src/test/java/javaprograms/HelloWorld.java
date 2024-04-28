package javaprograms;

import org.testng.annotations.Test;

public class HelloWorld {
	@Test
	public void helloWorldMethod() {
		System.out.println("Hello World ...!");
	}

	public void findStringLength() {
		String str = "Hello";
		System.out.println(str.length());
	}
}
