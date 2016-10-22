package demomap;

import spath.graphs.Edge;
import spath.graphs.Vertex;

//
// We decided against this, us a map  edge -->  weight  instead
//
public class WeightedEdge extends Edge {
	private int weight;
	
	public WeightedEdge(Vertex from, Vertex to, int weight) {
		super(from, to);
		this.weight = weight;
	}

	
	

}
