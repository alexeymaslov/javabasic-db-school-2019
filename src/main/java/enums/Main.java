package enums;

import static enums.MaritalStatus.MARRIED;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        MaritalStatus status = MaritalStatus.findByDbCode(3);
        System.out.println(status.getDesc());
        Human human = new Human(MARRIED);
        Human human2 = new Human(MARRIED);

        if (human.getStatus()==human2.getStatus()) {

        }
    }
}
