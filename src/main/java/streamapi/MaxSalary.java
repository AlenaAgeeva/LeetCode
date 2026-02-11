package streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Для каждого департамента вернуть сотрудника с максимальной зарплатой.
 * Если в департаменте несколько сотрудников с одинаковой максимальной зарплатой —
 * вернуть любого.
 */
public class MaxSalary {
    class Employee {
        private final String department;
        private final String name;
        private final int salary;

        public Employee(String department, String name, int salary) {
            this.department = department;
            this.name = name;
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }
    }

    public static Map<String, Employee> maxSalaryByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)),
                                Optional::get)));
    }
}
