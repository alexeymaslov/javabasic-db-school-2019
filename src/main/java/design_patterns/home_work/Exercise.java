package design_patterns.home_work;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exercise {

private double a;
private double b;
private double answer;
private Operation operation;


    @Override
    public String toString() {
        return a+" "+operation +" "+b + " = "+answer;
    }
}
