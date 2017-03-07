package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapSortTest {
	public static void main(String[] args) {
	//	Map<String, Object> map = new LinkedHashMap<>();//按照插入的顺序
	//	Map<String, Object> map = new HashMap<>();
		Map<String, Object> map = new TreeMap<>();//
		map.put("a", "123");
		map.put("e", "123");
		map.put("c", "123");
		map.put("d", "123");
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
