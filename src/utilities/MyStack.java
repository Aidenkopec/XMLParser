package utilities;
import java.util.*;
import java.util.EmptyStackException;

/**
 * Class of MyStack type that implements stackADT and uses MyArrayList
 * @author Aiden
 *
 * @param <E>
 */
public class MyStack<E> implements StackADT<E> {
	
	public MyArrayList<E> Arr = new MyArrayList <E>();
	public MyIterator iter;

	@Override
	public void push(E toAdd) throws NullPointerException {
		Arr.add(toAdd);
	}

	@Override
	public E pop() throws EmptyStackException {
		try {
			return Arr.remove((Arr.size()-1));
		}catch (Exception e){
			throw new EmptyStackException();
		}
	}

	@Override
	public E peek() throws EmptyStackException {
		try{
			return Arr.get((Arr.size()-1));
		}catch (Exception e){
			throw new EmptyStackException();
		}
	}

	@Override
	public void clear() {
		Arr.clear();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return Arr.isEmpty();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return Arr.toArray();
	}

	@Override
	public E[] toArray(E[] holder) throws NullPointerException {
		// TODO Auto-generated method stub
		return Arr.toArray(holder);
	}

	@Override
	public boolean contains(E toFind) throws NullPointerException {
		// TODO Auto-generated method stub
		return Arr.contains(toFind);
	}

	@Override
	public int search(E toFind) {
		int i = 0;
		iter = (MyIterator) iterator();
		while (iter.hasNext()) {
			if (toFind.equals(iter.next())) {
				return i;
			}
			i++;
		}
		
		return -1;
	}

	@Override
	public Iterator<E> iterator() {
		return new MyIterator (Arr.toArray());
	}

	@Override
	public boolean equals(StackADT<E> that) {
		Object[] arr1 = this.toArray();
		Object[] arr2 = that.toArray();
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i =0; i< arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		
		return true;
	}

	@Override
	public int size() {
		return Arr.size();
	}
	
}
