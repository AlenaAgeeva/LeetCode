package collections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Кэш с ограниченным размером
 * Описание:
 * Реализуйте кэш с ограниченным размером, который будет убирать наименее используемые элементы, когда
 * в нем не хватает места. Создайте класс LRUCache, который поддерживает следующие операции:
 * int get(int key) - возвращает значение, связанное с ключом, если ключ существует в кэше, иначе возвращает -1.
 * void put(int key, int value) - обновляет значение, связанное с ключом, или добавляет элемент в кэш.
 * Если кэш заполнен, удаляет наименее недавно использованный элемент.
 * Условия:
 * Используйте LinkedHashMap для реализации кэша.
 * Обеспечьте время выполнения O(1) для обоих методов.
 */
public class LRUCache {
    private final int capacity;
    private LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }
}
