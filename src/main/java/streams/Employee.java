package streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Builder
@Data
public class Employee {
    private int salary;
    private String name;
}
