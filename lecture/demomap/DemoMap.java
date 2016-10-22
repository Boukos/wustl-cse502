package demomap;

import java.util.HashMap;
import java.util.Map;

import spath.graphs.Edge;
import spath.graphs.Vertex;

public class DemoMap {

	public static void main(String[] args) {
		Map<String, Vertex> vmap = new HashMap<String,Vertex>();
		Map<Edge, Integer> weights = new HashMap<Edge,Integer>();
		Vertex vdog = new Vertex();
		Vertex vcat = new Vertex();
		vmap.put("Dog", vdog);
		vmap.put("Meow", vcat);
		Edge e = new Edge(vdog, vcat);
		weights.put(e, 100);
		System.out.println("Edge is " + e);
		System.out.println("Vertex for Meow is " + vmap.get("Meow"));
		System.out.println("Weight of my edge is " + weights.get(e));
	}

}
