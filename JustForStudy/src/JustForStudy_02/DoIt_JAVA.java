package JustForStudy_02;

public class DoIt_JAVA {

	public static void main(String[] args) {
		print01();
		testClass testCome = new testClass();
		testCome.instanceMethod();
		
	}

	public static void print01() {
		System.out.println("test");
	}

}

class testClass {
	public void nonStatic() {
		System.out.print("I am nonStatic.");
	}

	public void instanceMethod() {
		nonStatic();
	}

	public static void methodInClass() {
	//	nonStatic(); - Error
	}
	
}
