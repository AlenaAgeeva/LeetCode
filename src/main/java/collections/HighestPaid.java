package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Создайте класс Employee, который содержит информацию о сотрудниках (имя, должность, зарплата).
 * Напишите метод, который принимает список сотрудников и возвращает список должностей с максимальной зарплатой.
 * Если несколько должностей имеют одинаковую максимальную зарплату, верните их все.
 * Пример использования:
 * List<Employee> employees = Arrays.asList(
 * new Employee("Alice", "Developer", 70000),
 * new Employee("Bob", "Manager", 90000),
 * new Employee("Charlie", "Developer", 80000),
 * new Employee("David", "Manager", 90000)
 * );
 * List<String> highestPaidPositions = getHighestPaidPositions(employees); // ["Manager", "Manager"]
 */
public class HighestPaid {
    static class Employee {
        private String name;
        private String status;
        private int salary;

        public Employee(String name, String status, int salary) {
            this.name = name;
            this.status = status;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }

    public static List<String> getHighestPaidPositions(List<Employee> employees) {
        int max = employees.stream()
                .mapToInt(Employee::getSalary)
                .max()
                .getAsInt();
        return employees.stream()
                .filter(s -> s.getSalary() == max)
                .map(Employee::getStatus)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Developer", 70000),
                new Employee("Bob", "Manager", 90000),
                new Employee("Charlie", "Developer", 80000),
                new Employee("David", "Manager", 90000)
        );
        List<String> highestPaidPositions = getHighestPaidPositions(employees);
        System.out.println(highestPaidPositions);
    }
}
