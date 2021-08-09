package Heap;

import java.util.ArrayList;

public class mergeKSortedList {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());
		
		list.get(0).add(10);
		list.get(0).add(20);
		list.get(0).add(40);
		
		list.get(1).add(5);
		list.get(1).add(12);
		list.get(1).add(15);
		list.get(1).add(50);
		
		list.get(2).add(17);
		list.get(2).add(80);
		
		list.get(3).add(1);
		list.get(3).add(3);
		list.get(3).add(8);
		list.get(3).add(11);
		
		System.out.println(list);

	}

}
