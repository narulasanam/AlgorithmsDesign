package com.snarula.algo.tree;

import java.util.Iterator;
import java.util.List;

public class ListIterator<T> implements Iterator<T> {

	private final Iterator<Iterator<T>> listIterator;
	private Iterator<T> currentIterator;

	public ListIterator(List<Iterator<T>> iterators) {
		listIterator = iterators.iterator();
		currentIterator = listIterator.next();
	}

	@Override
	public boolean hasNext() {
		if (!currentIterator.hasNext()) {
			if (!listIterator.hasNext()) {
				return false;
			}
			currentIterator = listIterator.next();
			hasNext();
		}
		return true;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		if (hasNext()) {
			return currentIterator.next();
		} else {
			return null;
		}
	}

}
