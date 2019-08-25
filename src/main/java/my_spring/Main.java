package my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ApplicationContext(new JavaConfig("my_spring"));
        context.getObject(IRobot.class).cleanRoom();
//        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
//        iRobot.cleanRoom();
    }
}
