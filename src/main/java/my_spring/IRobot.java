package my_spring;

import java.rmi.dgc.DGC;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class IRobot {

    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;



    public void cleanRoom() {
        speaker.speak("I started...");
        cleaner.clean();
        speaker.speak("I finished...");



    }
}
