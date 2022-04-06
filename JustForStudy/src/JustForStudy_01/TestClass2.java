package JustForStudy_01;

public class TestClass2 {

	static TestClass2 testClass2 = new TestClass2();
	
	public static void main(String[] args) {
		callClass1();
		testClass2.callClass2();
	}
	
	public static void callClass1() {
		TestClass.starTower_1();
	}
	
	public void callClass2(){
		TestClass.gugudan();
	}
}

class ClassInClass{

	
	
}