package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx {
	public static void main(String[] args) {
		int[]	arr   =  {0,1,2,3,4};
		int[][] arr2D =  {{11,12,13}, {21,22,23}};

		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D));		// deepToString() => 2,3 차원 배열 을 문자열로 변환
		
		// copyOf() => 배열 전체 복사  ('0'번 째 배열 부터)
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);          
		int[] arr4 = Arrays.copyOf(arr, 7);          
		// copyOfRange() => 배열 일부를 복사 (지정된 범위의 끝은 포함 안함)
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);  
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);  

		System.out.println("arr2="+ Arrays.toString(arr2));
		System.out.println("arr3="+ Arrays.toString(arr3));
		System.out.println("arr4="+ Arrays.toString(arr4));
		System.out.println("arr5="+ Arrays.toString(arr5));
		System.out.println("arr6="+ Arrays.toString(arr6));

		int[] arr7 =  new int[5];
		
		// fill() => 배열의 모든 요소를 지정된 값으로 채움
		Arrays.fill(arr7, 9);  // arr=[9,9,9,9,9]
		System.out.println("arr7="+Arrays.toString(arr7));

		// setAll() => 배열을 채우는ㄴ데 사용할 함수형 인터패이스를 매개변수로 받음
		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
		System.out.println("arr7="+Arrays.toString(arr7));

		for(int i : arr7) {
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i);
		}

		String[][] str2D  = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		
		// equals() => 두 배열에 저장된 모든 요소를 비교 (일차원 배열만 가능)
		System.out.println(Arrays.equals(str2D, str2D2));      // false
		// deepEquals() => 다차원 배열의 모든 요소를 비교
		System.out.println(Arrays.deepEquals(str2D, str2D2));  // true

		char[] chArr = { 'A', 'D', 'C',  'B', 'E' };

		int idx = Arrays.binarySearch(chArr, 'B');
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));
		System.out.println("= After sorting =");
		Arrays.sort(chArr);
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));
		
		
		String[] strr = {"aa","bb","cc","dd"};
		
		List<String> list1 = Arrays.asList(strr);
		System.out.println(list1);
//		list1.add("ee");	// list1의 크기를 변경할 수 없음
		
		// 변경할 수 있는 List가 필요하다면 다음과 같이 
		List<String> list = new ArrayList<String>(Arrays.asList(strr));
		
		System.out.println("list : "+list);
		list.add("ee");
		System.out.println("after list : "+list);
		
	}
}
