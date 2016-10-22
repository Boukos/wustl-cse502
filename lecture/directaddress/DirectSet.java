package directaddress;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class DirectSet implements Set<Integer> {

	private boolean[] T;
	private int size;

	/**
	 * An array like T in the picture on the slide, from 0... size-1
	 * @param size
	 */
	public DirectSet(int s) {
		T = new boolean[s];
		this.size = 0;
	}

	@Override
	public int size() {
		// following takes Theta(n) time
//		int ans = 0;
//		for (int i=0; i < T.length; ++i) {
//			if (T[i]) {
//				++ans;
//			}
//		}
//		return ans;
		return this.size;  // Theta(1) time !
		
	}

	@Override
	public boolean isEmpty() {
		return this.size() == 0;
	}

	@Override
	public boolean contains(Object o) {
		// Object o is really an Integer -- it has to be!
		Integer i = (Integer) o;  // this should not fail
		//
		//  if T[i] == true
		//     return true;
		//  else return false;
		return T[i];
	}

	@Override
	public Iterator<Integer> iterator() {
		// FIXME Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// FIXME Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// FIXME Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Integer e) {
		// use e as an index into my T array
		// figure out whether it's already there or not
		if (T[e]) {
			return false;  // already there, no action needed
		}
		else {
			T[e] = true;
			this.size = this.size + 1;
			return true;  // because we had to add it, it wasn't alreaady there
		}
	}

	@Override
	public boolean remove(Object o) {
		// if it's already there, get rid of it and return true
		Integer i = (Integer) o;
		if (T[i]) {
			T[i] = false;
			this.size = this.size - 1;
			return true;
		}
		else return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// FIXME Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		// FIXME Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// FIXME Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// FIXME Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// FIXME Auto-generated method stub

	}
	
	public String toString() {
		String ans = "{ ";
		for (int i=0; i < T.length; ++i) {
			if (T[i]) {
				ans = ans + i + " ";
			}
		}
		ans = ans + "}";
		return ans;
	}
	
	public static void main(String[] args) {
		DirectSet s = new DirectSet(100);
		System.out.println("Empty set is " + s);
		s.add(21);
		System.out.println("Now we have " + s);
		for (int i=14; i < 17; ++i) {
			s.add(i);
		}
		System.out.println("Finally " + s);
		s.remove(15);
		System.out.println("no 15? " + s);
		System.out.println("size is " + s.size());
		
	}

}
