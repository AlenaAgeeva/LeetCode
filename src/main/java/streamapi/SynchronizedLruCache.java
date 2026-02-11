package streamapi;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Нужно реализовать LRU-кэш (Least Recently Used) с фиксированной ёмкостью:
 * Операции get и put должны быть O(1) по времени.
 * При переполнении кэша удаляется элемент, который дольше всего не использовался.
 * Реализация должна быть потокобезопасной для простого сценария: несколько потоков читают и пишут.
 */
public class SynchronizedLruCache<K, V> implements LRUCache<K, V> {
    private final Map<K, V> cache;

    public SynchronizedLruCache(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }
        };
    }

    @Override
    public synchronized V get(K key) {
        if (key == null) {
            return null;
        }
        return cache.get(key);
    }

    @Override
    public synchronized void put(K key, V value) {
        cache.put(key, value);
    }
}
