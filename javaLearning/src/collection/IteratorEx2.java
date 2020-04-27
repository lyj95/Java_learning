package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		for(int i=0 ; i<10 ; i++) {
			list.add(i);
		}
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {	// Iterator의 remove()는 단독으로 쓰일 수 없고, next()와 같이 써야함
			it.next();
			it.remove();
			System.out.println("list : " + list);
		}
		
	}
}
