package org.example;

import java.util.HashMap;
import java.util.Map;

public class CacheSingleton {
    private static CacheSingleton instance;
    private final Map<String, CacheItem> cache;

    private CacheSingleton() {
        cache = new HashMap<>();
    }

    public static synchronized CacheSingleton getInstance() {
        if (instance == null) {
            instance = new CacheSingleton();
        }
        return instance;
    }

    public void put(String key, Object value, long ttlMillis) {
        long expiryTime = System.currentTimeMillis() + ttlMillis;
        cache.put(key, new CacheItem(value, expiryTime));
    }

    public Object get(String key) {
        CacheItem item = cache.get(key);
        if (item == null) return null;


        if (System.currentTimeMillis() > item.expiryTime) {
            cache.remove(key);
            return null;
        }
        return item.value;
    }

    private static class CacheItem {
        Object value;
        long expiryTime;

        public CacheItem(Object value, long expiryTime) {
            this.value = value;
            this.expiryTime = expiryTime;
        }
    }

    public void remove(String key) {
        cache.remove(key);
    }

    public boolean contains(String key) {
        return get(key) != null;
    }
}
