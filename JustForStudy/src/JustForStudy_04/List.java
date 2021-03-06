package JustForStudy_04;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		
		// ArrayList는 배열과 다르게 한계가 없다.
		// 선언시 기본타입을 generic<>으로 정하지 않으면 Object이다.
		ArrayList first =  new ArrayList();
		first.add("First, ");
		first.add("little ");
		first.add("test");
		// 배열과 다르게 length가 아니라 size를 사용한다.
		for(int i=0; i<first.size(); i++) {
			// 선언시 타입을 지정하지 않았을 때에는 값을 담을 때 (Type)을 지정해주어야 한다.
			// 가져올 때에는 first[i]가 아니라 get(i)을 사용한다.
			String result = (String)first.get(i);
			System.out.print(result);
		}
		System.out.print('\n');		//다음줄
		
		ArrayList <Character> second =  new ArrayList<Character>();
		// generic에 String말고 왜 안들어가지...? 했는데
		// char -> Character, int -> Integer 이런식으로 적어야 했음...;
		second.add('j');
		second.add('a');
		second.add('v');
		second.add('a');
		for(int i = 0; i<second.size();i++) {
			System.out.print(second.get(i));
		}
		
	}
}
