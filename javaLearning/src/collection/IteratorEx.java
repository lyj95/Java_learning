package collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * [Iterator] 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화함
 * 			  Iterator는 재사용이 안됨
 * @author Yeji
 * 
 */
public class IteratorEx {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
	
}
