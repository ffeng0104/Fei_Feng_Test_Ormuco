package ormuco;

import java.util.LinkedHashMap;
import java.util.Map;

public class C{
    LinkedHashMap<Integer, String> lru;

    public C(final int max) {
        lru = new LinkedHashMap<Integer, String>() {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return lru.size() > max;
            }
        };
    }
    
	public void put(int i, String s) {
		lru.put(i, s);
	}

    public static void main(String[] args) {    
        C cache = new C(5);
        cache.put(1, "amazon.com");
		System.out.println(cache.lru);
        cache.put(2, "google.com");
		System.out.println(cache.lru);
        cache.put(3, "apple.com");
		System.out.println(cache.lru);
		cache.put(4, "mcgill.com");
		System.out.println(cache.lru);
		cache.put(5, "concordia.com");
		System.out.println(cache.lru);
		cache.put(6, "bing.com");
		System.out.println(cache.lru);
		cache.put(7, "hotmail.com");
		System.out.println(cache.lru);
		cache.put(8, "gmail.com");
		System.out.println(cache.lru);
    }
}
