package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void getMap(Map<Integer, String> map) { // 메소드의 매개값으로도 받을 수 있음
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			Integer num = iter.next();
			if (num >= 80) {
				String val = map.get(num);
				System.out.println(val);
			}
		}
	}

	public static void main(String[] args) {
		Map<Integer, String> scores = new HashMap<>();
		scores.put(90, "Hong");
		scores.put(78, "Hwang");
		scores.put(80, "Park");
		
		System.out.println("80이상인 학생");
		getMap(scores);
		System.out.println("=============");
		
		
		
		List<String> list = new ArrayList<>();
		list.add("Hong");
		list.get(0);

		Set<String> set = new HashSet<>(); // ArrayList와 다르게 위치(인덱스값)가 따로 없고 중복되는 값을 받을 수 없다.
		set.add("Hong");
		set.add("Hwang");
		Iterator<String> iterator = set.iterator();// 가져온다는 뜻
		while (iterator.hasNext()) {// hasNext()가져올 게 남아 있는지 확인하는 것
			String str = iterator.next(); // next() 값을 가져 오는것
			System.out.println(str.toString());
		}

		Map<String, Integer> map = new HashMap<>(); // 키와 밸류 형식을 담는다
		// key:value -> 이거 자체가 데이터 타입임 Map.Entry
		map.put("Hong", 98);
		map.put("Hwang", 90);
		map.put("Hong", 80); // 같은 키 값을 가지고 있으면 원래키값안의 밸류가 대치된다.

		Set<String> keySet = map.keySet();// 키값만 가져 와서 담는다. 키부분에 해당되는 부분을 set 컬렉션에 담는 다는 의미
		Iterator<String> keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			String key = keyIter.next();
			Integer value = map.get(key); // 맞는 키에 해당하는 밸류 값을 리턴 해줌
			System.out.println("key: " + key + ", value: " + value);
		}

		Set<Entry<String, Integer>> entSet = map.entrySet();// 키와 밸류를 한번에 담는 타입이 entry이다
		Iterator<Entry<String, Integer>> entIter = entSet.iterator();
		while (entIter.hasNext()) {
			Entry<String, Integer> entry = entIter.next();
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("key: " + key + ", value: " + val);
		}
	}
}
