package streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtilsTest {

    @Test
    public void totalSalary() {
        List<Employee> employees = asList(
                Employee.builder().name("Vasya").salary(10).build(),
                Employee.builder().name("Vasya").salary(20).build(),
                Employee.builder().name("Vasya").salary(30).build()
        );


        Map<String, Integer> map = EmployeeUtils.mapNameToSalary(employees);
        System.out.println(map);


    }
}