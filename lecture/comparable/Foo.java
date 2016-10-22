package comparable;

import java.awt.Color;

public class Foo<T> {
	
	final private T thing1, thing2;
	public Foo(T thing1, T thing2) {
		this.thing1 = thing1;
		this.thing2 = thing2;
	}
	
	/**
	 * is thing1 smaller than thing2?
	 * @return
	 */
	public boolean firstIsSmaller() {
		//  we have no way to answer this based on T
		//
		// do the python thing.  Make thing1 and thing2 implement comparable.
		//   Let's hope that turns out well..
		if (!(thing1 instanceof Comparable)) {
			throw new Error("this my error haha java");
			
		}
		Comparable<T> t1 = (Comparable<T>) thing1;
		//
		// if (t1.compareTo(thing2) < 0)
		//    return true;
		// else return false;
		return t1.compareTo(thing2) < 0;
	}
	
	public static void main(String[] args) {
		Foo<String> stringFoo = new Foo<String>("abc", "abc");
		System.out.println("thing1 < thing2? " + stringFoo.firstIsSmaller());
		
		Foo<Integer> intFoos = new Foo<Integer>(247, 131);
		System.out.println("num smaller first than second? " + intFoos.firstIsSmaller());
		
		Foo<Color>  colorFoo = new Foo<Color>(Color.RED, Color.GREEN);
		System.out.println("Expect a loud noise: " + colorFoo.firstIsSmaller());
	}

}
