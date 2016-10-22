package directaddress;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class DirectMap<V> implements Map<Integer,V> {
	
	private V[] values;
	public DirectMap(int s) {
		this.values = (V[]) new Object[s];
	}

	@Override
	public int size() { // see DirectSet
		// FIXME Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// FIXME Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// FIXME Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// FIXME Auto-generated method stub
		return false;
	}

	@Override
	public V get(Object key) {
		Integer i = (Integer) key;
		return values[i];
	}

	@Override
	public V put(Integer key, V value) {
		// remember what was there and return that
		V old = values[key];
		values[key] = value;
		return old;
	}

	@Override
	public V remove(Object key) {
		// FIXME Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends V> m) {
		// FIXME Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// FIXME Auto-generated method stub
		
	}

	@Override
	public Set<Integer> keySet() {
		// FIXME Auto-generated method stub
		return null;
	}

	@Override
	public Collection<V> values() {
		// FIXME Auto-generated method stub
		return null;
	}

	@Override
	public Set<java.util.Map.Entry<Integer, V>> entrySet() {
		// FIXME Auto-generated method stub
		return null;
	}
	
	public String toString() {
		String ans = "[ ";
		for (int i=0; i < values.length; ++i) {
			if (values[i] != null) {
				ans = ans +   // key
						 "(" + i + ","
						 //value
						 + values[i]
								 + ") ";
			}
		}
		ans = ans + "]";
		return ans;
	}
	
	public static void main(String[] args) {
		DirectMap<String> map = new DirectMap<String>(100);
		System.out.println("Map is initially " + map);
		for (int i=0; i < 20; ++i) {
			if (i%2 == 0) {  // even
				map.put(i, "even");
			}
			else map.put(i, "odd");
		}
		System.out.println("Map after loop " + map);
	}

}
