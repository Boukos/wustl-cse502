package hashcodefun;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Point {
	
	private int x,y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return x + y;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Set<Point> points = new HashSet<Point>();
		points.add(new Point(1,2));
		points.add(new Point(1,2));
		
		System.out.println("Set is " + points);
	}
	

}
