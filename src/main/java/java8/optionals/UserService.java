package java8.optionals;

import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
public class UserService {
    public void printInsuranceName(User user) {
        Optional<User> optional = Optional.ofNullable(user);
        optional.map(User::getCar)
                .map(Car::getInsurance)
                .map(Insurance::getName)
                .ifPresent(System.out::println);
    }
}
