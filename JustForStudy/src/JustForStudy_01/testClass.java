package JustForStudy_01;
// 코드 막 연습하는 클라스입니다.
public class TestClass {
	
	public static String star = "*";
	
	public static void main(String[] args) {
		// gugudan();
		// starTower_1();
		// starTower_2();
		starTower_3();
	}
	// *별찍기3
	private static void starTower_3() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// *별찍기2
	private static void starTower_2() {
		for(int i=1; i<6; i++) {
			for(int j=5; j>0; j--) {
				if(j > i) {
					System.out.print(" ");
				} else {
					System.out.print(star);
				}
				
			}
			System.out.println("");
		}
	}
	// *별찍기1
	// 왜 원리를 자꾸 까먹냐ㅠㅠ 
	public static void starTower_1() {
		for(int i=1; i<6; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(star);
			}
			System.out.println("");
		}
	}
	// 구구단 5단	
	public static void gugudan() {
		for(int i = 1; i <= 9; i++){
			System.out.println("5 x " + i + " =  " + 5*i);
		}
				
	}
}
