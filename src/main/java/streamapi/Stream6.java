package streamapi;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Преобразование объектов
 * Создайте класс Person с полями name и age. Напишите метод, который принимает список объектов Person и
 * возвращает строку, содержащую имена всех людей старше 18 лет, разделенные запятыми. Используйте Stream API
 * для фильтрации и преобразования данных.
 * class Person {
 * private String name;
 * private int age;
 * // Конструкторы, геттеры и сеттеры
 * }
 */
public class Stream6 {
    class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static String getAllNames(List<Person> list) {
        return list.stream()
                .filter(p -> p.getAge() > 18)
                .map(Person::getName)
                .collect(Collectors.joining(", "));
    }
}
