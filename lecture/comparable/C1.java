package comparable;

import java.awt.Color;

public class C1 extends Color {
	private int red, green, blue;
	
	public C1(int red, int green, int blue) {
		super(red, green, blue);
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public int getIntensity() {
		return ((red+green+blue)/3);
	}

}
