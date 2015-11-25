package com.snarula.algo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import com.snarula.algo.tree.ListIterator;

public class ListIteratorTest {
	
	public static void main(String arg[]) {
		final Iterator<Integer> a = Arrays.asList(1,2,3,4,5).iterator();
		final Iterator<Integer> b = new ArrayList<Integer>().iterator();
		
		ListIterator<Integer> lItr = new ListIterator<Integer>(Arrays.asList(a,b));
		while(lItr.hasNext())
			System.out.println(lItr.next());
	}
}
