package collection;

import java.util.ArrayList;


public class ArrayColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		
		
		
		System.out.println("array list "+list);
	}

}
