package comparable;

import java.awt.Color;

//
// insist that T can compare itself against other Ts
public class Bar<T extends Comparable<T>> {
	
	final private T thing1, thing2;
	public Bar(T thing1, T thing2) {
		this.thing1 = thing1;
		this.thing2 = thing2;
	}
	
	public boolean firstIsSmaller() {
		return thing1.compareTo(thing2) < 0;  // I know this will work
	}

	public static void main(String[] args) {
		Bar<String> stringFoo = new Bar<String>("abc", "abc");
		System.out.println("thing1 < thing2? " + stringFoo.firstIsSmaller());
		
		Bar<Integer> intFoos = new Bar<Integer>(247, 131);
		System.out.println("num smaller first than second? " + intFoos.firstIsSmaller());
//
// uncomment below to see the compile-time error
//   because Color does not implement Comparable
//
//		Bar<Color>  colorFoo = new Bar<Color>(Color.RED, Color.GREEN);
//		System.out.println("Expect a loud noise: " + colorFoo.firstIsSmaller());
	}

}
