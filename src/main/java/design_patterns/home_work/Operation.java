package design_patterns.home_work;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.function.DoubleBinaryOperator;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
@Getter
public enum Operation {

    PLUS("+", Double::sum),
    MINUS("-", (a, b) -> a - b),
    MULTIPLY("*", (a, b) -> a * b),
    DIVIDE("/", (a, b) -> a / b);

    private final String sign;
    private final DoubleBinaryOperator operator;

    @Override
    public String toString() {
        return sign;
    }

}


