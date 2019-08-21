package streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtils {


    public static Map<String, Integer> mapNameToSalary(List<Employee> employees) {
       return employees.stream()
                .collect(toMap(Employee::getName,Employee::getSalary, Integer::sum));
    }

    public static Map<Seniority, Long> groupBySeniority(List<Employee> employees) {
        return employees.stream().collect(
                groupingBy(employee -> Seniority.findBySalary(employee.getSalary()), counting())
        );
    }

    public static List<String> getNames(List<Employee> employees) {
        return employees.stream()
                .map(Employee::getName)
                .sorted(comparingInt(String::length))
                .collect(Collectors.toList());
    }

    public static int totalSalary(List<Employee> employees) {


        return employees.stream().mapToInt(Employee::getSalary).sum();
    }
}
