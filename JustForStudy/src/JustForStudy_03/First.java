package JustForStudy_03;

public class First {
	public static void main(String[] args) {
		Second second = new Second();
		second.aaa();
		
		Third third = new Third();
		System.out.println(third.ccc(2));
		
		System.out.println(second.aaaa() + " " + third.cccc());
	}
}
