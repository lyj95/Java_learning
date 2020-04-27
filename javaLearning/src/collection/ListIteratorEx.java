package collection;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * [ListIterator] Iterator에 양방향 조회기능 추가(List를 구현한 경우만 사용가능)
 * @author Yeji
 * 
 */
public class ListIteratorEx {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			// hasNext(), next() => 순방향으로 진행하면서 읽어옴
			System.out.print(it.next());		
		}
		System.out.println();
		
		while(it.hasPrevious()) {
			// hasPrevious(), previous() => 역방향으로 진행하면서 읽어옴
			System.out.print(it.previous());
		}
		System.out.println();
	}
	
}
